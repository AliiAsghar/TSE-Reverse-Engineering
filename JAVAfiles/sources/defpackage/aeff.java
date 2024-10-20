package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeff {
    public static final /* synthetic */ int a = 0;

    static {
        Object O;
        try {
            System.loadLibrary("tartarus");
        } catch (UnsatisfiedLinkError e) {
            try {
                O = Class.forName("android.app.Application", false, null);
            } catch (Throwable th) {
                O = aqil.O(th);
            }
            if (!armq.d(O)) {
            } else {
                throw e;
            }
        }
    }
}
