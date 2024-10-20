package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zkr implements gfa {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ zkr(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [arwe, java.lang.Object] */
    @Override // defpackage.gfa
    public final boolean a(Preference preference, Object obj) {
        akul c;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ?? r0 = this.a;
                    if (akqj.u()) {
                        r0.a(preference, obj);
                    } else {
                        akrc b = ((aksr) this.b).b("PerSubscriptionSettingsFragmentPeer:changeSmscPreference");
                        try {
                            r0.a(preference, obj);
                            b.close();
                        } catch (Throwable th) {
                            try {
                                b.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    return true;
                }
                boolean equals = Boolean.TRUE.equals(obj);
                Object obj2 = this.a;
                zmj zmjVar = (zmj) this.b;
                zmjVar.c((Preference) obj2, equals);
                if (equals) {
                    iji ijiVar = (iji) zmjVar.h.b();
                    qjh.l(ijiVar.b, null, new ikq(ijiVar, (arpe) null, 9, (short[]) null), 3);
                    iji ijiVar2 = (iji) zmjVar.h.b();
                    qjh.l(ijiVar2.b, null, new ikq(ijiVar2, (arpe) null, 7, (byte[]) null), 3);
                    if (((Boolean) ((utz) yig.ai.get()).e()).booleanValue()) {
                        ((iji) zmjVar.h.b()).h(false);
                        iji ijiVar3 = (iji) zmjVar.h.b();
                        qjh.l(ijiVar3.b, null, new ikq(ijiVar3, (arpe) null, 8, (char[]) null), 3);
                    }
                }
                zmjVar.i.ifPresent(new zle(10));
                return true;
            }
            if (!(obj instanceof Boolean)) {
                return false;
            }
            ?? r8 = this.a;
            zfp zfpVar = (zfp) this.b;
            akbo akboVar = (akbo) zfpVar.c.b();
            c = qjh.c(ene.b(r8), arpj.a, arwf.a, new zez(zfpVar, obj, (arpe) null, 3));
            akboVar.j(ahlp.l(c), new ahlp((Boolean) obj), zfpVar.h);
            return true;
        }
        return ((zks) this.a).a.o(obj, this.b);
    }

    public /* synthetic */ zkr(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
