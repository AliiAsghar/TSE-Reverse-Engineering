package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class msp implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ msp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v101, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [vni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.c) {
            case 0:
                return Optional.of(((psq) ((msq) this.a).d.b()).a(this.b.m(), false));
            case 1:
                return ((msx) ((msq) this.b).g.b()).d(albo.ag(this.a.m()));
            case 2:
                return ((msq) ((msr) this.b).b.b()).v(this.a);
            case 3:
                return ((msq) ((msr) this.a).b.b()).o((ParticipantsTable.BindData) this.b);
            case 4:
                return ((msq) ((msr) this.a).b.b()).s((ParticipantsTable.BindData) this.b);
            case 5:
                return ((msq) ((msr) this.a).b.b()).p((String) this.b);
            case 6:
                return ((msq) ((msr) this.a).b.b()).d((adit) this.b);
            case 7:
                return ((msq) ((msr) this.b).b.b()).v(this.a);
            case 8:
                return ((msq) ((msr) this.a).b.b()).n((String) this.b);
            case 9:
                return ((msq) ((msr) this.a).b.b()).r((String) this.b);
            case 10:
                return ((msq) ((msr) this.a).b.b()).q((ParticipantsTable.BindData) this.b);
            case 11:
                kor korVar = (kor) this.b.b();
                xnv xnvVar = (xnv) korVar.b.b();
                xnvVar.getClass();
                wfh wfhVar = (wfh) korVar.a.b();
                wfhVar.getClass();
                return new lfl(xnvVar, wfhVar, (ConversationId) this.a);
            case 12:
                boolean booleanValue = ((Boolean) muv.b.e()).booleanValue();
                Object obj = this.b;
                Object obj2 = this.a;
                mui muiVar = (mui) obj2;
                alhr alhrVar = muiVar.d;
                alhr alhrVar2 = muiVar.m;
                int i = 5;
                if (booleanValue) {
                    Optional of = Optional.of(obj2);
                    alhrVar2.getClass();
                    return ((kjp) obj).d(of, new lpn(alhrVar2, i), new lpn(alhrVar, 6));
                }
                Optional empty = Optional.empty();
                alhrVar2.getClass();
                return ((kjp) obj).d(empty, new lpn(alhrVar2, i), new lpn(alhrVar, 7));
            case 13:
                Stream map = Collection.EL.stream((alog) ((mui) this.b).h.get()).map(new mtm(3));
                int i2 = alog.d;
                return (alog) map.collect(alls.a);
            case 14:
                qdq qdqVar = (qdq) this.b.b();
                ((ncq) ((lfx) this.a).e.get()).getClass();
                return qdqVar.a;
            case 15:
                alwo alwoVar = DefaultRecipient.a;
                return ((kjp) this.b.b()).b(this.a);
            case 16:
                alwo alwoVar2 = DefaultRecipient.a;
                return lga.aG((ParticipantsTable.BindData) this.a);
            case 17:
                alwo alwoVar3 = DefaultRecipient.a;
                return lga.aH((ParticipantsTable.BindData) this.a);
            case 18:
                alwo alwoVar4 = DefaultRecipient.a;
                return ((kjp) this.b.b()).b(this.a);
            case 19:
                alwo alwoVar5 = DefaultRecipient.a;
                return lga.aG((ParticipantsTable.BindData) this.a);
            default:
                alwo alwoVar6 = DefaultRecipient.a;
                return lga.aH((ParticipantsTable.BindData) this.a);
        }
    }

    public /* synthetic */ msp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
