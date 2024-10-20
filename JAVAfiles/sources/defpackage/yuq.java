package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Collection;
import java.util.function.Function;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yuq implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ yuq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r14v50, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v76, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v79, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        boolean z;
        int i = 0;
        int i2 = 1;
        switch (this.c) {
            case 0:
                String str = (String) obj;
                str.getClass();
                apbo apboVar = ((yuf) this.b).e;
                if (apboVar.containsKey(str)) {
                    return ((yuu) this.a).c.b(((yub) apboVar.get(str)).b);
                }
                throw new IllegalArgumentException();
            case 1:
                yuf yufVar = (yuf) obj;
                long epochMilli = ((yul) this.b).d.f().toEpochMilli();
                aozy builder = yufVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ?? r4 = this.a;
                ((yuf) builder.b).g = epochMilli;
                for (yuk yukVar : r4) {
                    yub aj = builder.aj(yukVar.a, yub.a);
                    xyo c = yul.b.c();
                    c.H("Adding new C11N token for msisdn");
                    c.w("msisdn", yukVar.a, 2);
                    c.L("imsi", yukVar.b);
                    c.A("new entry", yub.a.equals(aj));
                    c.q();
                    aozy builder2 = aj.toBuilder();
                    String str2 = yukVar.c;
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    ((yub) builder2.b).e = str2;
                    yub yubVar = (yub) builder2.s();
                    yul.b.o("Associating msisdn with updated registration data");
                    builder.am(yukVar.a, yubVar);
                    boolean ak = builder.ak(yukVar.b);
                    xyo c2 = yul.b.c();
                    c2.H("Associating IMSI with msisdn from C11N");
                    c2.w("msisdn", yukVar.a, 2);
                    c2.L("imsi", yukVar.b);
                    c2.A("new association", !ak);
                    c2.q();
                    builder.al(yukVar.b, yukVar.a);
                }
                if (yufVar.h) {
                    yty ytyVar = ((yuf) builder.b).j;
                    if (ytyVar == null) {
                        ytyVar = yty.a;
                    }
                    aozy builder3 = ytyVar.toBuilder();
                    if (!builder3.b.isMutable()) {
                        builder3.u();
                    }
                    ((yty) builder3.b).e = yty.emptyProtobufList();
                    yty ytyVar2 = yufVar.j;
                    if (ytyVar2 == null) {
                        ytyVar2 = yty.a;
                    }
                    Collection j = yul.j(ytyVar2.e, apds.b(epochMilli));
                    if (!builder3.b.isMutable()) {
                        builder3.u();
                    }
                    yty ytyVar3 = (yty) builder3.b;
                    apax apaxVar = ytyVar3.e;
                    if (!apaxVar.c()) {
                        ytyVar3.e = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(j, ytyVar3.e);
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    yuf yufVar2 = (yuf) builder.b;
                    yty ytyVar4 = (yty) builder3.s();
                    ytyVar4.getClass();
                    yufVar2.j = ytyVar4;
                    yufVar2.b |= 2;
                }
                return builder;
            case 2:
                String str3 = (String) obj;
                yty ytyVar5 = ((yuf) this.b).j;
                if (ytyVar5 == null) {
                    ytyVar5 = yty.a;
                }
                str3.getClass();
                apbo apboVar2 = ytyVar5.f;
                if (apboVar2.containsKey(str3)) {
                    return ((yuu) this.a).c.b(((ytz) apboVar2.get(str3)).b);
                }
                throw new IllegalArgumentException();
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                apbo apboVar3 = ((yuf) this.b).e;
                if (apboVar3.containsKey(str4)) {
                    Object obj2 = this.a;
                    Stream stream = Collection.EL.stream(((yub) apboVar3.get(str4)).b);
                    yup yupVar = ((yuu) obj2).c;
                    yupVar.getClass();
                    Stream map = stream.map(new yur(yupVar, i));
                    int i3 = alog.d;
                    return aktp.ad((Iterable) map.collect(alls.a));
                }
                throw new IllegalArgumentException();
            case 4:
                tbd tbdVar = (tbd) obj;
                tbdVar.j(this.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 13050) {
                    agnc.t("video_reachability", intValue);
                }
                tbdVar.U(new agmf("participants.video_reachability", 4, tbd.X(this.b), true));
                return tbdVar;
            case 5:
                Object obj3 = this.b;
                yxj yxjVar = (yxj) obj3;
                MessageCoreData messageCoreData = yxjVar.a;
                qei qeiVar = (qei) obj;
                d.s(messageCoreData.cB());
                Uri uri = yxjVar.b;
                int i4 = yxjVar.c;
                Object obj4 = this.a;
                yxr yxrVar = (yxr) obj4;
                Optional a = yxrVar.e.a(i4, uri, messageCoreData.s());
                if (a.isPresent()) {
                    return aktp.ag(a.get());
                }
                return aktp.ai(new xfb(obj4, obj3, 20), yxrVar.a).i(new vug(obj4, obj3, qeiVar, messageCoreData, 18, null), yxrVar.b);
            case 6:
                Object obj5 = this.a;
                Object obj6 = this.b;
                MessageCoreData messageCoreData2 = ((yxl) obj6).a;
                yxr yxrVar2 = (yxr) obj5;
                return aktp.ai(new yxs(obj5, messageCoreData2, i2), yxrVar2.a).i(new vug(obj5, messageCoreData2, obj6, obj, 17), yxrVar2.b);
            case 7:
                Pair pair = (Pair) obj;
                aacp aacpVar = (aacp) this.b;
                wyp wypVar = aacpVar.D;
                if (wypVar != null) {
                    Spannable spannable = (Spannable) pair.first;
                    if (pair.second != null && !((alor) pair.second).isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (aacpVar.D == wypVar) {
                        Object obj7 = this.a;
                        aacpVar.D = null;
                        boolean z2 = z | aacpVar.s;
                        aacpVar.s = z2;
                        aacpVar.k.setFocusable(z2);
                        aacpVar.k.setFocusableInTouchMode(aacpVar.s);
                        if (obj7 != null) {
                            BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), BackgroundColorSpan.class);
                            int length = backgroundColorSpanArr.length;
                            while (i < length) {
                                BackgroundColorSpan backgroundColorSpan = backgroundColorSpanArr[i];
                                int spanStart = spannable.getSpanStart(backgroundColorSpan);
                                int spanEnd = spannable.getSpanEnd(backgroundColorSpan);
                                int spanFlags = spannable.getSpanFlags(backgroundColorSpan);
                                if (((ClickableSpan[]) spannable.getSpans(spanStart, spanEnd, ClickableSpan.class)).length != 0) {
                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(aacpVar.b());
                                    spannable.setSpan(new BackgroundColorSpan(aacpVar.a()), spanStart, spanEnd, spanFlags);
                                    spannable.setSpan(foregroundColorSpan, spanStart, spanEnd, spanFlags);
                                }
                                i++;
                            }
                        }
                        aacpVar.v = wypVar.c;
                        aacpVar.k.setText(spannable);
                        ahnz.t(aacpVar.k);
                        if (aacpVar.k.getLinksClickable()) {
                            if (((Boolean) aaci.a.e()).booleanValue()) {
                                aacpVar.k.setLongClickable(true);
                            }
                            ahnz.u(aacpVar.k, LinkMovementMethod.getInstance());
                            if (aacpVar.i.z().b() && aacpVar.i.aW()) {
                                TextView textView = aacpVar.k;
                                ahnz.u(textView, new abdd(aacpVar.i, aacpVar.a, textView.getMovementMethod()));
                            } else if (((zhi) aacpVar.f.b()).a(aacpVar.i)) {
                                zhi zhiVar = (zhi) aacpVar.f.b();
                                rry rryVar = aacpVar.i;
                                TextView textView2 = aacpVar.k;
                                znj znjVar = (znj) zhiVar.b.b();
                                ?? r3 = znjVar.a;
                                ?? r14 = znjVar.b;
                                MovementMethod movementMethod = textView2.getMovementMethod();
                                rryVar.getClass();
                                movementMethod.getClass();
                                ahnz.u(textView2, new yyl(r3, r14, rryVar, movementMethod));
                            }
                        }
                        zof zofVar = aacpVar.h.ab;
                        if (((xvy) zofVar.b).i()) {
                            ((MessageAttachmentsView) ((xvy) zofVar.b).b()).d();
                        }
                    }
                }
                return null;
            case 8:
                return ((Context) this.b).getString(R.string.rcs_success_popup_title_multi_sim_v2, ((xwr) ((abai) this.a).g.b()).b(((msh) obj).F().toString().replaceAll("\\s", " ")));
            case 9:
                tgq tgqVar = (tgq) obj;
                tgqVar.b(this.a);
                tgqVar.c(((xnv) this.b).f().toEpochMilli());
                return tgqVar;
            case 10:
                String str5 = (String) obj;
                Object obj8 = this.a;
                try {
                    return ((psz) ((abcp) obj8).b.b()).f(((msk) ((abcp) obj8).c.b()).r(str5));
                } catch (psx e) {
                    Object obj9 = this.b;
                    xyo e2 = abcp.a.e();
                    e2.b(((rry) obj9).t());
                    e2.H("Error when getting cached capability");
                    e2.r(e);
                    return Optional.empty();
                }
            case 11:
                return ((acop) obj).d.a((String) this.a, ((acno) this.b).n);
            case 12:
                adqu adquVar = (adqu) obj;
                acyz acyzVar = adbf.a;
                try {
                    return ((addi) this.b).d((Conversation) this.a, adquVar);
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Error converting Instant message to Message", e3);
                }
            case 13:
                return adwf.l((String) obj, (ImsConfiguration) this.b, ((adrc) this.a).m);
            case 14:
                return adwf.l((String) obj, (ImsConfiguration) this.b, ((adrc) this.a).m);
            default:
                aqyv j2 = aqyv.j(aqnf.a.get().a((Context) this.b), 443, (CronetEngine) obj);
                j2.g(new arll((aqut) this.a, 0));
                j2.k(8448);
                return j2.a();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ yuq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
