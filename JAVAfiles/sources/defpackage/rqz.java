package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class rqz {
    private String a;

    public void e(String str) {
        if (!h() && str != null) {
            this.a = str;
            return;
        }
        throw new IllegalStateException();
    }

    public void f(String str) {
        if (i(str)) {
            this.a = null;
            g();
            return;
        }
        throw new IllegalStateException();
    }

    protected abstract void g();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean h() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public final boolean i(String str) {
        return str.equals(this.a);
    }
}
