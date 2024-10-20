package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivs implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        View view;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ixd ixdVar = (ixd) obj;
                if (xwr.h(ixdVar.q()) && (view = ixdVar.bR) != null) {
                    xwr.i(view, ixdVar.M.z().getQuantityString(R.plurals.deleted_toast_message, 1, 1));
                }
                akrc b = ixdVar.aC.b("ConversationFragmentPeer: Delete Message");
                try {
                    amfe amfeVar = amfe.CONVERSATION_FROM_MORE_BUTTON;
                    if (((ixd) obj).aj.b(((ixd) obj).q())) {
                        alvw g = ixd.a.g();
                        g.X(alwp.a, "Bugle");
                        alvg alvgVar = (alvg) g;
                        alvgVar.X(ydl.p, ((ixd) obj).L);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "deleteConversation", 5433, "ConversationFragmentPeer.java")).q("ConversationFragment: UI initiated deletion of conversation");
                        ijw ijwVar = ((ixd) obj).cz;
                        ConversationIdType conversationIdType = ((ixd) obj).L;
                        ((mgv) ijwVar.h.b()).e(mgv.m);
                        ((mgv) ijwVar.h.b()).e(mgv.n);
                        qox a = qoy.a();
                        a.b(conversationIdType);
                        a.f(amfeVar);
                        ((qoz) ijwVar.i.b()).a(a.a());
                        ((ixd) obj).O.c("Bugle.UI.DeleteConversation");
                        ((ixd) obj).O();
                    } else {
                        ((ixd) obj).aQ();
                    }
                    b.close();
                    return;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 1:
                Object obj2 = this.a;
                ((gev) obj2).ag = i;
                ((gff) obj2).ak = -1;
                dialogInterface.dismiss();
                return;
            case 2:
                ((izx) ((izz) this.a).a).d();
                return;
            case 3:
                jat jatVar = (jat) this.a;
                jatVar.b.a(jatVar.f.get(((jam) jatVar.g).a));
                return;
            case 4:
                kma kmaVar = (kma) this.a;
                akbo akboVar = (akbo) kmaVar.i.b();
                jxv jxvVar = (jxv) kmaVar.h.b();
                kme kmeVar = kmaVar.p;
                kmeVar.getClass();
                final alog alogVar = kmeVar.c;
                d.s(true ^ alogVar.isEmpty());
                akrh e = aktp.e("ParticipantMessageListDonator#donate");
                try {
                    akul i2 = aktp.ai(new Callable() { // from class: kml
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            alog alogVar2;
                            int i3;
                            alog alogVar3;
                            int i4;
                            kmk kmkVar;
                            aozy createBuilder = apku.a.createBuilder();
                            alog alogVar4 = alog.this;
                            int size = alogVar4.size();
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < size) {
                                kmk kmkVar2 = (kmk) alogVar4.get(i6);
                                if (kmkVar2.d == 0) {
                                    alogVar2 = alogVar4;
                                    i3 = size;
                                } else {
                                    aozy createBuilder2 = apkt.a.createBuilder();
                                    int i7 = i5;
                                    while (i7 < kmkVar2.a()) {
                                        if (kmkVar2.e(i7)) {
                                            Spanned c = kmkVar2.c(i7);
                                            String str = kmkVar2.a;
                                            long b2 = kmkVar2.b(i7);
                                            kky kkyVar = ((kmj) kmkVar2.c.get(i7)).d;
                                            uuf uufVar = kmr.a;
                                            RedactedSpan[] redactedSpanArr = (RedactedSpan[]) c.getSpans(i5, c.length(), RedactedSpan.class);
                                            aozy createBuilder3 = apkz.a.createBuilder();
                                            String obj3 = c.toString();
                                            if (!createBuilder3.b.isMutable()) {
                                                createBuilder3.u();
                                            }
                                            apkz apkzVar = (apkz) createBuilder3.b;
                                            obj3.getClass();
                                            apkzVar.b = obj3;
                                            int length = redactedSpanArr.length;
                                            alogVar3 = alogVar4;
                                            int i8 = 0;
                                            while (true) {
                                                int i9 = 3;
                                                if (i8 < length) {
                                                    RedactedSpan redactedSpan = redactedSpanArr[i8];
                                                    int i10 = length;
                                                    aozy createBuilder4 = apky.a.createBuilder();
                                                    int i11 = size;
                                                    int ordinal = redactedSpan.a.ordinal();
                                                    kmk kmkVar3 = kmkVar2;
                                                    if (ordinal != 0) {
                                                        if (ordinal != 1) {
                                                            if (ordinal == 2) {
                                                                i9 = 4;
                                                            } else {
                                                                throw new IllegalArgumentException("Unsupported RedactedSpan.Type: ".concat(String.valueOf(redactedSpan.a.name())));
                                                            }
                                                        } else {
                                                            i9 = 5;
                                                        }
                                                    }
                                                    if (!createBuilder4.b.isMutable()) {
                                                        createBuilder4.u();
                                                    }
                                                    ((apky) createBuilder4.b).b = a.ak(i9);
                                                    int spanStart = c.getSpanStart(redactedSpan);
                                                    if (!createBuilder4.b.isMutable()) {
                                                        createBuilder4.u();
                                                    }
                                                    ((apky) createBuilder4.b).c = spanStart;
                                                    int spanEnd = c.getSpanEnd(redactedSpan);
                                                    if (!createBuilder4.b.isMutable()) {
                                                        createBuilder4.u();
                                                    }
                                                    ((apky) createBuilder4.b).d = spanEnd;
                                                    if (!createBuilder3.b.isMutable()) {
                                                        createBuilder3.u();
                                                    }
                                                    apkz apkzVar2 = (apkz) createBuilder3.b;
                                                    apky apkyVar = (apky) createBuilder4.s();
                                                    apkyVar.getClass();
                                                    apax apaxVar = apkzVar2.c;
                                                    if (!apaxVar.c()) {
                                                        apkzVar2.c = apag.mutableCopy(apaxVar);
                                                    }
                                                    apkzVar2.c.add(apkyVar);
                                                    i8++;
                                                    size = i11;
                                                    length = i10;
                                                    kmkVar2 = kmkVar3;
                                                } else {
                                                    i4 = size;
                                                    kmkVar = kmkVar2;
                                                    aozy createBuilder5 = apks.a.createBuilder();
                                                    if (!createBuilder5.b.isMutable()) {
                                                        createBuilder5.u();
                                                    }
                                                    ((apks) createBuilder5.b).e = a.ap(3);
                                                    if (!createBuilder5.b.isMutable()) {
                                                        createBuilder5.u();
                                                    }
                                                    apks apksVar = (apks) createBuilder5.b;
                                                    apkz apkzVar3 = (apkz) createBuilder3.s();
                                                    apkzVar3.getClass();
                                                    apksVar.d = apkzVar3;
                                                    apksVar.c = 2;
                                                    if (kkyVar != null) {
                                                        aozy createBuilder6 = apkv.a.createBuilder();
                                                        if (!createBuilder6.b.isMutable()) {
                                                            createBuilder6.u();
                                                        }
                                                        apag apagVar = createBuilder6.b;
                                                        ((apkv) apagVar).b = kkyVar.a;
                                                        if (!apagVar.isMutable()) {
                                                            createBuilder6.u();
                                                        }
                                                        int i12 = kkyVar.b;
                                                        apag apagVar2 = createBuilder6.b;
                                                        ((apkv) apagVar2).d = i12;
                                                        int i13 = kkyVar.c;
                                                        if (!apagVar2.isMutable()) {
                                                            createBuilder6.u();
                                                        }
                                                        ((apkv) createBuilder6.b).c = i13;
                                                        if (!createBuilder5.b.isMutable()) {
                                                            createBuilder5.u();
                                                        }
                                                        apks apksVar2 = (apks) createBuilder5.b;
                                                        apkv apkvVar = (apkv) createBuilder6.s();
                                                        apkvVar.getClass();
                                                        apksVar2.f = apkvVar;
                                                        apksVar2.b |= 1;
                                                    }
                                                    aozy createBuilder7 = apkw.a.createBuilder();
                                                    if (!createBuilder7.b.isMutable()) {
                                                        createBuilder7.u();
                                                    }
                                                    apag apagVar3 = createBuilder7.b;
                                                    str.getClass();
                                                    ((apkw) apagVar3).b = str;
                                                    if (!apagVar3.isMutable()) {
                                                        createBuilder7.u();
                                                    }
                                                    apkw apkwVar = (apkw) createBuilder7.b;
                                                    apks apksVar3 = (apks) createBuilder5.s();
                                                    apksVar3.getClass();
                                                    apax apaxVar2 = apkwVar.c;
                                                    if (!apaxVar2.c()) {
                                                        apkwVar.c = apag.mutableCopy(apaxVar2);
                                                    }
                                                    apkwVar.c.add(apksVar3);
                                                    int intValue = ((Integer) kmr.a.e()).intValue();
                                                    if (intValue > 0) {
                                                        b2 = (intValue * Math.round(b2 / intValue)) + i7;
                                                    }
                                                    if (!createBuilder7.b.isMutable()) {
                                                        createBuilder7.u();
                                                    }
                                                    apag apagVar4 = createBuilder7.b;
                                                    ((apkw) apagVar4).d = b2;
                                                    if (!apagVar4.isMutable()) {
                                                        createBuilder7.u();
                                                    }
                                                    ((apkw) createBuilder7.b).e = a.ap(3);
                                                    if (!createBuilder2.b.isMutable()) {
                                                        createBuilder2.u();
                                                    }
                                                    apkt apktVar = (apkt) createBuilder2.b;
                                                    apkw apkwVar2 = (apkw) createBuilder7.s();
                                                    apkwVar2.getClass();
                                                    apax apaxVar3 = apktVar.b;
                                                    if (!apaxVar3.c()) {
                                                        apktVar.b = apag.mutableCopy(apaxVar3);
                                                    }
                                                    apktVar.b.add(apkwVar2);
                                                }
                                            }
                                        } else {
                                            alogVar3 = alogVar4;
                                            i4 = size;
                                            kmkVar = kmkVar2;
                                        }
                                        i7++;
                                        alogVar4 = alogVar3;
                                        size = i4;
                                        kmkVar2 = kmkVar;
                                        i5 = 0;
                                    }
                                    alogVar2 = alogVar4;
                                    i3 = size;
                                    apkt apktVar2 = (apkt) createBuilder2.s();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apku apkuVar = (apku) createBuilder.b;
                                    apktVar2.getClass();
                                    apkuVar.a();
                                    apkuVar.c.add(apktVar2);
                                }
                                i6++;
                                alogVar4 = alogVar2;
                                size = i3;
                                i5 = 0;
                            }
                            return (apku) createBuilder.s();
                        }
                    }, jxvVar.a).i(new ici(jxvVar.b, 19), andi.a);
                    e.b(i2);
                    e.close();
                    akboVar.c(ahlp.l(i2), kmaVar.n);
                    return;
                } catch (Throwable th3) {
                    try {
                        e.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 5:
                uwq uwqVar = (uwq) this.a;
                cg cgVar = (cg) uwqVar.b.b();
                Intent intent = uwqVar.d;
                if (intent == null) {
                    arro.b("errorIntent");
                    intent = null;
                }
                aktp.Q(cgVar, intent);
                ((uwp) uwqVar.b.b()).d();
                uwqVar.a("Bugle.UI.GaiaAuthFailureDialog.SignIn.Clicked");
                return;
            case 6:
                uwq uwqVar2 = (uwq) this.a;
                ((uwp) uwqVar2.b.b()).d();
                uwqVar2.a("Bugle.UI.GaiaAuthFailureDialog.NotNow.Clicked");
                return;
            case 7:
                yhx.c((Context) this.a);
                return;
            case 8:
                yyj yyjVar = (yyj) this.a;
                ((lzv) yyjVar.e.b()).y((Context) yyjVar.a.b(), yyjVar.g.b);
                yyjVar.b(false);
                return;
            case 9:
                dialogInterface.dismiss();
                ClassZeroActivity classZeroActivity = (ClassZeroActivity) this.a;
                ((mbl) classZeroActivity.n.b()).e("Bugle.Sms.ClassZero.Class.MessageDismissed", classZeroActivity.z());
                classZeroActivity.A();
                return;
            case 10:
                ClassZeroActivity classZeroActivity2 = (ClassZeroActivity) this.a;
                classZeroActivity2.q = true;
                classZeroActivity2.C();
                dialogInterface.dismiss();
                classZeroActivity2.A();
                return;
            case 11:
                ((zhz) this.a).b(i);
                dialogInterface.dismiss();
                return;
            case 12:
                ahjj ahjjVar = ((PhoneNumberPreference) this.a).F;
                if (ahjjVar != null) {
                    ((zjx) ahjjVar.a).I.c("Bugle.Preference.Smsc.Editor.Closed.Cancel");
                    return;
                }
                return;
            case 13:
                PhoneNumberPreference phoneNumberPreference = (PhoneNumberPreference) this.a;
                phoneNumberPreference.d = "";
                phoneNumberPreference.e = Optional.empty();
                if (((Boolean) new mst(16).get()).booleanValue()) {
                    phoneNumberPreference.l(phoneNumberPreference.a.b().n(""));
                    return;
                } else {
                    phoneNumberPreference.o("");
                    return;
                }
            case 14:
                ((zki) this.a).c.f(0);
                return;
            case 15:
                boolean booleanValue = ((Boolean) xxy.e.e()).booleanValue();
                Object obj3 = this.a;
                if (booleanValue) {
                    zkv zkvVar = (zkv) obj3;
                    ((akbo) zkvVar.G.b()).c(new ahlp(((qyo) zkvVar.s.b()).a()), zkvVar.L);
                    return;
                }
                zkv zkvVar2 = (zkv) obj3;
                zkn zknVar = zkvVar2.q;
                ihk ihkVar = (ihk) ((Optional) ((apxx) zkvVar2.F).a).get();
                zkvVar2.q.x();
                aktp.Q(zknVar, ihkVar.b());
                dialogInterface.dismiss();
                return;
            case 16:
                ((zkv) this.a).c();
                return;
            case 17:
                zkv zkvVar3 = (zkv) this.a;
                ((ykw) zkvVar3.x.b()).h(zkvVar3.e, true);
                ((mbl) zkvVar3.v.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 1);
                return;
            case 18:
                zly zlyVar = (zly) this.a;
                akbo akboVar2 = (akbo) zlyVar.f.b();
                zlt zltVar = (zlt) zlyVar.d.b();
                akul ai = aktp.ai(new ktb(zltVar, zlyVar.j, zlyVar.m, 3), zltVar.e);
                zltVar.i.q(ai, zltVar.g);
                akboVar2.j(new ahlp(ai), new ahlp(Integer.valueOf(zlyVar.m)), zlyVar.n);
                return;
            case 19:
                ((aabi) this.a).d();
                return;
            default:
                ((aagf) this.a).d();
                return;
        }
    }

    public ivs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
