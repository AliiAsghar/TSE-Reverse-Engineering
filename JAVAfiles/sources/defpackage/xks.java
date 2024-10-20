package defpackage;

import android.webkit.WebView;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xks extends arrp implements arqr {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xks(afzk afzkVar, czj czjVar, boolean z, int i) {
        super(1);
        this.d = i;
        this.c = afzkVar;
        this.b = czjVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        int i = this.d;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((bxi) obj).getClass();
                        return new afzo((afzk) this.c, (czj) this.b, this.a);
                    }
                    WebView webView = (WebView) obj;
                    webView.getClass();
                    if (!this.a) {
                        adom i2 = ((adec) this.c).i();
                        if (i2 instanceof afcg) {
                            afcg afcgVar = (afcg) i2;
                            String str = afcgVar.a;
                            if (str.length() > 0 && !d.F(str, webView.getUrl())) {
                                webView.loadUrl(str, aqjn.s(afcgVar.b));
                            }
                        } else if (i2 instanceof afcf) {
                            webView.loadDataWithBaseURL(null, ((afcf) i2).a, null, "utf-8", null);
                        } else {
                            throw new armm();
                        }
                        ((adtl) this.b).p(webView.canGoBack());
                        ((adtl) this.b).q(webView.canGoForward());
                    }
                    return arnb.a;
                }
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                if (this.a) {
                    obj2 = this.b;
                } else {
                    obj2 = this.c;
                }
                dhl.n(dhoVar, (String) obj2);
                return arnb.a;
            }
            dre dreVar = (dre) obj;
            if (this.a && dreVar != null) {
                Object obj3 = this.b;
                ?? r5 = this.c;
                zxy zxyVar = (zxy) arsd.k((Optional) ((mlt) obj3).d);
                if (zxyVar != null) {
                    qjh.l(zxyVar.a, null, new jmn(zxyVar, (Recipient) r5, dreVar.a, (arpe) null, 5), 3);
                }
            } else {
                ((lkd) ((mlt) this.b).h).b(new loh(this.c));
            }
            return arnb.a;
        }
        xlc xlcVar = (xlc) obj;
        xlcVar.getClass();
        AtomicBoolean atomicBoolean = (AtomicBoolean) ((arsb) this.c).a;
        vyv de = yyb.de(xlcVar.toBuilder());
        boolean z2 = ((xlc) ((aozy) de.a).b).f;
        boolean z3 = this.a;
        if (z2 == z3) {
            z = false;
        }
        atomicBoolean.set(z);
        aozy aozyVar = (aozy) de.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ((xlc) aozyVar.b).f = z3;
        if (z3) {
            apct b = apds.b(((xnv) ((zxy) this.b).d).f().toEpochMilli());
            b.getClass();
            aozy aozyVar2 = (aozy) de.a;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            xlc xlcVar2 = (xlc) aozyVar2.b;
            xlcVar2.g = b;
            xlcVar2.b |= 4;
        }
        return de.x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xks(zxy zxyVar, boolean z, arsb arsbVar, int i) {
        super(1);
        this.d = i;
        this.b = zxyVar;
        this.a = z;
        this.c = arsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xks(boolean z, adec adecVar, adtl adtlVar, int i) {
        super(1);
        this.d = i;
        this.a = z;
        this.c = adecVar;
        this.b = adtlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xks(boolean z, Object obj, Object obj2, int i) {
        super(1);
        this.d = i;
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }
}
