package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vna implements vlf {
    private final /* synthetic */ int a;

    public vna(int i) {
        this.a = i;
    }

    @Override // defpackage.vlf
    public final /* synthetic */ vla a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                vnd vndVar = (vnd) obj;
                vndVar.getClass();
                aozy createBuilder = vla.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vla vlaVar = (vla) createBuilder.b;
                vlaVar.d = vndVar;
                vlaVar.c = 5;
                apag s = createBuilder.s();
                s.getClass();
                return (vla) s;
            }
            apag s2 = vla.a.createBuilder().s();
            s2.getClass();
            return (vla) s2;
        }
        vnc vncVar = (vnc) obj;
        vncVar.getClass();
        aozy createBuilder2 = vla.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        vla vlaVar2 = (vla) createBuilder2.b;
        vlaVar2.d = vncVar;
        vlaVar2.c = 4;
        apag s3 = createBuilder2.s();
        s3.getClass();
        return (vla) s3;
    }

    @Override // defpackage.vlf
    public final /* synthetic */ Object c(vla vlaVar) {
        vnc vncVar;
        vnd vndVar;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                vlaVar.getClass();
                if (vlaVar.c == 5) {
                    vndVar = (vnd) vlaVar.d;
                } else {
                    vndVar = vnd.a;
                }
                vndVar.getClass();
                return vndVar;
            }
            vlaVar.getClass();
            return null;
        }
        vlaVar.getClass();
        if (vlaVar.c == 4) {
            vncVar = (vnc) vlaVar.d;
        } else {
            vncVar = vnc.a;
        }
        vncVar.getClass();
        return vncVar;
    }

    @Override // defpackage.vlf
    public final /* synthetic */ alog b(alog alogVar) {
        return alogVar;
    }
}
