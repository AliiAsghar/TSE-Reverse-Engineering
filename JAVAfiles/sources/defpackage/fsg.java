package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private fsg(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static fsg a(String str) {
        char c;
        d.s(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String ap = albo.ap(split[i].trim());
                switch (ap.hashCode()) {
                    case 100571:
                        if (ap.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556653:
                        if (ap.equals(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109757538:
                        if (ap.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 109780401:
                        if (ap.equals("style")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                c = 65535;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c == 3) {
                                i5 = i;
                            }
                        } else {
                            i4 = i;
                        }
                    } else {
                        i3 = i;
                    }
                } else {
                    i2 = i;
                }
                i++;
            } else {
                if (i2 != -1 && i3 != -1 && i5 != -1) {
                    return new fsg(i2, i3, i4, i5, length);
                }
                return null;
            }
        }
    }

    public fsg(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.e = i2;
        this.b = i3;
        this.d = i4;
        this.c = i5;
    }
}
