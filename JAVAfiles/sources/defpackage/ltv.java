package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ltv(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v70, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v73, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [qwe] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [armf, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        qpc qpcVar;
        boolean z;
        boolean z2;
        arrj arrjVar = null;
        Long l = null;
        switch (this.a) {
            case 0:
                apbt b = aowt.b(parcel, ltu.a, aozs.a());
                b.getClass();
                return new RepliedToDataAdapter((ltu) b);
            case 1:
                parcel.getClass();
                return new EditedMedia(parcel.readString(), (Uri) parcel.readParcelable(EditedMedia.class.getClassLoader()));
            case 2:
                throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
            case 3:
                Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
                readBundle.getClass();
                apdj apdjVar = (apdj) readBundle.getParcelable("proto");
                apdjVar.getClass();
                return new BugleConversationId(ruy.b(((mpi) apdjVar.a(mpi.a, aozs.a())).c));
            case 4:
                Bundle readBundle2 = parcel.readBundle(getClass().getClassLoader());
                readBundle2.getClass();
                apdj apdjVar2 = (apdj) readBundle2.getParcelable("proto");
                apdjVar2.getClass();
                mpj mpjVar = (mpj) apdjVar2.a(mpj.a, aozs.a());
                return ((DefaultConversation.a) yyb.aL(DefaultConversation.a.class)).QV().i(new BugleConversationId(ruy.b(mpjVar.b)), mpjVar.c);
            case 5:
                Bundle readBundle3 = parcel.readBundle(getClass().getClassLoader());
                readBundle3.getClass();
                apdj apdjVar3 = (apdj) readBundle3.getParcelable("proto");
                apdjVar3.getClass();
                mpj mpjVar2 = (mpj) apdjVar3.a(mpj.a, aozs.a());
                EmergencySosConversation.a aVar = (EmergencySosConversation.a) yyb.aL(EmergencySosConversation.a.class);
                return aVar.Qs().k(aVar.ai().A(new BugleConversationId(ruy.b(mpjVar2.b)), mpjVar2.c));
            case 6:
                Bundle readBundle4 = parcel.readBundle(getClass().getClassLoader());
                readBundle4.getClass();
                apdj apdjVar4 = (apdj) readBundle4.getParcelable("proto");
                apdjVar4.getClass();
                return new EmergencySosConversationId(ruy.b(((mpi) apdjVar4.a(mpi.a, aozs.a())).c));
            case 7:
                Bundle readBundle5 = parcel.readBundle(getClass().getClassLoader());
                readBundle5.getClass();
                apdj apdjVar5 = (apdj) readBundle5.getParcelable("proto");
                apdjVar5.getClass();
                mpj mpjVar3 = (mpj) apdjVar5.a(mpj.a, aozs.a());
                PenpalBotConversation.a aVar2 = (PenpalBotConversation.a) yyb.aL(PenpalBotConversation.a.class);
                return aVar2.Qk().j(aVar2.ai().A(new BugleConversationId(ruy.b(mpjVar3.b)), mpjVar3.c), aVar2.ai());
            case 8:
                Bundle readBundle6 = parcel.readBundle(getClass().getClassLoader());
                readBundle6.getClass();
                apdj apdjVar6 = (apdj) readBundle6.getParcelable("proto");
                apdjVar6.getClass();
                return new PenpalBotConversationId(ruy.b(((mpi) apdjVar6.a(mpi.a, aozs.a())).c));
            case 9:
                Bundle readBundle7 = parcel.readBundle(getClass().getClassLoader());
                readBundle7.getClass();
                apdj apdjVar7 = (apdj) readBundle7.getParcelable("proto");
                apdjVar7.getClass();
                mpj mpjVar4 = (mpj) apdjVar7.a(mpj.a, aozs.a());
                RbmConversation.a aVar3 = (RbmConversation.a) yyb.aL(RbmConversation.a.class);
                return aVar3.Te().A(aVar3.ai().A(new BugleConversationId(ruy.b(mpjVar4.b)), mpjVar4.c));
            case 10:
                Bundle readBundle8 = parcel.readBundle(getClass().getClassLoader());
                readBundle8.getClass();
                apdj apdjVar8 = (apdj) readBundle8.getParcelable("proto");
                apdjVar8.getClass();
                return new RbmConversationId(ruy.b(((mpi) apdjVar8.a(mpi.a, aozs.a())).c));
            case 11:
                return new CoreBugleMessageId(MessageIdType.CREATOR.createFromParcel(parcel), parcel.readLong(), rve.a(parcel.readString()), rve.a(parcel.readString()));
            case 12:
                return new CoreBuglePartialMessageId(MessageIdType.CREATOR.createFromParcel(parcel), parcel.readLong());
            case 13:
                DefaultRecipient.a aVar4 = (DefaultRecipient.a) yyb.aL(DefaultRecipient.a.class);
                Bundle readBundle9 = parcel.readBundle(getClass().getClassLoader());
                readBundle9.getClass();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) readBundle9.getParcelable("participant");
                bindData.getClass();
                ProfilesTable.BindData bindData2 = (ProfilesTable.BindData) readBundle9.getParcelable("profile");
                lqn QE = aVar4.QE();
                apdj apdjVar9 = (apdj) readBundle9.getParcelable("identity");
                apdjVar9.getClass();
                msh k = QE.k(apdjVar9);
                tde PU = aVar4.PU();
                Context context = (Context) PU.o.b();
                context.getClass();
                anen anenVar = (anen) PU.i.b();
                anenVar.getClass();
                anen anenVar2 = (anen) PU.j.b();
                anenVar2.getClass();
                ?? r8 = PU.k;
                ?? r9 = PU.p;
                ?? r10 = PU.d;
                ?? r11 = PU.f;
                ?? r12 = PU.e;
                ?? r13 = PU.l;
                ?? r14 = PU.s;
                ?? r15 = PU.g;
                ?? r2 = PU.a;
                psw pswVar = (psw) PU.r.b();
                pswVar.getClass();
                ?? r22 = PU.n;
                ?? r23 = PU.t;
                ?? r24 = PU.h;
                ?? r25 = PU.q;
                ?? r26 = PU.m;
                ?? r27 = PU.c;
                nej nejVar = (nej) PU.b.b();
                nejVar.getClass();
                return new DefaultRecipient(context, anenVar, anenVar2, r8, r9, r10, r11, r12, r13, r14, r15, r2, pswVar, r22, r23, r24, r25, r26, r27, nejVar, PU.u, bindData, bindData2, k);
            case 14:
                parcel.getClass();
                apdj apdjVar10 = (apdj) parcel.readParcelable(ngd.class.getClassLoader());
                if (apdjVar10 != null) {
                    ngd ngdVar = (ngd) apdjVar10.a(lga.aF(ngd.a.createBuilder()).x(), aozs.a());
                    String str = ngdVar.c;
                    str.getClass();
                    if ((ngdVar.b & 2) != 0) {
                        ngc ngcVar = ngdVar.d;
                        if (ngcVar == null) {
                            ngcVar = ngc.a;
                        }
                        arrjVar = qwe.a(ngcVar.b);
                    }
                    return new SelfIdentityIdImpl(str, Optional.ofNullable(arrjVar));
                }
                throw new IllegalStateException("Self identity id parcelable does not exist.");
            case 15:
                parcel.getClass();
                IncomingDraft incomingDraft = (IncomingDraft) parcel.readParcelable(ComposeRowState.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    qpcVar = null;
                } else {
                    qpcVar = (qpc) Enum.valueOf(qpc.class, parcel.readString());
                }
                return new ComposeRowState(incomingDraft, qpcVar, arrjVar);
            case 16:
                parcel.getClass();
                return new EditingData((MessageId) parcel.readParcelable(EditingData.class.getClassLoader()), parcel.readString(), (MessageId) parcel.readParcelable(EditingData.class.getClassLoader()));
            case 17:
                parcel.getClass();
                String readString = parcel.readString();
                Uri uri = (Uri) parcel.readParcelable(IncomingDraft.Attachment.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new IncomingDraft.Attachment(readString, uri, l);
            case 18:
                parcel.getClass();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(IncomingDraft.Attachment.CREATOR.createFromParcel(parcel));
                }
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Instant instant = (Instant) parcel.readSerializable();
                EditingData editingData = (EditingData) parcel.readParcelable(IncomingDraft.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new IncomingDraft(readString2, arrayList, readString3, z, instant, editingData, z2);
            case 19:
                return ((ChangeParticipantsAction.a) yyb.aL(ChangeParticipantsAction.a.class)).Nb().c(parcel);
            default:
                return ((CheckActiveDesktopIsAliveAsyncAction.a) yyb.aL(CheckActiveDesktopIsAliveAsyncAction.a.class)).Nc().c(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RepliedToDataAdapter[i];
            case 1:
                return new EditedMedia[i];
            case 2:
                return new InvalidConversationId[i];
            case 3:
                return new BugleConversationId[i];
            case 4:
                return new DefaultConversation[i];
            case 5:
                return new EmergencySosConversation[i];
            case 6:
                return new EmergencySosConversationId[i];
            case 7:
                return new PenpalBotConversation[i];
            case 8:
                return new PenpalBotConversationId[i];
            case 9:
                return new RbmConversation[i];
            case 10:
                return new RbmConversationId[i];
            case 11:
                return new MessageId[i];
            case 12:
                return new MessageId[i];
            case 13:
                return new DefaultRecipient[i];
            case 14:
                return new SelfIdentityIdImpl[i];
            case 15:
                return new ComposeRowState[i];
            case 16:
                return new EditingData[i];
            case 17:
                return new IncomingDraft.Attachment[i];
            case 18:
                return new IncomingDraft[i];
            case 19:
                return new ChangeParticipantsAction[i];
            default:
                return new CheckActiveDesktopIsAliveAsyncAction[i];
        }
    }
}
