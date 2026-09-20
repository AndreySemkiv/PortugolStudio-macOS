package br.univali.ps.ui.editor;

import org.fife.ui.rtextarea.CaretStyle;
import org.fife.ui.rtextarea.ConfigurableCaret;
import org.fife.ui.rtextarea.RTextArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PSTextAreaTest
{
    @Test
    public void mantemCursorVerticalNosModosInserirESobrescrever()
    {
        PSTextArea textArea = new PSTextArea();
        ConfigurableCaret caret = (ConfigurableCaret) textArea.getCaret();

        textArea.setTextMode(RTextArea.INSERT_MODE);
        assertEquals(CaretStyle.THICK_VERTICAL_LINE_STYLE, caret.getStyle());

        textArea.setTextMode(RTextArea.OVERWRITE_MODE);
        assertEquals(CaretStyle.THICK_VERTICAL_LINE_STYLE, caret.getStyle());
    }
}
