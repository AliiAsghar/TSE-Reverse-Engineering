package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzj extends arpw implements arqv {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((fzj) c((arny) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((fzj) c((eiz) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((fzj) c((dyh) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((fzj) c((jxk) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((fzj) c((bza) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((fzj) c((mjb) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((fzj) c((gpx) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((fzj) c((Conversation) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((fzj) c((List) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((fzj) c((bza) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((fzj) c((aeke) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((fzj) c((ascm) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        apdz apdzVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                aqil.P(obj);
                if (((arny) this.a) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                aqil.P(obj);
                return Boolean.valueOf(!(((eiz) this.a) instanceof eis));
            case 2:
                aqil.P(obj);
                dyh dyhVar = (dyh) this.a;
                if (dyi.e(2)) {
                    Objects.toString(dyhVar);
                    dyi.f(2, "Sent ".concat(String.valueOf(dyhVar)));
                }
                return arnb.a;
            case 3:
                aqil.P(obj);
                jxk jxkVar = (jxk) this.a;
                if (jxkVar == null || (apdzVar = jxkVar.a) == null || (apdzVar.b & 1) == 0) {
                    return null;
                }
                apdv apdvVar = apdzVar.c;
                if (apdvVar == null) {
                    return apdv.a;
                }
                return apdvVar;
            case 4:
                aqil.P(obj);
                ((bza) this.a).h(true);
                return arnb.a;
            case 5:
                aqil.P(obj);
                ((alvg) kfs.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$1", "invokeSuspend", 111, "MessageListPagingDataProviderImpl.kt")).t("Initial PagingKey emitted: %s", (mjb) this.a);
                return arnb.a;
            case 6:
                aqil.P(obj);
                ((alvg) kfs.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$pagingDataFlow$2$2", "invokeSuspend", 131, "MessageListPagingDataProviderImpl.kt")).t("PagingData emitted: %s", (gpx) this.a);
                return arnb.a;
            case 7:
                aqil.P(obj);
                return ((Conversation) this.a).c();
            case 8:
                aqil.P(obj);
                List list = (List) this.a;
                list.getClass();
                gtl gtlVar = (gtl) aqjn.ah(list);
                if (gtlVar != null) {
                    z = gtlVar.b.a();
                }
                return Boolean.valueOf(z);
            case 9:
                aqil.P(obj);
                ((bza) this.a).h(true);
                return arnb.a;
            case 10:
                aqil.P(obj);
                return Boolean.valueOf(!(((aeke) this.a) instanceof affc));
            default:
                aqil.P(obj);
                if (((ascm) this.a) != ascm.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.b) {
            case 0:
                fzj fzjVar = new fzj(arpeVar, 0);
                fzjVar.a = obj;
                return fzjVar;
            case 1:
                fzj fzjVar2 = new fzj(arpeVar, 1, (byte[]) null);
                fzjVar2.a = obj;
                return fzjVar2;
            case 2:
                fzj fzjVar3 = new fzj(arpeVar, 2, (char[]) null);
                fzjVar3.a = obj;
                return fzjVar3;
            case 3:
                fzj fzjVar4 = new fzj(arpeVar, 3, (short[]) null);
                fzjVar4.a = obj;
                return fzjVar4;
            case 4:
                fzj fzjVar5 = new fzj(arpeVar, 4, (int[]) null);
                fzjVar5.a = obj;
                return fzjVar5;
            case 5:
                fzj fzjVar6 = new fzj(arpeVar, 5, (boolean[]) null);
                fzjVar6.a = obj;
                return fzjVar6;
            case 6:
                fzj fzjVar7 = new fzj(arpeVar, 6, (float[]) null);
                fzjVar7.a = obj;
                return fzjVar7;
            case 7:
                fzj fzjVar8 = new fzj(arpeVar, 7, (byte[][]) null);
                fzjVar8.a = obj;
                return fzjVar8;
            case 8:
                fzj fzjVar9 = new fzj(arpeVar, 8, (char[][]) null);
                fzjVar9.a = obj;
                return fzjVar9;
            case 9:
                fzj fzjVar10 = new fzj(arpeVar, 9, (short[][]) null);
                fzjVar10.a = obj;
                return fzjVar10;
            case 10:
                fzj fzjVar11 = new fzj(arpeVar, 10, (int[][]) null);
                fzjVar11.a = obj;
                return fzjVar11;
            default:
                fzj fzjVar12 = new fzj(arpeVar, 11, (boolean[][]) null);
                fzjVar12.a = obj;
                return fzjVar12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, float[] fArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, int[] iArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, boolean[] zArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, byte[][] bArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, char[][] cArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, int[][] iArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, short[][] sArr) {
        super(2, arpeVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj(arpe arpeVar, int i, boolean[][] zArr) {
        super(2, arpeVar);
        this.b = i;
    }
}
