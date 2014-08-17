/*
 * #%L
 * NICTA t3as MetaMap Tagger
 * %%
 * Copyright (C) 2014 NICTA
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining
 * it with H2, GWT, or JavaBeans Activation Framework (JAF) (or a
 * modified version of those libraries), containing parts covered by the
 * terms of the H2 License, the GWT Terms, or the Common Development and
 * Distribution License (CDDL) version 1.0 ,the licensors of this Program
 * grant you additional permission to convey the resulting work.
 * #L%
 */
package org.t3as.metamap.options;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class MetaMapOptionsTest {

    @Test
    public void test() throws Exception {
        final Option o1 = MetaMapOptions.strToOpt("foobar");
        assertNull(o1);

        final Option o2 = MetaMapOptions.strToOpt("word_sense_disambiguation");
        assertNotNull(o2);
        assertEquals(o2.getClass(), WordSenseDisambiguation.class);
        assertEquals(o2.name(), "word_sense_disambiguation");
        assertNull(o2.param());
        assertEquals(o2.toMmOptStr(), "--word_sense_disambiguation");

        final Option o3 = MetaMapOptions.strToOpt("composite_phrases");
        assertNull(o3);

        final Option o4 = MetaMapOptions.strToOpt("composite_phrases X");
        assertNull(o4);

        final Option o5 = MetaMapOptions.strToOpt("composite_phrases 20");
        assertNull(o5);

        final Option o6 = MetaMapOptions.strToOpt("composite_phrases 4");
        assertNotNull(o6);
        assertEquals(o6.getClass(), CompositePhrases.class);
        assertEquals(o6.toMmOptStr(), "--composite_phrases 4");
    }
}
