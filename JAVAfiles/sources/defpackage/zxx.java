package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxx extends arrp implements arqv {
    final /* synthetic */ zxy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxx(zxy zxyVar) {
        super(2);
        this.a = zxyVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r4v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v41, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v45, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v56, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [armf, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        asai a;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            zzz zzzVar = ((ConversationDetailsViewModel) this.a.d.a()).c;
            alvw g = zzz.a.g();
            g.X(alwp.a, "BugleCdp");
            ((alvg) g.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl", "createUiData", 73, "ConversationDetailsUiAdapterImpl.kt")).q("ConversationDetailsUiAdapter initialized");
            akee akeeVar = new akee(qkf.a(new lhh(((jej) ((zfm) zzzVar.d.b()).a.b()).a, 15), "TopbarUiData"), new fzs((arpe) null, 20, (char[]) null, (byte[]) null), 10);
            zxy zxyVar = (zxy) zzzVar.e.b();
            wyp wypVar = (wyp) zxyVar.b.b();
            asai a2 = qkf.a(qkq.f(qkf.a(wypVar.d, "ConversationProperties"), qkf.a(wypVar.a, "IsPenpalConversation"), qkf.a(wypVar.f, "Recipients"), wypVar.b, new kgf(wypVar, (arpe) null, 5)), "TitleUiData");
            zzb zzbVar = (zzb) zxyVar.e.b();
            asai a3 = qkf.a(zzbVar.d, "ConversationProperties");
            asai a4 = qkf.a(zzbVar.e, "Recipients");
            asai a5 = qkf.a(zzbVar.f, "IsPenpalConversation");
            asai a6 = qkf.a(((jdi) zzbVar.h.b()).a, "PhoneCallAction");
            asai a7 = qkf.a(((jfr) zzbVar.i.b()).g, "VideoCallAction");
            asai a8 = qkf.a(((jdb) zzbVar.j.b()).g, "AddPeopleToGroupAction");
            asai a9 = qkf.a(((jfb) zzbVar.k.b()).b, "SearchAction");
            arwe arweVar = zzbVar.c;
            zza zzaVar = new zza(zzbVar, null);
            long j = arut.a;
            long o = arsd.o(10, aruv.d);
            asai[] asaiVarArr = {a3, a4, a5, a6, a7, a8, a9};
            boolean[] zArr = new boolean[7];
            for (int i = 0; i < 7; i++) {
                zArr[i] = false;
            }
            ArrayList arrayList = new ArrayList(7);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 7; i2 < i4; i4 = 7) {
                arrayList.add(new akee(asaiVarArr[i2], new jmk(zArr, i3, (arpe) null, 5, (boolean[]) null), 10));
                i2++;
                i3++;
            }
            asai a10 = qkf.a(new akee((arqv) new jmo(arweVar, o, asaiVarArr, zArr, (arpe) null, 3, (short[]) null), (asai) new kdp((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), zzaVar, 18), 4), "ActionsUiData");
            aair aairVar = (aair) zxyVar.a.b();
            akee akeeVar2 = new akee(qkf.a(qkq.f(a2, a10, qkf.a(qkq.h(qkf.a(aairVar.d, "ConversationProperties"), qkf.a(aairVar.f, "Recipients"), aairVar.e, new zzd(aairVar, (arpe) null, 0)), "AvatarUiData"), zxyVar.c, new jit(zxyVar, null, 6, null)), "HeaderUiData"), new zzy((arpe) null, 1, (byte[]) null), 10);
            ascv b = qkf.b(ascy.a(null), "SearchUiData");
            zyl zylVar = (zyl) zzzVar.g.b();
            asai a11 = qkf.a(zylVar.d, "ConversationProperties");
            asai a12 = qkf.a(zylVar.g, "IsPenpalConversation");
            asai a13 = qkf.a(((jew) zylVar.j.b()).a, "RcsLearnMoreAction");
            zyp zypVar = (zyp) zylVar.k.b();
            asai a14 = qkf.a(zypVar.b, "ConversationProperties");
            asai a15 = qkf.a(zypVar.e, "ComposeConstraints");
            asai a16 = qkf.a(zypVar.g, "ActiveSelfIdentity");
            if (((nxk) zypVar.n.b()).a()) {
                a = zypVar.c;
            } else {
                int i5 = alog.d;
                a = ascy.a(alsx.a);
            }
            asai e = qkq.e(a11, a12, a13, qkf.a(qkq.g(a14, a15, a16, a, zypVar.d, new zyo(zypVar, null)), "E2eeStatusUiData"), qkf.a(zylVar.f, "SelfIdentity"), zylVar.e, zylVar.c, new zyk(zylVar, null));
            arwe arweVar2 = zylVar.c;
            int i6 = ascp.a;
            akee akeeVar3 = new akee(qkf.b(arrn.T(e, arweVar2, asco.a(0L, 3), null), "EncryptionUiData"), new zzy(null, 0), 10);
            zap zapVar = (zap) zzzVar.h.b();
            ?? r6 = zapVar.b;
            ?? r11 = zapVar.a;
            asai a17 = qkf.a(zapVar.c, "ConversationProperties");
            asai a18 = qkf.a(r11, "IsPenpalConversation");
            wyp wypVar2 = (wyp) r6.b();
            asai a19 = qkf.a(qkq.e(qkf.a(wypVar2.a, "ComposeConstraints"), qkf.a(wypVar2.f, "ConversationProperties"), qkf.a(((jes) wypVar2.c.b()).c, "NotificationSettingsActionPlugin"), qkf.a(((jeu) wypVar2.b.b()).c, "OnlySendSmsMmsActionPlugin"), qkf.a(((jde) wypVar2.e.b()).a, "BlockAndReportSpamActionPlugin"), qkf.a(((jws) wypVar2.g.b()).b, "CustomThemesActionPlugin"), wypVar2.d, new zye(null)), "SingleConversationActionsUiData");
            aair aairVar2 = (aair) zapVar.f.b();
            akee akeeVar4 = new akee(qkf.a(qkq.g(a17, a18, a19, qkf.a(qkq.e(qkf.a(aairVar2.f, "ConversationProperties"), qkf.a(((jeg) aairVar2.h.b()).c, "EditGroupNameAction"), qkf.a(((jes) aairVar2.a.b()).c, "NotificationSettingsAction"), qkf.a(((jer) aairVar2.c.b()).j, "LeaveGroupAction"), qkf.a(((jde) aairVar2.e.b()).a, "BlockAndReportSpamAction"), qkf.a(((jws) aairVar2.b.b()).b, "CustomThemesActionPlugin"), aairVar2.g, new zyd(aairVar2, null)), "GroupConversationActionsUiData"), zapVar.e, new kkf(zapVar, (arpe) null, 3)), "ActionsUiData"), new fzs((arpe) null, 18, (float[][][]) null), 10);
            zxy zxyVar2 = (zxy) zzzVar.j.b();
            akee akeeVar5 = new akee(qkf.b(arrn.T(qkq.f(zxyVar2.c, zxyVar2.d, zxyVar2.a, zxyVar2.b, new jit(zxyVar2, (arpe) null, 5)), zxyVar2.b, asco.a(0L, 3), null), "ActiveSimUiData"), new fzs((arpe) null, 19, (byte[]) null, (byte[]) null), 10);
            asai asaiVar = zzzVar.m;
            asai asaiVar2 = zzzVar.n;
            arwe arweVar3 = zzzVar.b;
            asai a20 = qkf.a(asaiVar, "PenpalDescriptionUiData");
            asai a21 = qkf.a(asaiVar2, "PhotoSelectorUiData");
            zzx zzxVar = new zzx(zzzVar, null);
            long o2 = arsd.o(10, aruv.d);
            asai[] asaiVarArr2 = {akeeVar, akeeVar2, b, akeeVar3, akeeVar4, akeeVar5, a20, a21};
            boolean[] zArr2 = new boolean[8];
            for (int i7 = 0; i7 < 8; i7++) {
                zArr2[i7] = false;
            }
            ArrayList arrayList2 = new ArrayList(8);
            int i8 = 0;
            int i9 = 0;
            while (i8 < 8) {
                arrayList2.add(new akee(asaiVarArr2[i8], new jmk(zArr2, i9, (arpe) null, 8, (char[][]) null), 10));
                i8++;
                i9++;
            }
            aaae.b(arrn.T(new akee((arqv) new jmo(arweVar3, o2, asaiVarArr2, zArr2, (arpe) null, 3, (short[]) null), (asai) new qkk((asai[]) aqjn.ax(arrayList2).toArray(new asai[0]), zzxVar, 1), 4), zzzVar.b, asco.a(0L, 3), null), bwjVar, 8);
        }
        return arnb.a;
    }
}
