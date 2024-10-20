package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.AutoValue_Conversation;
import com.google.android.rcs.client.messaging.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.AutoValue_JoinGroupRequest;
import com.google.android.rcs.client.messaging.AutoValue_MessageNotification;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.GroupInformation;
import com.google.android.rcs.client.messaging.GroupMember;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajog implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ajog(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.Collection, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                aoad aoadVar = new aoad(null, null, null, null, null);
                int P = abhi.P(parcel);
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 1) {
                        if (L != 2) {
                            if (L != 3) {
                                if (L != 4) {
                                    abhi.ak(parcel, readInt);
                                } else {
                                    byte[] am = abhi.am(parcel, readInt);
                                    if (am != null) {
                                        aoadVar.aa(aozb.w(am));
                                    }
                                }
                            } else {
                                aoadVar.ab((RcsDestinationId) abhi.V(parcel, readInt, RcsDestinationId.CREATOR));
                            }
                        } else {
                            aoadVar.Y((Conversation) abhi.V(parcel, readInt, Conversation.CREATOR));
                        }
                    } else {
                        aoadVar.Z(abhi.R(parcel, readInt));
                    }
                }
                return aoadVar.X();
            case 1:
                return new RcsEngineLifecycleServiceResult(parcel);
            case 2:
                aodz aodzVar = new aodz((char[]) null);
                int P2 = abhi.P(parcel);
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    if (abhi.L(readInt2) != 1) {
                        abhi.ak(parcel, readInt2);
                    } else {
                        aodzVar.C((MessagingResult) abhi.V(parcel, readInt2, MessagingResult.CREATOR));
                    }
                }
                return aodzVar.B();
            case 3:
                int i = a.aI()[((Integer) ajro.d(parcel, 1).get()).intValue()];
                if (i != 0) {
                    String str = (String) ajro.h(parcel, 2).get();
                    ajpu ajpuVar = (ajpu) ajro.f(parcel, 3, ajrp.a).get();
                    d.s(ajro.j(parcel).isPresent());
                    return new AutoValue_Conversation(i, ajpuVar, str);
                }
                throw new NullPointerException("Null type");
            case 4:
                asmg asmgVar = new asmg(null, null, null);
                int P3 = abhi.P(parcel);
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L2 = abhi.L(readInt3);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            if (L2 != 3) {
                                if (L2 != 4) {
                                    if (L2 != 5) {
                                        abhi.ak(parcel, readInt3);
                                    } else {
                                        byte[] am2 = abhi.am(parcel, readInt3);
                                        if (am2 != null) {
                                            asmgVar.E(aozb.w(am2));
                                        }
                                    }
                                } else {
                                    asmgVar.D(abhi.ah(parcel, readInt3, RcsDestinationId.CREATOR));
                                }
                            } else {
                                asmgVar.F(abhi.ab(parcel, readInt3));
                            }
                        } else {
                            asmgVar.B(abhi.ab(parcel, readInt3));
                        }
                    } else {
                        asmgVar.C(abhi.R(parcel, readInt3));
                    }
                }
                return asmgVar.A();
            case 5:
                aodz aodzVar2 = new aodz((char[]) null);
                int P4 = abhi.P(parcel);
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    if (abhi.L(readInt4) != 1) {
                        abhi.ak(parcel, readInt4);
                    } else {
                        aodzVar2.A((MessagingResult) abhi.V(parcel, readInt4, MessagingResult.CREATOR));
                    }
                }
                return aodzVar2.z();
            case 6:
                ajph b = GetGroupNotificationsRequest.b();
                int P5 = abhi.P(parcel);
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    if (abhi.L(readInt5) != 1) {
                        abhi.ak(parcel, readInt5);
                    } else {
                        b.b(abhi.N(parcel, readInt5));
                    }
                }
                return b.a();
            case 7:
                ajur ajurVar = new ajur(null);
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    int L3 = abhi.L(readInt6);
                    if (L3 != 1) {
                        if (L3 != 2) {
                            abhi.ak(parcel, readInt6);
                        } else {
                            ajurVar.w(abhi.ah(parcel, readInt6, GroupNotification.CREATOR));
                        }
                    } else {
                        ajurVar.x((MessagingResult) abhi.V(parcel, readInt6, MessagingResult.CREATOR));
                    }
                }
                return ajurVar.v();
            case 8:
                akia c = GetMessagesRequest.c();
                int P7 = abhi.P(parcel);
                while (parcel.dataPosition() < P7) {
                    int readInt7 = parcel.readInt();
                    int L4 = abhi.L(readInt7);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            abhi.ak(parcel, readInt7);
                        } else {
                            c.d((TraceId) abhi.V(parcel, readInt7, TraceId.CREATOR));
                        }
                    } else {
                        c.c(abhi.N(parcel, readInt7));
                    }
                }
                return c.b();
            case 9:
                ajur ajurVar2 = new ajur(null);
                int P8 = abhi.P(parcel);
                while (parcel.dataPosition() < P8) {
                    int readInt8 = parcel.readInt();
                    int L5 = abhi.L(readInt8);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            abhi.ak(parcel, readInt8);
                        } else {
                            ajurVar2.t(abhi.ah(parcel, readInt8, MessageNotification.CREATOR));
                        }
                    } else {
                        ajurVar2.u((MessagingResult) abhi.V(parcel, readInt8, MessagingResult.CREATOR));
                    }
                }
                return ajurVar2.s();
            case 10:
                anzh anzhVar = new anzh(null, null, null);
                anzhVar.f = (String) ajro.h(parcel, 1).get();
                anzhVar.s((String) ajro.h(parcel, 2).get());
                anzhVar.r((String) ajro.h(parcel, 3).get());
                ?? r2 = ajro.g(parcel, 4, GroupMember.CREATOR).get();
                if (anzhVar.a == null) {
                    anzhVar.g = alog.n(r2);
                    anzhVar.d = ajro.f(parcel, 5, ajrf.a);
                    anzhVar.e = ajro.f(parcel, 6, ajrq.a);
                    d.s(ajro.j(parcel).isPresent());
                    return anzhVar.q();
                }
                throw new IllegalStateException("Cannot set groupMembers after calling groupMembersBuilder()");
            case 11:
                ajyt e = GroupMember.e();
                e.c = (ajpu) ajro.f(parcel, 1, ajrp.a).get();
                e.j((String) ajro.h(parcel, 2).get());
                e.e = ajro.f(parcel, 3, ajrp.a);
                if (((Integer) ajro.d(parcel, 4).get()).intValue() != 1) {
                    z = false;
                }
                e.k(z);
                d.s(ajro.j(parcel).isPresent());
                return e.i();
            case 12:
                com.google.android.rcs.client.messaging.Conversation conversation = (com.google.android.rcs.client.messaging.Conversation) ajro.f(parcel, 1, com.google.android.rcs.client.messaging.Conversation.CREATOR).get();
                GroupInformation groupInformation = (GroupInformation) ajro.f(parcel, 2, GroupInformation.CREATOR).get();
                d.s(ajro.j(parcel).isPresent());
                return new AutoValue_GroupNotification(conversation, groupInformation);
            case 13:
                ajur ajurVar3 = new ajur(null);
                int P9 = abhi.P(parcel);
                while (parcel.dataPosition() < P9) {
                    int readInt9 = parcel.readInt();
                    int L6 = abhi.L(readInt9);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            abhi.ak(parcel, readInt9);
                        } else {
                            ajurVar3.q((Conversation) abhi.V(parcel, readInt9, Conversation.CREATOR));
                        }
                    } else {
                        ajurVar3.r((MessagingResult) abhi.V(parcel, readInt9, MessagingResult.CREATOR));
                    }
                }
                return ajurVar3.p();
            case 14:
                int P10 = abhi.P(parcel);
                Conversation conversation2 = null;
                while (parcel.dataPosition() < P10) {
                    int readInt10 = parcel.readInt();
                    int L7 = abhi.L(readInt10);
                    if (L7 != 1) {
                        if (L7 != 2) {
                            abhi.ak(parcel, readInt10);
                        } else {
                            conversation2 = (Conversation) abhi.V(parcel, readInt10, Conversation.CREATOR);
                            if (conversation2 == null) {
                                throw new NullPointerException("Null conversation");
                            }
                        }
                    } else {
                        pendingIntent = abhi.R(parcel, readInt10);
                        if (pendingIntent == null) {
                            throw new NullPointerException("Null intent");
                        }
                    }
                }
                if (pendingIntent != null && conversation2 != null) {
                    return new AutoValue_JoinGroupRequest(pendingIntent, conversation2);
                }
                StringBuilder sb = new StringBuilder();
                if (pendingIntent == null) {
                    sb.append(" intent");
                }
                if (conversation2 == null) {
                    sb.append(" conversation");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 15:
                aodz aodzVar3 = new aodz((char[]) null);
                int P11 = abhi.P(parcel);
                while (parcel.dataPosition() < P11) {
                    int readInt11 = parcel.readInt();
                    if (abhi.L(readInt11) != 1) {
                        abhi.ak(parcel, readInt11);
                    } else {
                        aodzVar3.y((MessagingResult) abhi.V(parcel, readInt11, MessagingResult.CREATOR));
                    }
                }
                return aodzVar3.x();
            case 16:
                com.google.android.rcs.client.messaging.Conversation conversation3 = (com.google.android.rcs.client.messaging.Conversation) ajro.f(parcel, 1, com.google.android.rcs.client.messaging.Conversation.CREATOR).get();
                ajpo ajpoVar = (ajpo) ajro.f(parcel, 2, ajrk.a).get();
                d.s(ajro.j(parcel).isPresent());
                return new AutoValue_MessageNotification(conversation3, ajpoVar);
            case 17:
                ajyt f = MessagingOperationResult.f();
                int P12 = abhi.P(parcel);
                while (parcel.dataPosition() < P12) {
                    int readInt12 = parcel.readInt();
                    int L8 = abhi.L(readInt12);
                    if (L8 != 1) {
                        if (L8 != 2) {
                            if (L8 != 3) {
                                if (L8 != 4) {
                                    abhi.ak(parcel, readInt12);
                                } else {
                                    f.f(abhi.al(parcel, readInt12));
                                }
                            } else {
                                f.g(abhi.ab(parcel, readInt12));
                            }
                        } else {
                            f.e((Conversation) abhi.V(parcel, readInt12, Conversation.CREATOR));
                        }
                    } else {
                        f.h((MessagingResult) abhi.V(parcel, readInt12, MessagingResult.CREATOR));
                    }
                }
                return f.d();
            case 18:
                int P13 = abhi.P(parcel);
                ajps d = MessagingResult.d();
                while (parcel.dataPosition() < P13) {
                    int readInt13 = parcel.readInt();
                    int L9 = abhi.L(readInt13);
                    if (L9 == 1) {
                        d.c(abhi.N(parcel, readInt13));
                    } else if (L9 == 2) {
                        d.b(abhi.N(parcel, readInt13));
                    } else if (L9 == 3) {
                        d.d(Duration.ofSeconds(abhi.Q(parcel, readInt13)));
                    } else {
                        abhi.ak(parcel, readInt13);
                    }
                }
                return d.a();
            case 19:
                aoad aoadVar2 = new aoad((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
                int P14 = abhi.P(parcel);
                while (parcel.dataPosition() < P14) {
                    int readInt14 = parcel.readInt();
                    int L10 = abhi.L(readInt14);
                    if (L10 != 1) {
                        if (L10 != 2) {
                            if (L10 != 3) {
                                if (L10 != 4) {
                                    abhi.ak(parcel, readInt14);
                                } else {
                                    byte[] am3 = abhi.am(parcel, readInt14);
                                    if (am3 != null) {
                                        aoadVar2.R(aozb.w(am3));
                                    }
                                }
                            } else {
                                aoadVar2.S((RcsDestinationId) abhi.V(parcel, readInt14, RcsDestinationId.CREATOR));
                            }
                        } else {
                            aoadVar2.P((Conversation) abhi.V(parcel, readInt14, Conversation.CREATOR));
                        }
                    } else {
                        aoadVar2.Q(abhi.R(parcel, readInt14));
                    }
                }
                return aoadVar2.O();
            default:
                aodz aodzVar4 = new aodz((char[]) null);
                int P15 = abhi.P(parcel);
                while (parcel.dataPosition() < P15) {
                    int readInt15 = parcel.readInt();
                    if (abhi.L(readInt15) != 1) {
                        abhi.ak(parcel, readInt15);
                    } else {
                        aodzVar4.w((MessagingResult) abhi.V(parcel, readInt15, MessagingResult.CREATOR));
                    }
                }
                return aodzVar4.v();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AddUserToGroupRequest[i];
            case 1:
                return new RcsEngineLifecycleServiceResult[i];
            case 2:
                return new AddUserToGroupResponse[i];
            case 3:
                return new com.google.android.rcs.client.messaging.Conversation[i];
            case 4:
                return new CreateGroupRequest[i];
            case 5:
                return new CreateGroupResponse[i];
            case 6:
                return new GetGroupNotificationsRequest[i];
            case 7:
                return new GetGroupNotificationsResponse[i];
            case 8:
                return new GetMessagesRequest[i];
            case 9:
                return new GetMessagesResponse[i];
            case 10:
                return new GroupInformation[i];
            case 11:
                return new GroupMember[i];
            case 12:
                return new com.google.android.rcs.client.messaging.GroupNotification[i];
            case 13:
                return new GroupOperationResult[i];
            case 14:
                return new JoinGroupRequest[i];
            case 15:
                return new JoinGroupResponse[i];
            case 16:
                return new com.google.android.rcs.client.messaging.MessageNotification[i];
            case 17:
                return new MessagingOperationResult[i];
            case 18:
                return new MessagingResult[i];
            case 19:
                return new RemoveUserFromGroupRequest[i];
            default:
                return new RemoveUserFromGroupResponse[i];
        }
    }
}
