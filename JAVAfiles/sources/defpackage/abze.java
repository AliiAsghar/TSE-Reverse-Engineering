package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abze extends Exception {
    public abze(int i) {
        super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i)));
    }
}
