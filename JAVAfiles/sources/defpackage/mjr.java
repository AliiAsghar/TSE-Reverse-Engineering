package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjr implements yjx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yjx
    public final boolean a(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                xcd xcdVar = (xcd) this.a;
                ((zxy) xcdVar.a.b()).x(i).h(xcdVar.c.getResources().getString(R.string.wap_push_si_pref_key), false);
                return true;
            }
            mjt mjtVar = (mjt) this.a;
            mjtVar.b.x(i).m(mjtVar.a);
            return true;
        }
        mjt mjtVar2 = (mjt) this.a;
        mjtVar2.b.x(i).o(mjtVar2.a);
        return true;
    }
}
