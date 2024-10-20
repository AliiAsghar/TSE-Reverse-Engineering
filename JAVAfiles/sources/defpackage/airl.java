package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airl {
    public final Object a = new Object();
    public final Object b = new Object();
    public airk c;
    public airk d;
    public final aiqj e;

    public airl(aiqj aiqjVar) {
        this.e = aiqjVar;
    }

    public static final void b() {
        throw new IllegalStateException("metadataVersion == null. ExpressiveStickerClient#maybeSyncWithServer() must be invoked first.");
    }

    public final String a() {
        String str;
        synchronized (this.a) {
            airk airkVar = this.c;
            if (airkVar == null) {
                str = null;
            } else {
                str = airkVar.b;
            }
        }
        return str;
    }
}
