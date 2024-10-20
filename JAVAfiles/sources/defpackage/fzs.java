package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzs extends arpw implements arqv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                new fzs((arpe) obj2, 0);
                return a.I(arnb.a);
            case 1:
                new fzs((arpe) obj2, 1, (byte[]) null);
                return a.I(arnb.a);
            case 2:
                return new fzs((arpe) obj2, 2, (char[]) null).b(arnb.a);
            case 3:
                return new fzs((arpe) obj2, 3, (short[]) null).b(arnb.a);
            case 4:
                return new fzs((arpe) obj2, 4, (int[]) null).b(arnb.a);
            case 5:
                return new fzs((arpe) obj2, 5, (boolean[]) null).b(arnb.a);
            case 6:
                return new fzs((arpe) obj2, 6, (float[]) null).b(arnb.a);
            case 7:
                return new fzs((arpe) obj2, 7, (byte[][]) null).b(arnb.a);
            case 8:
                return new fzs((arpe) obj2, 8, (char[][]) null).b(arnb.a);
            case 9:
                return new fzs((arpe) obj2, 9, (short[][]) null).b(arnb.a);
            case 10:
                return new fzs((arpe) obj2, 10, (int[][]) null).b(arnb.a);
            case 11:
                return new fzs((arpe) obj2, 11, (boolean[][]) null).b(arnb.a);
            case 12:
                return new fzs((arpe) obj2, 12, (float[][]) null).b(arnb.a);
            case 13:
                return new fzs((arpe) obj2, 13, (byte[][][]) null).b(arnb.a);
            case 14:
                return new fzs((arpe) obj2, 14, (char[][][]) null).b(arnb.a);
            case 15:
                new fzs((arpe) obj2, 15, (short[][][]) null);
                return a.I(arnb.a);
            case 16:
                new fzs((arpe) obj2, 16, (int[][][]) null);
                return a.I(arnb.a);
            case 17:
                new fzs((arpe) obj2, 17, (boolean[][][]) null);
                return a.I(arnb.a);
            case 18:
                return new fzs((arpe) obj2, 18, (float[][][]) null).b(arnb.a);
            case 19:
                return new fzs((arpe) obj2, 19, (byte[]) null, (byte[]) null).b(arnb.a);
            default:
                return new fzs((arpe) obj2, 20, (char[]) null, (byte[]) null).b(arnb.a);
        }
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                return a.I(obj);
            case 1:
                return a.I(obj);
            case 2:
                aqil.P(obj);
                return ((rob) rog.a().b().n()).cP();
            case 3:
                aqil.P(obj);
                int i2 = MessagesTable.d().b().i();
                int i3 = sni.e().b().i();
                tbs d = PartsTable.d();
                d.g(new idc(i));
                return new icp(i2, i3, d.b().i());
            case 4:
                aqil.P(obj);
                ((alvg) kfs.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$4", "invokeSuspend", 136, "MessageListPagingDataProviderImpl.kt")).q("Starting PagingDataFlow");
                return arnb.a;
            case 5:
                aqil.P(obj);
                alvw g = lfo.a.g();
                g.X(alwp.a, "BugleCdp");
                ((alvg) g.h("com/google/android/apps/messaging/messagedetails/screen/MessageDetailsScreenUiAdapter$createUiDataFlow$1", "invokeSuspend", 80, "MessageDetailsScreenUiAdapter.kt")).q("Collected TopbarUiData");
                return arnb.a;
            case 6:
                aqil.P(obj);
                alvw g2 = lfo.a.g();
                g2.X(alwp.a, "BugleCdp");
                ((alvg) g2.h("com/google/android/apps/messaging/messagedetails/screen/MessageDetailsScreenUiAdapter$createUiDataFlow$2", "invokeSuspend", 85, "MessageDetailsScreenUiAdapter.kt")).q("Collected MessageBubbleUiData");
                return arnb.a;
            case 7:
                aqil.P(obj);
                sfw sfwVar = new sfw(sfz.a);
                sfwVar.w("BasicRestoreWorkflowSteps#getRestoredMessageCount");
                sfwVar.d(new lvo(i));
                return new Integer(sfwVar.b().i());
            case 8:
                aqil.P(obj);
                sfw sfwVar2 = new sfw(sfz.a);
                sfwVar2.w("BasicRestoreWorkflowSteps#getRestoredMessageCount");
                sfwVar2.d(new lvo(2));
                return new Integer(sfwVar2.b().i());
            case 9:
                aqil.P(obj);
                sfw sfwVar3 = new sfw(sfz.a);
                sfwVar3.w("RestoreAnytimeCompatibleRestoreWorkflowSteps#getRestoredMessageCount");
                sfwVar3.d(new lvo(3));
                return new Integer(sfwVar3.b().i());
            case 10:
                aqil.P(obj);
                sfw sfwVar4 = new sfw(sfz.a);
                sfwVar4.w("RestoreAnytimeCompatibleRestoreWorkflowSteps#getRestoredMessageCount");
                sfwVar4.d(new lvo(4));
                return new Integer(sfwVar4.b().i());
            case 11:
                aqil.P(obj);
                int i4 = alog.d;
                alog alogVar = alsx.a;
                alogVar.getClass();
                return alogVar;
            case 12:
                aqil.P(obj);
                int i5 = alog.d;
                alog alogVar2 = alsx.a;
                alogVar2.getClass();
                return alogVar2;
            case 13:
                aqil.P(obj);
                akrh e = aktp.e("ContactsSyncDataService#deleteAllContacts");
                try {
                    sji sjiVar = new sji();
                    sjiVar.e();
                    sjiVar.f("deleteAllContacts");
                    Integer num = new Integer(sjiVar.d());
                    armd.i(e, null);
                    return num;
                } finally {
                }
            case 14:
                aqil.P(obj);
                sxy d2 = MessagesTable.d();
                d2.w("DatabaseBackerUpperLogger#getMessageCount");
                return new Integer(d2.b().i());
            case 15:
                return a.I(obj);
            case 16:
                return a.I(obj);
            case 17:
                return a.I(obj);
            case 18:
                aqil.P(obj);
                alvw g3 = zzz.a.g();
                g3.X(alwp.a, "BugleCdp");
                ((alvg) g3.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl$internalCreateUiData$10", "invokeSuspend", 140, "ConversationDetailsUiAdapterImpl.kt")).q("ConversationDetailsUiAdapter collected ActionsUiData");
                return arnb.a;
            case 19:
                aqil.P(obj);
                alvw g4 = zzz.a.g();
                g4.X(alwp.a, "BugleCdp");
                ((alvg) g4.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl$internalCreateUiData$11", "invokeSuspend", 143, "ConversationDetailsUiAdapterImpl.kt")).q("ActiveSimUiAdapter collected ActiveSimUiData");
                return arnb.a;
            default:
                aqil.P(obj);
                alvw g5 = zzz.a.g();
                g5.X(alwp.a, "BugleCdp");
                ((alvg) g5.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl$internalCreateUiData$7", "invokeSuspend", 130, "ConversationDetailsUiAdapterImpl.kt")).q("Collected TopbarUiData");
                return arnb.a;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.a) {
            case 0:
                return new fzs(arpeVar, 0);
            case 1:
                return new fzs(arpeVar, 1, (byte[]) null);
            case 2:
                return new fzs(arpeVar, 2, (char[]) null);
            case 3:
                return new fzs(arpeVar, 3, (short[]) null);
            case 4:
                return new fzs(arpeVar, 4, (int[]) null);
            case 5:
                return new fzs(arpeVar, 5, (boolean[]) null);
            case 6:
                return new fzs(arpeVar, 6, (float[]) null);
            case 7:
                return new fzs(arpeVar, 7, (byte[][]) null);
            case 8:
                return new fzs(arpeVar, 8, (char[][]) null);
            case 9:
                return new fzs(arpeVar, 9, (short[][]) null);
            case 10:
                return new fzs(arpeVar, 10, (int[][]) null);
            case 11:
                return new fzs(arpeVar, 11, (boolean[][]) null);
            case 12:
                return new fzs(arpeVar, 12, (float[][]) null);
            case 13:
                return new fzs(arpeVar, 13, (byte[][][]) null);
            case 14:
                return new fzs(arpeVar, 14, (char[][][]) null);
            case 15:
                return new fzs(arpeVar, 15, (short[][][]) null);
            case 16:
                return new fzs(arpeVar, 16, (int[][][]) null);
            case 17:
                return new fzs(arpeVar, 17, (boolean[][][]) null);
            case 18:
                return new fzs(arpeVar, 18, (float[][][]) null);
            case 19:
                return new fzs(arpeVar, 19, (byte[]) null, (byte[]) null);
            default:
                return new fzs(arpeVar, 20, (char[]) null, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, char[] cArr, byte[] bArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, float[] fArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, int[] iArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, boolean[] zArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, byte[][] bArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, char[][] cArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, float[][] fArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, int[][] iArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, short[][] sArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, boolean[][] zArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, byte[][][] bArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, char[][][] cArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, float[][][] fArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, int[][][] iArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, short[][][] sArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(arpe arpeVar, int i, boolean[][][] zArr) {
        super(2, arpeVar);
        this.a = i;
    }
}
