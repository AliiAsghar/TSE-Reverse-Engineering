package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ikn implements ancu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v68, types: [java.lang.Object, kpd] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, aneo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r7v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ancu
    public final andc a(ahmn ahmnVar) {
        akul c;
        akul ai;
        akul i;
        String str;
        String str2;
        String F;
        byte[] bArr = null;
        int i2 = 5;
        int i3 = 4;
        int i4 = 6;
        switch (this.b) {
            case 0:
                return new andc(((ikr) this.a).b());
            case 1:
                Object obj = this.a;
                ihr ihrVar = (ihr) obj;
                return new andc(akul.g(albo.bF(ihrVar.b.b.get().h().h(new qda(10), andi.a), ihrVar.b.d().h(new icj(obj, i3), ihrVar.h))).h(new icj(obj, i2), ihrVar.g).e(apba.class, new icj(obj, i4), ihrVar.g));
            case 2:
                iji ijiVar = (iji) this.a;
                c = qjh.c(ijiVar.b, arpj.a, arwf.a, new ikq(ijiVar, (arpe) null, 6));
                return new andc(c);
            case 3:
                return new andc(((wzp) ((kwu) this.a).a.b()).e());
            case 4:
                Object obj2 = this.a;
                rae raeVar = (rae) obj2;
                if (((Boolean) raeVar.i.b()).booleanValue()) {
                    ai = ((kkc) raeVar.e).b();
                } else {
                    ai = aktp.ai(new kva(obj2, i3), raeVar.f);
                }
                akul ai2 = aktp.ai(new kva(obj2, i2), raeVar.f);
                akul ai3 = aktp.ai(new kva(obj2, i4), raeVar.f);
                return new andc(aktp.ap(ai, ai2, ai3).h(new hbd(ai, ai2, ai3, i4), raeVar.g));
            case 5:
                return new andc(((qif) this.a).b.get().h());
            case 6:
                return new andc(this.a.b());
            case 7:
                return new andc(((usk) this.a).c());
            case 8:
                usk uskVar = (usk) this.a;
                return new andc(akul.g(((aiwu) uskVar.b).a()).h(new tvd(19), uskVar.f));
            case 9:
                Object obj3 = this.a;
                wgd wgdVar = (wgd) obj3;
                if (!wgdVar.k.get()) {
                    i = aktp.ag(Optional.empty());
                } else {
                    i = wgdVar.h.c().i(new vek(obj3, 20), wgdVar.e);
                }
                return new andc(i);
            case 10:
                return new andc(((yul) this.a).g());
            case 11:
                yya yyaVar = (yya) this.a;
                akul a = yyaVar.c.a();
                akul i5 = a.i(new xdg(17), yyaVar.d);
                return new andc(aktp.ap(a, i5).h(new yxs(i5, a, i4, bArr), yyaVar.d));
            case 12:
                Object obj4 = this.a;
                return new andc(aktp.ai(new ytr(obj4, i3), (Executor) ((yyp) obj4).d.b()));
            case 13:
                return new andc(((zhw) this.a).m.b());
            case 14:
                return new andc(((zke) this.a).d.h());
            case 15:
                boolean booleanValue = ((Boolean) zke.a.e()).booleanValue();
                wyp wypVar = (wyp) this.a;
                List h = ((ryg) wypVar.f).h();
                ArrayList arrayList = new ArrayList();
                if (((ryg) wypVar.f).a() > 0) {
                    alur it = ((alog) h).iterator();
                    while (it.hasNext()) {
                        qwm qwmVar = (qwm) it.next();
                        Optional j = ((yjy) wypVar.b.b()).h(qwmVar.e()).j(false);
                        if (!j.isPresent()) {
                            str = "";
                        } else {
                            str = j.get().F().a;
                        }
                        if (!qwmVar.j()) {
                            if (booleanValue) {
                                Optional j2 = ((zbl) wypVar.e.b()).a(qwmVar.e()).j();
                                str2 = str;
                                if (j2.isPresent()) {
                                    str2 = str;
                                    if (!TextUtils.isEmpty(j2.get())) {
                                        str2 = j2.get();
                                    }
                                }
                            } else {
                                String f = ((zxy) wypVar.g.b()).x(qwmVar.e()).f(((Context) wypVar.d).getString(R.string.mms_phone_number_pref_key), str);
                                str2 = str;
                                if (!TextUtils.isEmpty(f)) {
                                    str2 = f;
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                F = ((Context) wypVar.d).getString(R.string.sim_settings_unknown_number);
                            } else {
                                F = wyp.F(str2);
                            }
                            String h2 = qwmVar.h();
                            if (TextUtils.isEmpty(h2)) {
                                h2 = ((Context) wypVar.d).getString(R.string.sim_settings_unknown_name);
                            }
                            arrayList.add(new zma(qwmVar.e(), h2, ((msk) wypVar.c.b()).t(wyp.F(F), qwmVar.e())));
                        }
                    }
                } else {
                    arrayList.add(new zma(-1, ((Context) wypVar.d).getString(R.string.advanced_settings_activity_title), ((msk) wypVar.c.b()).t("", -1)));
                }
                return new andc(aktp.ag(arrayList));
            case 16:
                return new andc(this.a.a());
            case 17:
                return new andc(akul.g(((znp) this.a).b.schedule(new vcr(18), ((Integer) zus.a.e()).intValue(), TimeUnit.MILLISECONDS)));
            case 18:
                Object obj5 = this.a;
                return new andc(aktp.ai(new ytr(obj5, 11), ((zwx) obj5).a));
            case 19:
                Object obj6 = this.a;
                return new andc(aktp.ai(new ytr(obj6, 12), ((zxf) obj6).b));
            default:
                zxm zxmVar = (zxm) this.a;
                return new andc(zxmVar.a().h().h(new zms(8), zxmVar.d));
        }
    }
}
