package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import com.google.android.ims.rcsmigration.File;
import com.google.android.ims.rcsmigration.FileTransfer;
import com.google.android.ims.rcsmigration.LegacyData;
import com.google.android.ims.rcsmigration.LegacyToken;
import com.google.android.ims.rcsmigration.RcsState;
import com.google.android.ims.rcsmigration.UndeliveredMessage;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferState;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adse implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public adse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new File(parcel);
            case 1:
                return new SingleRegistrationVendorImsServiceResult(parcel);
            case 2:
                return new FileTransfer(parcel);
            case 3:
                return new LegacyData(parcel);
            case 4:
                return new LegacyToken(parcel);
            case 5:
                return new RcsState(parcel);
            case 6:
                return new UndeliveredMessage(parcel);
            case 7:
                return new ChatSessionServiceResult(parcel);
            case 8:
                String readString = parcel.readString();
                if (readString != null) {
                    return (MessageRevocationSupportedResult) Enum.valueOf(MessageRevocationSupportedResult.class, readString);
                }
                return MessageRevocationSupportedResult.UNKNOWN;
            case 9:
                return new ContactsServiceResult(parcel);
            case 10:
                return new ImsCapabilities(parcel);
            case 11:
                try {
                    String readString2 = parcel.readString();
                    if (readString2 != null) {
                        if (readString2.length() == 1) {
                            return new Event(parcel);
                        }
                        Constructor<?> constructor = Class.forName(readString2).getConstructor(Parcel.class);
                        if (constructor != null) {
                            return (Event) constructor.newInstance(parcel);
                        }
                        advr.g("No constructor for Parcel found!", new Object[0]);
                        throw new IllegalStateException("No constructor for Parcel found!");
                    }
                    throw new IllegalArgumentException("Read String returned null.");
                } catch (Exception e) {
                    e.printStackTrace();
                    return new Event(parcel);
                }
            case 12:
                adxq adxqVar = new adxq();
                int P = abhi.P(parcel);
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 1) {
                        if (L != 2) {
                            abhi.ak(parcel, readInt);
                        } else {
                            adxqVar.d((FileInformation) abhi.V(parcel, readInt, FileInformation.CREATOR));
                        }
                    } else {
                        adxqVar.e(abhi.R(parcel, readInt));
                    }
                }
                return adxqVar.c();
            case 13:
                adtg adtgVar = new adtg();
                int P2 = abhi.P(parcel);
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    if (abhi.L(readInt2) != 1) {
                        abhi.ak(parcel, readInt2);
                    } else {
                        adtgVar.p(abhi.ab(parcel, readInt2));
                    }
                }
                return adtgVar.o();
            case 14:
                return new FileTransferInfo(parcel);
            case 15:
                adtg adtgVar2 = new adtg();
                int P3 = abhi.P(parcel);
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    if (abhi.L(readInt3) == 1) {
                        adtgVar2.n((adss) ajgk.B(parcel, readInt3, adss.class));
                    } else {
                        abhi.ak(parcel, readInt3);
                    }
                }
                return adtgVar2.m();
            case 16:
                return new FileTransferServiceResult(parcel);
            case 17:
                return new FileTransferState(parcel);
            case 18:
                adtg adtgVar3 = new adtg();
                int P4 = abhi.P(parcel);
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    if (abhi.L(readInt4) != 1) {
                        abhi.ak(parcel, readInt4);
                    } else {
                        adtgVar3.l(abhi.ab(parcel, readInt4));
                    }
                }
                return adtgVar3.k();
            case 19:
                adtg adtgVar4 = new adtg();
                int P5 = abhi.P(parcel);
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    if (abhi.L(readInt5) != 1) {
                        abhi.ak(parcel, readInt5);
                    } else {
                        adtgVar4.j((FileTransferResult) abhi.V(parcel, readInt5, FileTransferResult.CREATOR));
                    }
                }
                return adtgVar4.i();
            default:
                arbj arbjVar = new arbj();
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    int L2 = abhi.L(readInt6);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            if (L2 != 3) {
                                abhi.ak(parcel, readInt6);
                            } else {
                                arbjVar.ae((FileInformation) abhi.V(parcel, readInt6, FileInformation.CREATOR));
                            }
                        } else {
                            arbjVar.ad(abhi.ab(parcel, readInt6));
                        }
                    } else {
                        arbjVar.af(abhi.R(parcel, readInt6));
                    }
                }
                return arbjVar.ac();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new File[i];
            case 1:
                return new SingleRegistrationVendorImsServiceResult[i];
            case 2:
                return new FileTransfer[i];
            case 3:
                return new LegacyData[i];
            case 4:
                return new LegacyToken[i];
            case 5:
                return new RcsState[i];
            case 6:
                return new UndeliveredMessage[i];
            case 7:
                return new ChatSessionServiceResult[i];
            case 8:
                return new MessageRevocationSupportedResult[i];
            case 9:
                return new ContactsServiceResult[i];
            case 10:
                return new ImsCapabilities[i];
            case 11:
                return new Event[i];
            case 12:
                return new FileDownloadRequest[i];
            case 13:
                return new FileDownloadResult[i];
            case 14:
                return new FileTransferInfo[i];
            case 15:
                return new FileTransferResult[i];
            case 16:
                return new FileTransferServiceResult[i];
            case 17:
                return new FileTransferState[i];
            case 18:
                return new PauseDownloadRequest[i];
            case 19:
                return new PauseDownloadResult[i];
            default:
                return new ResumeDownloadRequest[i];
        }
    }
}
