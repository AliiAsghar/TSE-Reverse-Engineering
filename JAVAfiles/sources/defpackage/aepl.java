package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepl extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepl(ahiy ahiyVar, Uri uri, String[] strArr, String str, arqr arqrVar, int i) {
        super(1);
        this.g = i;
        this.e = ahiyVar;
        this.c = uri;
        this.d = strArr;
        this.f = str;
        this.b = "date ASC";
        this.a = arqrVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, aki] */
    /* JADX WARN: Type inference failed for: r0v37, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r5v0, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cpm, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i;
        int i2 = this.g;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    CancellationSignal cancellationSignal = (CancellationSignal) obj;
                    cancellationSignal.getClass();
                    ?? r13 = this.a;
                    Object obj2 = this.b;
                    Object obj3 = this.f;
                    Cursor o = ((ansy) ((ahiy) this.e).a).o((Uri) this.c, (String[]) this.d, (String) obj3, null, (String) obj2, cancellationSignal);
                    try {
                        alog d = akec.d(o, r13);
                        armd.i(o, null);
                        return d;
                    } finally {
                    }
                } else {
                    Context context = (Context) obj;
                    context.getClass();
                    WebView webView = (WebView) this.a.a(context);
                    this.d.a(webView);
                    ?? r0 = this.c;
                    boolean j = dqs.j(r0.e());
                    boolean i3 = dqs.i(r0.e());
                    int i4 = -2;
                    if (true != j) {
                        i = -2;
                    } else {
                        i = -1;
                    }
                    if (true == i3) {
                        i4 = -1;
                    }
                    webView.setLayoutParams(new ViewGroup.LayoutParams(i, i4));
                    webView.setWebChromeClient((WebChromeClient) this.f);
                    webView.setWebViewClient((WebViewClient) this.b);
                    WebSettings settings = webView.getSettings();
                    settings.getClass();
                    settings.setJavaScriptEnabled(true);
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    this.e.h(webView);
                    return webView;
                }
            } else {
                aos aosVar = (aos) obj;
                aosVar.getClass();
                aor.a(aosVar, "spacer", yzh.a, 2);
                if (((yzr) this.e).a()) {
                    aor.a(aosVar, "create_group", new cdj(1352426791, true, new jjs(this.e, 20)), 2);
                }
                Object obj4 = this.b;
                if (((zaj) obj4).a) {
                    aor.a(aosVar, "message_business", new cdj(147337886, true, new yzl(obj4, 1)), 2);
                }
                if (!((aeqm) this.a).b.isEmpty()) {
                    aor.a(aosVar, "favorite", new cdj(-1568260705, true, new yzl(this.a, 0)), 2);
                }
                if (!this.d.isEmpty()) {
                    ?? r02 = this.d;
                    aor.b(aosVar, r02.size(), yzm.b, new cdj(2066975337, true, new jle(r02, 9)), 4);
                }
                Object obj5 = this.f;
                if (obj5 != null) {
                    aor.a(aosVar, "penpal", new cdj(-704490591, true, new yzl(obj5, 2)), 2);
                }
                Object obj6 = this.c;
                aor.b(aosVar, ((gqg) obj6).b(), new geg(yzm.a, obj6, 0), new cdj(1802673685, true, new jle(obj6, 10)), 4);
                return arnb.a;
            }
        } else {
            long j2 = ((cjn) obj).a;
            Object obj7 = this.c;
            arqr arqrVar = ((aepp) this.b).d;
            arsb arsbVar = (arsb) this.a;
            arsbVar.a = arqrVar.a(obj7);
            arrn.J(this.d, null, null, new aemw(arsbVar, (byn) this.e, (cpm) this.f, (arpe) null, 2), 3);
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepl(arqr arqrVar, arqr arqrVar2, aki akiVar, afca afcaVar, afce afceVar, byn bynVar, int i) {
        super(1);
        this.g = i;
        this.a = arqrVar;
        this.d = arqrVar2;
        this.c = akiVar;
        this.f = afcaVar;
        this.b = afceVar;
        this.e = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepl(arsb arsbVar, aepp aeppVar, Context context, arwe arweVar, byn bynVar, cpm cpmVar, int i) {
        super(1);
        this.g = i;
        this.a = arsbVar;
        this.b = aeppVar;
        this.c = context;
        this.d = arweVar;
        this.e = bynVar;
        this.f = cpmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepl(yzr yzrVar, zaj zajVar, aeqm aeqmVar, List list, zae zaeVar, gqg gqgVar, int i) {
        super(1);
        this.g = i;
        this.e = yzrVar;
        this.b = zajVar;
        this.a = aeqmVar;
        this.d = list;
        this.f = zaeVar;
        this.c = gqgVar;
    }
}
