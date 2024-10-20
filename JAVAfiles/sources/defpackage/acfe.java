package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.SyncSubPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.TrivialBigtableKeyValue;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfe implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acfe(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        Uri uri3 = null;
        SyncRequest syncRequest = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        Long l2 = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 1) {
                        if (L != 2) {
                            if (L != 3) {
                                abhi.ak(parcel, readInt);
                            } else {
                                j4 = abhi.Q(parcel, readInt);
                            }
                        } else {
                            j3 = abhi.Q(parcel, readInt);
                        }
                    } else {
                        j2 = abhi.Q(parcel, readInt);
                    }
                }
                abhi.aj(parcel, P);
                return new SyncStatus(j2, j3, j4);
            case 1:
                int P2 = abhi.P(parcel);
                int i7 = 0;
                boolean z2 = false;
                boolean z3 = false;
                SyncSubPolicy syncSubPolicy = null;
                SyncSubPolicy syncSubPolicy2 = null;
                SyncSubPolicy syncSubPolicy3 = null;
                SyncSubPolicy syncSubPolicy4 = null;
                Integer num = null;
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    switch (abhi.L(readInt2)) {
                        case 1:
                            i7 = abhi.N(parcel, readInt2);
                            break;
                        case 2:
                            syncSubPolicy = (SyncSubPolicy) abhi.V(parcel, readInt2, SyncSubPolicy.CREATOR);
                            break;
                        case 3:
                            syncSubPolicy2 = (SyncSubPolicy) abhi.V(parcel, readInt2, SyncSubPolicy.CREATOR);
                            break;
                        case 4:
                            syncSubPolicy3 = (SyncSubPolicy) abhi.V(parcel, readInt2, SyncSubPolicy.CREATOR);
                            break;
                        case 5:
                            syncSubPolicy4 = (SyncSubPolicy) abhi.V(parcel, readInt2, SyncSubPolicy.CREATOR);
                            break;
                        case 6:
                            num = abhi.Z(parcel, readInt2);
                            break;
                        case 7:
                            z2 = abhi.al(parcel, readInt2);
                            break;
                        case 8:
                            z3 = abhi.al(parcel, readInt2);
                            break;
                        default:
                            abhi.ak(parcel, readInt2);
                            break;
                    }
                }
                abhi.aj(parcel, P2);
                return new SyncPolicy(i7, syncSubPolicy, syncSubPolicy2, syncSubPolicy3, syncSubPolicy4, num, z2, z3);
            case 2:
                int P3 = abhi.P(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L2 = abhi.L(readInt3);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            abhi.ak(parcel, readInt3);
                        } else {
                            i8 = abhi.N(parcel, readInt3);
                        }
                    } else {
                        z = abhi.al(parcel, readInt3);
                    }
                }
                abhi.aj(parcel, P3);
                return new SyncSubPolicy(z, i8);
            case 3:
                int P4 = abhi.P(parcel);
                Long l3 = null;
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    int L3 = abhi.L(readInt4);
                    if (L3 != 1) {
                        if (L3 != 2) {
                            if (L3 != 3) {
                                abhi.ak(parcel, readInt4);
                            } else {
                                l3 = abhi.aa(parcel, readInt4);
                            }
                        } else {
                            l = abhi.aa(parcel, readInt4);
                        }
                    } else {
                        i6 = abhi.N(parcel, readInt4);
                    }
                }
                abhi.aj(parcel, P4);
                return new TimeSeriesFootprintsReadFilter(i6, l, l3);
            case 4:
                int P5 = abhi.P(parcel);
                Long l4 = null;
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    int L4 = abhi.L(readInt5);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            if (L4 != 3) {
                                abhi.ak(parcel, readInt5);
                            } else {
                                l4 = abhi.aa(parcel, readInt5);
                            }
                        } else {
                            l2 = abhi.aa(parcel, readInt5);
                        }
                    } else {
                        i5 = abhi.N(parcel, readInt5);
                    }
                }
                abhi.aj(parcel, P5);
                return new TimeSeriesFootprintsSubscriptionFilter(i5, l2, l4);
            case 5:
                int P6 = abhi.P(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    int L5 = abhi.L(readInt6);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            if (L5 != 3) {
                                abhi.ak(parcel, readInt6);
                            } else {
                                bArr6 = abhi.am(parcel, readInt6);
                            }
                        } else {
                            bArr5 = abhi.am(parcel, readInt6);
                        }
                    } else {
                        bArr4 = abhi.am(parcel, readInt6);
                    }
                }
                abhi.aj(parcel, P6);
                return new TrivialBigtableKeyValue(bArr4, bArr5, bArr6);
            case 6:
                int P7 = abhi.P(parcel);
                while (parcel.dataPosition() < P7) {
                    int readInt7 = parcel.readInt();
                    if (abhi.L(readInt7) != 1) {
                        abhi.ak(parcel, readInt7);
                    } else {
                        bArr3 = abhi.am(parcel, readInt7);
                    }
                }
                abhi.aj(parcel, P7);
                return new ByteArraySafeParcelable(bArr3);
            case 7:
                int P8 = abhi.P(parcel);
                while (parcel.dataPosition() < P8) {
                    int readInt8 = parcel.readInt();
                    if (abhi.L(readInt8) != 1) {
                        abhi.ak(parcel, readInt8);
                    } else {
                        arrayList = abhi.ah(parcel, readInt8, MdhFootprint.CREATOR);
                    }
                }
                abhi.aj(parcel, P8);
                return new MdhFootprintListSafeParcelable(arrayList);
            case 8:
                int P9 = abhi.P(parcel);
                while (parcel.dataPosition() < P9) {
                    int readInt9 = parcel.readInt();
                    int L6 = abhi.L(readInt9);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            abhi.ak(parcel, readInt9);
                        } else {
                            j = abhi.Q(parcel, readInt9);
                        }
                    } else {
                        str3 = abhi.ab(parcel, readInt9);
                    }
                }
                abhi.aj(parcel, P9);
                return new CallerInfo(str3, j);
            case 9:
                int P10 = abhi.P(parcel);
                while (parcel.dataPosition() < P10) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P10);
                return new SyncOptions();
            case 10:
                int P11 = abhi.P(parcel);
                SyncOptions syncOptions = null;
                while (parcel.dataPosition() < P11) {
                    int readInt10 = parcel.readInt();
                    int L7 = abhi.L(readInt10);
                    if (L7 != 1) {
                        if (L7 != 2) {
                            if (L7 != 3) {
                                abhi.ak(parcel, readInt10);
                            } else {
                                syncOptions = (SyncOptions) abhi.V(parcel, readInt10, SyncOptions.CREATOR);
                            }
                        } else {
                            bArr2 = abhi.am(parcel, readInt10);
                        }
                    } else {
                        i4 = abhi.N(parcel, readInt10);
                    }
                }
                abhi.aj(parcel, P11);
                return new SyncRequest(i4, bArr2, syncOptions);
            case 11:
                int P12 = abhi.P(parcel);
                while (parcel.dataPosition() < P12) {
                    int readInt11 = parcel.readInt();
                    if (abhi.L(readInt11) != 1) {
                        abhi.ak(parcel, readInt11);
                    } else {
                        bArr = abhi.am(parcel, readInt11);
                    }
                }
                abhi.aj(parcel, P12);
                return new SyncResult(bArr);
            case 12:
                int P13 = abhi.P(parcel);
                while (parcel.dataPosition() < P13) {
                    int readInt12 = parcel.readInt();
                    if (abhi.L(readInt12) != 1) {
                        abhi.ak(parcel, readInt12);
                    } else {
                        syncRequest = (SyncRequest) abhi.V(parcel, readInt12, SyncRequest.CREATOR);
                    }
                }
                abhi.aj(parcel, P13);
                return new TeleportingSyncRequest(syncRequest);
            case 13:
                int P14 = abhi.P(parcel);
                while (parcel.dataPosition() < P14) {
                    int readInt13 = parcel.readInt();
                    if (abhi.L(readInt13) != 1) {
                        abhi.ak(parcel, readInt13);
                    } else {
                        uri3 = (Uri) abhi.V(parcel, readInt13, Uri.CREATOR);
                    }
                }
                abhi.aj(parcel, P14);
                return new DeleteFileRequest(uri3);
            case 14:
                int P15 = abhi.P(parcel);
                while (parcel.dataPosition() < P15) {
                    int readInt14 = parcel.readInt();
                    int L8 = abhi.L(readInt14);
                    if (L8 != 1) {
                        if (L8 != 2) {
                            abhi.ak(parcel, readInt14);
                        } else {
                            i3 = abhi.N(parcel, readInt14);
                        }
                    } else {
                        uri2 = (Uri) abhi.V(parcel, readInt14, Uri.CREATOR);
                    }
                }
                abhi.aj(parcel, P15);
                return new OpenFileDescriptorRequest(uri2, i3);
            case 15:
                int P16 = abhi.P(parcel);
                while (parcel.dataPosition() < P16) {
                    int readInt15 = parcel.readInt();
                    if (abhi.L(readInt15) != 1) {
                        abhi.ak(parcel, readInt15);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) abhi.V(parcel, readInt15, ParcelFileDescriptor.CREATOR);
                    }
                }
                abhi.aj(parcel, P16);
                return new OpenFileDescriptorResponse(parcelFileDescriptor);
            case 16:
                int P17 = abhi.P(parcel);
                Uri uri4 = null;
                while (parcel.dataPosition() < P17) {
                    int readInt16 = parcel.readInt();
                    int L9 = abhi.L(readInt16);
                    if (L9 != 1) {
                        if (L9 != 2) {
                            abhi.ak(parcel, readInt16);
                        } else {
                            uri4 = (Uri) abhi.V(parcel, readInt16, Uri.CREATOR);
                        }
                    } else {
                        uri = (Uri) abhi.V(parcel, readInt16, Uri.CREATOR);
                    }
                }
                abhi.aj(parcel, P17);
                return new RenameRequest(uri, uri4);
            case 17:
                int P18 = abhi.P(parcel);
                String str4 = null;
                while (parcel.dataPosition() < P18) {
                    int readInt17 = parcel.readInt();
                    int L10 = abhi.L(readInt17);
                    if (L10 != 1) {
                        if (L10 != 2) {
                            if (L10 != 3) {
                                abhi.ak(parcel, readInt17);
                            } else {
                                i2 = abhi.N(parcel, readInt17);
                            }
                        } else {
                            str4 = abhi.ab(parcel, readInt17);
                        }
                    } else {
                        str2 = abhi.ab(parcel, readInt17);
                    }
                }
                abhi.aj(parcel, P18);
                return new ClassifyAccountTypeRequest(str2, str4, i2);
            case 18:
                int P19 = abhi.P(parcel);
                int i9 = 0;
                String str5 = null;
                while (parcel.dataPosition() < P19) {
                    int readInt18 = parcel.readInt();
                    int L11 = abhi.L(readInt18);
                    if (L11 != 1) {
                        if (L11 != 2) {
                            if (L11 != 3) {
                                if (L11 != 4) {
                                    abhi.ak(parcel, readInt18);
                                } else {
                                    i9 = abhi.N(parcel, readInt18);
                                }
                            } else {
                                i = abhi.N(parcel, readInt18);
                            }
                        } else {
                            str5 = abhi.ab(parcel, readInt18);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt18);
                    }
                }
                abhi.aj(parcel, P19);
                return new ClassifyAccountTypeResult(str, str5, i, i9);
            case 19:
                int P20 = abhi.P(parcel);
                String str6 = "";
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < P20) {
                    int readInt19 = parcel.readInt();
                    switch (abhi.L(readInt19)) {
                        case 1:
                            z4 = abhi.al(parcel, readInt19);
                            break;
                        case 2:
                            z5 = abhi.al(parcel, readInt19);
                            break;
                        case 3:
                            arrayList2 = abhi.ah(parcel, readInt19, Account.CREATOR);
                            break;
                        case 4:
                            arrayList3 = abhi.ah(parcel, readInt19, Account.CREATOR);
                            break;
                        case 5:
                            str6 = abhi.ab(parcel, readInt19);
                            break;
                        case 6:
                            z6 = abhi.al(parcel, readInt19);
                            break;
                        case 7:
                            arrayList4 = abhi.ah(parcel, readInt19, Account.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt19);
                            break;
                    }
                }
                abhi.aj(parcel, P20);
                return new ContactsConsentsCoarseStatus(z4, z5, arrayList2, arrayList3, str6, z6, arrayList4);
            default:
                int P21 = abhi.P(parcel);
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                Account account = null;
                String str7 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < P21) {
                    int readInt20 = parcel.readInt();
                    switch (abhi.L(readInt20)) {
                        case 1:
                            z7 = abhi.al(parcel, readInt20);
                            break;
                        case 2:
                            z8 = abhi.al(parcel, readInt20);
                            break;
                        case 3:
                            z9 = abhi.al(parcel, readInt20);
                            break;
                        case 4:
                            account = (Account) abhi.V(parcel, readInt20, Account.CREATOR);
                            break;
                        case 5:
                            z10 = abhi.al(parcel, readInt20);
                            break;
                        case 6:
                            z11 = abhi.al(parcel, readInt20);
                            break;
                        case 7:
                            str7 = abhi.ab(parcel, readInt20);
                            break;
                        case 8:
                            arrayList5 = abhi.ah(parcel, readInt20, Account.CREATOR);
                            break;
                        case 9:
                            z12 = abhi.al(parcel, readInt20);
                            break;
                        default:
                            abhi.ak(parcel, readInt20);
                            break;
                    }
                }
                abhi.aj(parcel, P21);
                return new ContactsConsentsConfig(z7, z8, z9, account, z10, z11, str7, arrayList5, z12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SyncStatus[i];
            case 1:
                return new SyncPolicy[i];
            case 2:
                return new SyncSubPolicy[i];
            case 3:
                return new TimeSeriesFootprintsReadFilter[i];
            case 4:
                return new TimeSeriesFootprintsSubscriptionFilter[i];
            case 5:
                return new TrivialBigtableKeyValue[i];
            case 6:
                return new ByteArraySafeParcelable[i];
            case 7:
                return new MdhFootprintListSafeParcelable[i];
            case 8:
                return new CallerInfo[i];
            case 9:
                return new SyncOptions[i];
            case 10:
                return new SyncRequest[i];
            case 11:
                return new SyncResult[i];
            case 12:
                return new TeleportingSyncRequest[i];
            case 13:
                return new DeleteFileRequest[i];
            case 14:
                return new OpenFileDescriptorRequest[i];
            case 15:
                return new OpenFileDescriptorResponse[i];
            case 16:
                return new RenameRequest[i];
            case 17:
                return new ClassifyAccountTypeRequest[i];
            case 18:
                return new ClassifyAccountTypeResult[i];
            case 19:
                return new ContactsConsentsCoarseStatus[i];
            default:
                return new ContactsConsentsConfig[i];
        }
    }
}
