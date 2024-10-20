package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoir extends Exception {
    public aoir(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US).hashCode();
    }
}
