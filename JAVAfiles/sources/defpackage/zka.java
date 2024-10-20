package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class zka implements znn {
    final /* synthetic */ zjx a;

    public zka(zjx zjxVar) {
        this.a = zjxVar;
    }

    @Override // defpackage.znn
    public final void a(String str) {
        akul d;
        if (!str.equals(this.a.t)) {
            zkb zkbVar = this.a.r;
            if ((zkbVar.b & 32) == 0 || !str.equals(zkbVar.h)) {
                if (TextUtils.isEmpty(str)) {
                    d = this.a.b().b();
                } else {
                    d = this.a.b().d(str);
                }
                zjx zjxVar = this.a;
                zjxVar.P.j(ahlp.l(d), new ahlp(zjxVar.l), zjxVar.w);
            }
        }
    }
}
