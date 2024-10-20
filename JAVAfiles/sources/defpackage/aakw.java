package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aakw implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aakw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ((aalt) obj2).m.f().toEpochMilli();
                qiu.i(akul.g(((woj) obj).m()), new aakw(obj2, 2), andi.a);
                return;
            case 1:
                Context context = (Context) this.a;
                fcp fcpVar = new fcp(context, (byte[]) null);
                fcpVar.g("Share Telephony db");
                fcpVar.h("application/text");
                fcpVar.f((Uri) obj);
                Intent e = fcpVar.e();
                e.setFlags(1);
                akto.n(context, e);
                return;
            case 2:
                ((abbu) ((aalt) this.a).Z.b()).l("Setting a reminder on the last message in this conversation");
                return;
            case 3:
                ykb ykbVar = (ykb) obj;
                aalt aaltVar = (aalt) this.a;
                if (((Optional) aaltVar.A.b()).isPresent()) {
                    ((vhi) ((Optional) aaltVar.A.b()).get()).e(aalt.x(ykbVar));
                    return;
                }
                return;
            case 4:
                aalt.l((luq) obj, (StringBuilder) this.a);
                return;
            case 5:
                aalt.l((luq) obj, (StringBuilder) this.a);
                return;
            case 6:
                xze xzeVar = aalt.c;
                new AlertDialog.Builder((Context) this.a).setTitle("Profile Recurring Metrics").setMessage((String) obj).setCancelable(true).show();
                return;
            case 7:
                aiut.e(new aaki((Boolean) obj, this.a, 19));
                return;
            case 8:
                Bundle bundle = new Bundle();
                bundle.putInt("effectiveSubId", ((ykb) obj).a());
                aaoj aaojVar = new aaoj();
                aaojVar.ak(bundle);
                aaojVar.q(((cj) this.a).a(), "DebugTachyonPhoneRegistrationFragmentPeer");
                return;
            case 9:
                aiut.e(new aaki(this.a, (iug) obj, 18));
                return;
            case 10:
                xze xzeVar2 = aalt.c;
                akto.n((Context) ((zof) this.a).b, (Intent) obj);
                return;
            case 11:
                ykb ykbVar2 = (ykb) obj;
                String str = (String) vbh.b.e();
                boolean isEmpty = TextUtils.isEmpty(str);
                Object obj3 = this.a;
                if (isEmpty) {
                    ((abbu) ((aalt) obj3).Z.b()).l("No configured PIN to verify");
                    return;
                } else {
                    aalt aaltVar2 = (aalt) obj3;
                    aaltVar2.u(ykbVar2, str, new aalk(aaltVar2, str));
                    return;
                }
            case 12:
                xzb.c("Bugle", "Registered successfully with tachyon");
                ((abbu) ((aalt) this.a).Z.b()).l("Successfully refreshed tachyon registration");
                return;
            case 13:
                ((abbu) ((aalt) this.a).Z.b()).l("Successfully cleared participant Tachyon data");
                return;
            case 14:
                Object obj4 = this.a;
                aalt aaltVar3 = (aalt) obj4;
                qiu.i(aaltVar3.j().i(new yui(obj4, (ykb) obj, 9, bArr), aaltVar3.ai), new aagi(obj4, 20), aaltVar3.I);
                return;
            case 15:
                Uri uri = (Uri) obj;
                xze xzeVar3 = aalt.c;
                if (uri == null) {
                    return;
                }
                Context context2 = (Context) this.a;
                fcp fcpVar2 = new fcp(context2, (byte[]) null);
                fcpVar2.g("Share Messages csv");
                fcpVar2.h("text/csv");
                fcpVar2.f(uri);
                Intent e2 = fcpVar2.e();
                e2.setFlags(1);
                akto.n(context2, e2);
                return;
            case 16:
                aaoc.h((Context) this.a, (Uri) obj, false);
                return;
            case 17:
                ((abdc) this.a).g((abcy) obj);
                return;
            case 18:
                ((abdc) this.a).h((abcz) obj);
                return;
            case 19:
                ((aasy) this.a).m.a();
                ((lbj) obj).b();
                return;
            default:
                int i = aasy.r;
                ((lbj) obj).a();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
