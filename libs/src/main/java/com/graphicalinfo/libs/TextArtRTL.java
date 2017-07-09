package com.graphicalinfo.libs;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


/**
 * Created by ayoob on 09/07/2017.
 */

public class TextArtRTL extends android.support.v7.widget.AppCompatTextView
{
    public TextArtRTL(Context context) {
        super(context);
        init(context);
    }

    public TextArtRTL(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextArtRTL(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
      Typeface typeface = FontCache.getTypeface(context, "fonts/Open_Sans_Condensed/OpenSansCondensed-Light.ttf");
        setTypeface(typeface);
    }
}
