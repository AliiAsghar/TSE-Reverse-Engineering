package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geg extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geg(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v101, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v111, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [gpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v41, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v18, types: [owh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [owh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [agdi] */
    /* JADX WARN: Type inference failed for: r7v7, types: [armf, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        gba gbaVar;
        gba a;
        agdb agdbVar;
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        Object obj2;
        int i = 19;
        int i2 = 18;
        String str2 = null;
        jha jhaVar = null;
        switch (this.c) {
            case 0:
                int intValue = ((Number) obj).intValue();
                Object h = ((gqg) this.b).h(intValue);
                if (h == null) {
                    return new gej(intValue);
                }
                return this.a.a(h);
            case 1:
                fzu fzuVar = (fzu) obj;
                if (fzuVar != null) {
                    gbaVar = fzuVar.d;
                } else {
                    gbaVar = gba.a;
                }
                Object obj3 = this.a;
                Object obj4 = this.b;
                int ordinal = ((gbb) obj3).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            a = gba.a(gbaVar, null, null, (gaz) obj4, 3);
                        } else {
                            throw new armm();
                        }
                    } else {
                        a = gba.a(gbaVar, null, (gaz) obj4, null, 5);
                    }
                } else {
                    a = gba.a(gbaVar, (gaz) obj4, null, null, 6);
                }
                return kkc.n(fzuVar, a);
            case 2:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (ry$$ExternalSyntheticApiModelOutline0.m488m(obj5)) {
                        arrayList.add(obj5);
                    }
                }
                ?? r1 = this.a;
                ((gph) ((gpx) this.b).b).a(arrayList);
                r1.a();
                return arnb.a;
            case 3:
                Throwable th = (Throwable) obj;
                if (th instanceof gvh) {
                    ((gsx) this.b).i(((gvh) th).a);
                }
                this.a.cancel(false);
                return arnb.a;
            case 4:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                List list2 = ((ifw) this.a).a;
                aosVar.b(list2.size(), null, new gsh(list2, 8), new cdj(-632812321, true, new kii(list2, this.b, 1)));
                return arnb.a;
            case 5:
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                iha ihaVar = (iha) this.a;
                igp igpVar = (igp) ((ico) this.b).b.get(hld.f(ihaVar.c));
                if (igpVar != null) {
                    return igpVar.a(lrcVar, ihaVar);
                }
                throw new IllegalStateException("There is no corresponding UiAdapter for DialogType \"" + ((Object) hld.f(ihaVar.c)) + "\"!");
            case 6:
                long j = ((cjn) obj).a;
                ((jdp) this.b).l.b(new lms(this.a.f()));
                return true;
            case 7:
                long j2 = ((cjn) obj).a;
                ((jdt) this.b).j.b(new lms(this.a.f()));
                return true;
            case 8:
                List<aftr> list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (aftr aftrVar : list3) {
                    Object obj6 = this.b;
                    if (aftrVar instanceof afto) {
                        agda agdaVar = new agda((afto) aftrVar, ((jkk) obj6).h.d(aftrVar), new jdr(obj6, aftrVar, i2));
                        Uri parse = Uri.parse(agdaVar.a.b);
                        parse.getClass();
                        agdbVar = new agdb(parse, agdaVar.a.c, agdaVar.b, agdaVar.c);
                    } else if (aftrVar instanceof aftq) {
                        ?? r6 = this.a;
                        jkk jkkVar = (jkk) obj6;
                        aday adayVar = jkkVar.i;
                        agdh agdhVar = new agdh((aftq) aftrVar, jkkVar.h.d(aftrVar), new jdr(obj6, aftrVar, i));
                        Uri parse2 = Uri.parse(agdhVar.a.b);
                        parse2.getClass();
                        String str3 = agdhVar.b;
                        aftq aftqVar = agdhVar.a;
                        ?? r14 = adayVar.b;
                        String str4 = aftqVar.b;
                        Object obj7 = r14.get(str4);
                        if (obj7 == null) {
                            aftq aftqVar2 = agdhVar.a;
                            ahjj ahjjVar = (ahjj) ((adwo) adayVar.a).a.b();
                            ahjjVar.getClass();
                            agde agdeVar = new agde(ahjjVar, r6, aftqVar2);
                            r14.put(str4, agdeVar);
                            obj7 = agdeVar;
                        }
                        arwi.v(((asep) r6).a).s(new afho(adayVar, agdhVar, 14));
                        agdbVar = new agdi(parse2, (agde) obj7, str3, agdhVar.c);
                    } else {
                        alvw h2 = jkk.a.h();
                        h2.X(alwp.a, "BugleComposeRow2");
                        ((alvg) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter$createUiData$2", "invoke", 138, "DirectSendUiAdapter.kt")).t("Visual media %s not supported by direct send media viewer", aftrVar);
                        agdbVar = null;
                    }
                    if (agdbVar != null) {
                        arrayList2.add(agdbVar);
                    }
                    i = 19;
                    i2 = 18;
                }
                return arrayList2;
            case 9:
                lrc lrcVar2 = (lrc) obj;
                lrcVar2.getClass();
                if (((lig) this.b).f.a()) {
                    str = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_title);
                } else {
                    str = null;
                }
                if (((lig) this.b).f.a()) {
                    str2 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_subtitle);
                }
                String str5 = str2;
                kim[] kimVarArr = new kim[2];
                if (((owp) ((lig) this.b).h.b()).a()) {
                    string = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_title_v2);
                } else {
                    string = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_title);
                }
                string.getClass();
                if (((owp) ((lig) this.b).h.b()).a()) {
                    string2 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_text_v2);
                } else {
                    string2 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_text);
                }
                string2.getClass();
                Object obj8 = this.b;
                kimVarArr[0] = new kim(string, string2, new jdr(obj8, lrcVar2, 20));
                if (((owp) ((lig) obj8).h.b()).a()) {
                    string3 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_original_option_title_v2);
                } else {
                    string3 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_original_option_title);
                }
                string3.getClass();
                if (((owp) ((lig) this.b).h.b()).a()) {
                    string4 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_original_option_text_v2);
                } else {
                    string4 = ((Context) ((lig) this.b).c).getString(R.string.direct_send_image_compression_bottom_sheet_original_option_text);
                }
                string4.getClass();
                kimVarArr[1] = new kim(string3, string4, new jkq(this.b, lrcVar2, 1));
                return new kin(aqjn.B(kimVarArr), this.a, str, str5, kek.i);
            case 10:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                if (!d.F(jhcVar.a, this.a) || ((obj2 = this.b) != null && !d.F(Boolean.valueOf(jhcVar.h), obj2))) {
                    Object obj9 = this.a;
                    Object obj10 = this.b;
                    if (obj10 != null) {
                        z = ((Boolean) obj10).booleanValue();
                    } else {
                        z = jhcVar.h;
                    }
                    return jhc.c(jhcVar, (String) obj9, null, null, false, z, 2, 638);
                }
                return jhcVar;
            case 11:
                jhc jhcVar2 = (jhc) obj;
                jhcVar2.getClass();
                Iterator it = jhcVar2.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? r2 = this.b;
                        ?? next = it.next();
                        if (((Boolean) r2.a(next)).booleanValue()) {
                            jhaVar = next;
                        }
                    }
                }
                jha jhaVar2 = jhaVar;
                ((arsb) this.a).a = jhaVar2;
                if (jhaVar2 == null) {
                    return jhcVar2;
                }
                return jhc.c(jhcVar2, null, aqjn.ap(jhcVar2.b, jhaVar2), null, false, false, 0, 1021);
            case 12:
                jhc jhcVar3 = (jhc) obj;
                jhcVar3.getClass();
                int indexOf = jhcVar3.b.indexOf(this.b);
                if (indexOf < 0) {
                    alvw i3 = jly.a.i();
                    i3.X(alwp.a, "BugleComposeRow2");
                    ((alvg) i3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState$launchReplaceAttachment$1$newDraftData$1", "invoke", 159, "DraftAttachmentState.kt")).D("Failed to replace attachment %s with %s", this.b, this.a);
                    return jhcVar3;
                }
                List list4 = jhcVar3.b;
                Object obj11 = this.a;
                List az = aqjn.az(list4);
                az.set(indexOf, obj11);
                return jhc.c(jhcVar3, null, az, null, false, false, 0, 1021);
            case 13:
                ((jmc) this.b).h.a(this.a, Integer.valueOf(((Number) obj).intValue()));
                return arnb.a;
            case 14:
                jha jhaVar3 = (jha) this.a.get(((Number) obj).intValue());
                alvw f = jmc.a.f();
                f.X(alwp.a, "BugleComposeRow2");
                ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl", "onRemove", 135, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", jhaVar3);
                ((jmc) this.b).f.e(new ipk(jhaVar3, 18));
                return arnb.a;
            case 15:
                ((jmc) this.b).i.a(this.a, Integer.valueOf(((Number) obj).intValue()));
                return arnb.a;
            case 16:
                lrc lrcVar3 = (lrc) obj;
                lrcVar3.getClass();
                this.a.d(new ipk(lrcVar3, 19));
                jat jatVar = (jat) this.b;
                return new aepx(jat.l(jatVar, R.string.missing_encryption_notice_text), null, null, null, false, false, new aewr(jat.l(jatVar, R.string.send_anyway_button_text), new jjw(this.a, 15)), new aewr(jat.l((jat) this.b, R.string.cancel_send_button_text), new jjw(this.a, 16)), new jjw(this.a, 17), 62);
            case 17:
                lrc lrcVar4 = (lrc) obj;
                lrcVar4.getClass();
                this.a.d(new ipk(lrcVar4, 20));
                jat jatVar2 = (jat) this.b;
                return new aepx(jat.l(jatVar2, R.string.message_might_not_be_delivered_notice_text), null, null, jat.l(jatVar2, R.string.attachment_limit_reached_notice_title), false, false, new aewr(jat.l(jatVar2, android.R.string.ok), new jjw(this.a, 18)), new aewr(jat.l((jat) this.b, R.string.send_anyway_button_text), new jjw(this.a, 19)), new jjw(this.a, 20), 54);
            case 18:
                lrc lrcVar5 = (lrc) obj;
                lrcVar5.getClass();
                this.a.d(new jsv(lrcVar5, 1));
                return ((kjd) ((Optional) ((jat) this.b).f).get()).b();
            case 19:
                ((lrc) obj).getClass();
                jat jatVar3 = (jat) this.b;
                return new aepx(jat.l(jatVar3, R.string.video_trimmer_dialog_text), null, null, jat.l(jatVar3, R.string.video_trimmer_dialog_title), false, false, new aewr(jat.l(jatVar3, R.string.video_trimmer_dialog_positive_button), this.a), new aewr(jat.l((jat) this.b, R.string.video_trimmer_dialog_negative_button), jlc.h), null, 310);
            default:
                spb spbVar = (spb) obj;
                spbVar.getClass();
                Iterator it2 = ((jpm) this.a).e.iterator();
                while (it2.hasNext()) {
                    ((jpv) it2.next()).c(spbVar, (jhc) this.b);
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geg(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
