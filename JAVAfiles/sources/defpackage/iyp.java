package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyp extends hb {
    final /* synthetic */ alog a;
    final /* synthetic */ alog b;

    public iyp(alog alogVar, alog alogVar2) {
        this.a = alogVar;
        this.b = alogVar2;
    }

    @Override // defpackage.hb
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.hb
    public final int b() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hb
    public final boolean d(int i, int i2) {
        if (((rse) this.b.get(i2)).equals(rse.SETTING_XMS_MODE)) {
            return false;
        }
        return e(i, i2);
    }

    @Override // defpackage.hb
    public final boolean e(int i, int i2) {
        if (this.a.get(i) == this.b.get(i2)) {
            return true;
        }
        return false;
    }
}
