package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncd extends arrm implements arqr {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, byte[] bArr) {
        super(1, obj, lxo.class, "detectorLoop", "detectorLoop(Ljava/util/UUID;)Lkotlinx/coroutines/Job;", 0);
        this.a = i;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        ascd ascdVar;
        agek agekVar;
        switch (this.a) {
            case 0:
                return ((rtb) this.e).g((PartsTable.BindData) obj);
            case 1:
                UUID uuid = (UUID) obj;
                uuid.getClass();
                lxo lxoVar = (lxo) this.e;
                return qjh.l(lxoVar.h, null, new lxi(lxoVar, uuid, (arpe) null, 0), 3);
            case 2:
                wvy wvyVar = (wvy) this.e;
                alwo alwoVar = wvy.a;
                return wvyVar.b((arpe) obj);
            case 3:
                return ((wws) this.e).A((arpe) obj);
            case 4:
                return ((wws) this.e).n();
            case 5:
                Cursor cursor = ((akco) obj).a;
                int i = xxb.c;
                akrh e = aktp.e("BlockListResolver#getUpdatedList#queryBugle");
                try {
                    String b = akco.b(cursor, akco.a(cursor, "e164_number"));
                    if (b.length() == 0) {
                        b = akco.b(cursor, akco.a(cursor, "original_number"));
                        if (b.length() == 0) {
                            b = "";
                            armd.i(e, null);
                        } else {
                            armd.i(e, null);
                        }
                    } else {
                        armd.i(e, null);
                    }
                    return b;
                } finally {
                }
            case 6:
                ((zal) this.e).a(((Boolean) obj).booleanValue());
                return arnb.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                zbe zbeVar = (zbe) this.e;
                zbeVar.q.f(str);
                if (((osb) zbeVar.l.b()).a() && ((ose) zbeVar.m.b()).a()) {
                    zbeVar.t.f(null);
                }
                return arnb.a;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                ((zdy) this.e).d(str2);
                return arnb.a;
            case 9:
                nfw nfwVar = (nfw) obj;
                nfwVar.getClass();
                zyl zylVar = (zyl) this.e;
                qjh.l(zylVar.c, null, new zez(zylVar, nfwVar, (arpe) null, 7), 3);
                return arnb.a;
            case 10:
                aftr aftrVar = (aftr) obj;
                aftrVar.getClass();
                afid afidVar = (afid) this.e;
                alvi alviVar = afid.a;
                Iterable iterable = (Iterable) afidVar.aQ().c();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (aeke.cj((afcs) it.next(), aftrVar)) {
                            ((afkq) afidVar.bn().a()).b.f(aftrVar);
                            return arnb.a;
                        }
                    }
                }
                if (aftrVar.j() > 0 && aftrVar.k() > 0) {
                    afidVar.aU(aftrVar);
                } else {
                    arrn.J(afidVar.aP(), null, null, new adzx(afidVar, aftrVar, (arpe) null, 17), 3);
                }
                return arnb.a;
            case 11:
                afts aftsVar = (afts) obj;
                aftsVar.getClass();
                afid afidVar2 = (afid) this.e;
                alvi alviVar2 = afid.a;
                afidVar2.aU(aftsVar);
                return arnb.a;
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                afid afidVar3 = (afid) this.e;
                alvi alviVar3 = afid.a;
                afidVar3.ak = booleanValue;
                afidVar3.bc();
                return arnb.a;
            case 13:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                afid afidVar4 = (afid) this.e;
                alvi alviVar4 = afid.a;
                afidVar4.aj = booleanValue2;
                afidVar4.bc();
                return arnb.a;
            case 14:
                afts aftsVar2 = (afts) obj;
                aftsVar2.getClass();
                afid afidVar5 = (afid) this.e;
                alvi alviVar5 = afid.a;
                afidVar5.aU(aftsVar2);
                return arnb.a;
            case 15:
                afnr afnrVar = (afnr) obj;
                afnrVar.getClass();
                Iterator it2 = ((aflf) this.e).c.iterator();
                while (it2.hasNext()) {
                    ((afkr) it2.next()).b(afnrVar);
                }
                return arnb.a;
            case 16:
                afnr afnrVar2 = (afnr) obj;
                afnrVar2.getClass();
                Iterator it3 = ((aflf) this.e).c.iterator();
                while (it3.hasNext()) {
                    ((afkr) it3.next()).d(afnrVar2);
                }
                return arnb.a;
            case 17:
                afnr afnrVar3 = (afnr) obj;
                afnrVar3.getClass();
                ((aflb) this.e).f(afnrVar3);
                return arnb.a;
            case 18:
                agem agemVar = (agem) obj;
                afvx afvxVar = (afvx) this.e;
                int i2 = afvx.al;
                afwt afwtVar = afvxVar.c;
                if (afwtVar != null) {
                    afwtVar.j.d(afwt.a[2], agemVar);
                    if (((afwa) afvxVar.bj()).f && (agemVar instanceof agep)) {
                        afwt afwtVar2 = afvxVar.c;
                        if (afwtVar2 == null) {
                            arro.b("searchController");
                            afwtVar2 = null;
                        }
                        afwtVar2.c();
                    }
                    if (((afwa) afvxVar.bj()).d && (ascdVar = afvxVar.e) != null) {
                        if (agemVar != null) {
                            agekVar = agemVar.aM();
                        } else {
                            agekVar = null;
                        }
                        ascdVar.f(agekVar);
                    }
                }
                afvxVar.aP(null);
                return arnb.a;
            case 19:
                agek agekVar2 = (agek) obj;
                agekVar2.getClass();
                afwf afwfVar = (afwf) this.e;
                agem b2 = afwfVar.b();
                if (b2 != null && b2.aM() == agekVar2) {
                    agem.bx(b2);
                } else {
                    afwfVar.f(afwfVar.c(agekVar2, afwfVar.a()));
                }
                ((afwk) afwfVar.i.b).e();
                return arnb.a;
            default:
                String str3 = (String) obj;
                str3.getClass();
                afwt afwtVar3 = (afwt) this.e;
                artm[] artmVarArr = afwt.a;
                afwtVar3.j(str3);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i) {
        super(1, obj, rtb.class, "create", "create(Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/PartsTable$BindData;)Lcom/google/android/apps/messaging/shared/datamodel/data/MessagePartData;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, char[] cArr) {
        super(1, obj, wvy.class, "onSubscriptionsChangedInternal", "onSubscriptionsChangedInternal(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, short[] sArr) {
        super(1, obj, wws.class, "getAllActiveRcsProvisioningIds", "getAllActiveRcsProvisioningIds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, int[] iArr) {
        super(1, obj, wws.class, "getAllEligibleRcsProvisioningIds", "getAllEligibleRcsProvisioningIds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, boolean[] zArr) {
        super(1, obj, xxb.class, "readSystemBlockListRow", "readSystemBlockListRow-JfnmSAo(Landroid/database/Cursor;)Ljava/lang/String;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, float[] fArr) {
        super(1, obj, zal.class, "onScroll", "onScroll(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, byte[][] bArr) {
        super(1, obj, zbe.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, char[][] cArr) {
        super(1, obj, zdy.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, short[][] sArr) {
        super(1, obj, zyl.class, "onVerifyEncryption", "onVerifyEncryption(Lcom/google/android/apps/messaging/shared/api/messaging/selfidentity/SelfIdentity;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, int[][] iArr) {
        super(1, obj, afid.class, "handleMediaClick", "handleMediaClick(Lcom/google/android/libraries/compose/media/local/LocalMedia$Visual;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, boolean[][] zArr) {
        super(1, obj, afid.class, "attachMedia", "attachMedia(Lcom/google/android/libraries/compose/media/local/LocalMedia;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, float[][] fArr) {
        super(1, obj, afid.class, "onCameraVisibilityChanged", "onCameraVisibilityChanged(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, byte[][][] bArr) {
        super(1, obj, afid.class, "onSystemPickerVisibilityChanged", "onSystemPickerVisibilityChanged(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, short[][][] sArr) {
        super(1, obj, aflf.class, "onEmojiAdded", "onEmojiAdded(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, int[][][] iArr) {
        super(1, obj, aflf.class, "onEmojiRemoved", "onEmojiRemoved(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, boolean[][][] zArr) {
        super(1, obj, aflb.class, "insertEmojiAtCurrentSelection", "insertEmojiAtCurrentSelection(Lcom/google/android/libraries/compose/emoji/data/usage/EmojiUsage;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, float[][][] fArr) {
        super(1, obj, afvx.class, "onActiveScreenChanged", "onActiveScreenChanged(Lcom/google/android/libraries/compose/ui/screen/HugoScreen;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(1, obj, afwf.class, "onScreenCategorySelected", "onScreenCategorySelected(Lcom/google/android/libraries/compose/ui/screen/ComposeScreenCategory;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Object obj, int i, char[] cArr, byte[] bArr) {
        super(1, obj, afwt.class, "onSearchRowTextClicked", "onSearchRowTextClicked(Ljava/lang/String;)V", 0);
        this.a = i;
    }
}
