package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xti implements utv, adjd, adjb, acmr {
    public final armf a;
    private final arwe b;

    public xti(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = arweVar;
    }

    @Override // defpackage.utv
    public final void a() {
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#onBuglePhenotypeFlagChanged");
        try {
            ((xtj) this.a.b()).a();
            armd.i(e, null);
        } finally {
        }
    }

    public final akul c(msh mshVar) {
        akul c;
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#isTachygramAvailable");
        try {
            c = qjh.c(this.b, arpj.a, arwf.a, new uog(mshVar, this, (arpe) null, 19));
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    public final String d() {
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#getTransportNameForLogging");
        try {
            xtg xtgVar = (xtg) aqjn.Y(((xtj) this.a.b()).g());
            if (xtgVar == null) {
                xtgVar = xtg.a;
            }
            String str = xtgVar.g;
            armd.i(e, null);
            return str;
        } finally {
        }
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return true;
    }

    @Override // defpackage.adjb
    public final void fP(String str, adjl adjlVar) {
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#onRcsAvailabilityUpdate");
        try {
            xtj xtjVar = (xtj) this.a.b();
            aqjn.e(new adiw(str));
            xtjVar.b();
            armd.i(e, null);
        } finally {
        }
    }

    @Override // defpackage.adjd
    public final void fQ(String str, Optional optional) {
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#onRcsConfigurationUpdate");
        try {
            xtj xtjVar = (xtj) this.a.b();
            aqjn.e(new adiw(str));
            xtjVar.b();
            armd.i(e, null);
        } finally {
        }
    }

    @Override // defpackage.acmr
    public final void s() {
        akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#onSystemBound");
        try {
            ((xtj) this.a.b()).s();
            armd.i(e, null);
        } finally {
        }
    }
}
