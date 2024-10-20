package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adli extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adli(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithoutAuthState";
    }

    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        super.b();
        try {
            admw a = admx.a(apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, Optional.ofNullable(this.a.r));
            String v = this.a.v();
            adlw adlwVar = this.a;
            adlx adlxVar = adlwVar.v;
            Context context = adlwVar.s;
            String str = adlwVar.n;
            String str2 = adlwVar.p;
            Configuration f = ((adnk) adlxVar.d).f(str);
            adnw a2 = adlxVar.a(context, str2, str);
            try {
                Object obj = adlxVar.b;
                Optional of = Optional.of(a);
                advr.o("Using network authenticated config server query", new Object[0]);
                admw admwVar = (admw) of.orElse(aday.b());
                admwVar.d(aday.c(((aday) obj).z(v, f, a2, new adtl(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), admwVar).build().toString()));
            } catch (IOException e) {
                advr.i(e, "Error while building ACS URL", new Object[0]);
            }
            List w = this.a.w();
            a.b("Cookie", adjn.a(w));
            adlw adlwVar2 = this.a;
            if (adlwVar2.al(adlwVar2.n)) {
                adlw adlwVar3 = this.a;
                String c = adlwVar3.v.c(adlwVar3.p, adlwVar3.n);
                adkf a3 = adkg.a();
                a3.c(c);
                a3.e = Optional.ofNullable(this.a.r);
                adlw.ax(a3, w);
                if (((Boolean) adkh.c.a()).booleanValue()) {
                    a.h(3);
                    if (((Boolean) adkh.b.a()).booleanValue()) {
                        adlw adlwVar4 = this.a;
                        a3.d = adlwVar4.v.b(adlwVar4.s, adlwVar4.n);
                        this.a.aH.h(a3.a(), a);
                    }
                } else {
                    adlw adlwVar5 = this.a;
                    if (adlwVar5.ae.c(adlwVar5.n).M) {
                        this.a.aH.i(a3.a(), a);
                    }
                }
            }
            this.a.V(adjj.MSG_SEND_CONFIG_REQUEST, a.a());
        } catch (MalformedURLException e2) {
            this.a.L(apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE);
            this.a.D.e("Failed to request without authentication when building query. MalformedUrl encountered. %s", advq.URI.c(e2));
            this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE);
        }
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        this.a.J("RequestWithoutAuthState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 41) {
            if (ordinal != 43) {
                if (ordinal != 44) {
                    return super.o(message, adjjVar);
                }
                return false;
            }
            adlw adlwVar = this.a;
            adlwVar.x.b(adlwVar.n);
            adlw adlwVar2 = this.a;
            adlwVar2.ac(adlwVar2.am);
            adlw adlwVar3 = this.a;
            adlwVar3.u.a((HttpURLConnection) message.obj, null, "RequestWithoutAuthState");
            return true;
        }
        this.a.N((HttpURLConnection) message.obj, message.arg2, this);
        return true;
    }
}
