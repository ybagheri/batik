/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.extension.svg;

import java.awt.font.FontRenderContext;
import java.awt.geom.Point2D;
import java.text.AttributedCharacterIterator;

import org.apache.batik.gvt.text.TextLayoutFactory;
import org.apache.batik.gvt.text.TextSpanLayout;
/**
 * Factory instance that returns TextSpanLayouts appropriate to
 * FlowRoot instances.
 *
 * @see org.apache.batik.gvt.text.TextSpanLayout
 * @author <a href="mailto:dewese@apache.org">Thomas DeWeese</a>
 * @version $Id: FlowExtTextLayoutFactory.java 475477 2006-11-15 22:44:28Z cam $
 */
public class FlowExtTextLayoutFactory implements TextLayoutFactory {

    /**
     * Returns an instance of TextSpanLayout suitable for rendering the
     * AttributedCharacterIterator.
     *
     * @param aci The character iterator to be laid out
     * @param charMap Indicates how chars in aci map to original
     *                text char array.
     * @param offset The offset position for the text layout.
     * @param frc The font render context to use when creating the text layout.
     */
    public TextSpanLayout createTextLayout(AttributedCharacterIterator aci,
                                           int [] charMap,
                                           Point2D offset,
                                           FontRenderContext frc) {
        return new FlowExtGlyphLayout(aci, charMap, offset, frc);
    }
}


