package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import com.google.android.ims.util.Content;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public adsv(int i) {
        this.a = i;
    }

    public static final ImsEvent a(Parcel parcel) {
        try {
            String readString = parcel.readString();
            if (!TextUtils.equals(readString, ImsEvent.class.getName()) && readString != null) {
                Constructor<?> constructor = Class.forName(readString).getConstructor(Parcel.class);
                if (constructor != null) {
                    return (ImsEvent) constructor.newInstance(parcel);
                }
                advr.g("No constructor for Parcel found!", new Object[0]);
                throw new IllegalStateException("No constructor for Parcel found!");
            }
            return new ImsEvent(parcel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return new ImsEvent(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        int i;
        char c2;
        int i2;
        Integer num = null;
        char c3 = 65535;
        int i3 = 3;
        boolean z = true;
        switch (this.a) {
            case 0:
                return new GroupInfo(parcel);
            case 1:
                adtg adtgVar = new adtg();
                int P = abhi.P(parcel);
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    if (abhi.L(readInt) != 1) {
                        abhi.ak(parcel, readInt);
                    } else {
                        adtgVar.h((FileTransferResult) abhi.V(parcel, readInt, FileTransferResult.CREATOR));
                    }
                }
                return adtgVar.g();
            case 2:
                return new UserInfo(parcel);
            case 3:
                return a(parcel);
            case 4:
                return new ImsRegistrationState(parcel);
            case 5:
                return new adsx((aplh) aowt.e(parcel, aplh.a, aozs.a()));
            case 6:
                return new adsy((aplj) aowt.e(parcel, aplj.a, aozs.a()));
            case 7:
                return new LocationInformation(parcel);
            case 8:
                return new LocationSharingResult(parcel);
            case 9:
                return new RcsProfileServiceResult(parcel);
            case 10:
                return new TransportControlServiceResult(parcel);
            case 11:
                return new TransportOptions(parcel);
            case 12:
                return new Content(parcel);
            case 13:
                int P2 = abhi.P(parcel);
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    if (abhi.L(readInt2) != 1) {
                        abhi.ak(parcel, readInt2);
                    } else {
                        num = abhi.Z(parcel, readInt2);
                    }
                }
                abhi.aj(parcel, P2);
                return new aeey(num);
            case 14:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                switch (readString2.hashCode()) {
                    case -2130433380:
                        if (readString2.equals("INTENT")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case -975978826:
                        if (readString2.equals("INPUT_METHOD_EDITOR")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 433141802:
                        if (readString2.equals("UNKNOWN")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 1186196854:
                        if (readString2.equals("CLIPBOARD")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 1564508962:
                        if (readString2.equals("DRAG_AND_DROP")) {
                            c3 = 4;
                            break;
                        }
                        break;
                }
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 == 4) {
                                    i3 = 5;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                i3 = 4;
                            }
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
                return new afcm(readString, i3);
            case 15:
                parcel.getClass();
                String readString3 = parcel.readString();
                if (readString3.hashCode() == -1854434950 && readString3.equals("SCOTTY")) {
                    return new afcn();
                }
                throw new IllegalArgumentException();
            case 16:
                parcel.getClass();
                parcel.readInt();
                return afco.a;
            case 17:
                parcel.getClass();
                parcel.readInt();
                return afct.a;
            case 18:
                parcel.getClass();
                parcel.readInt();
                return afge.a;
            case 19:
                parcel.getClass();
                parcel.readInt();
                return afgf.a;
            default:
                parcel.getClass();
                String readString4 = parcel.readString();
                int hashCode = readString4.hashCode();
                if (hashCode != 1148007465) {
                    if (hashCode != 1430738957) {
                        if (hashCode == 2040383032 && readString4.equals("POPUP_CAMERA")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (readString4.equals("MINI_CAMERA")) {
                            c = 0;
                        }
                        c = 65535;
                    }
                } else {
                    if (readString4.equals("FULLSCREEN_CAMERA")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c == 2) {
                            i = 3;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                String readString5 = parcel.readString();
                int hashCode2 = readString5.hashCode();
                if (hashCode2 != 2030823) {
                    if (hashCode2 != 67167753) {
                        if (hashCode2 == 433141802 && readString5.equals("UNKNOWN")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else {
                        if (readString5.equals("FRONT")) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (readString5.equals("BACK")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 == 2) {
                            i2 = 3;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
                String readString6 = parcel.readString();
                int hashCode3 = readString6.hashCode();
                if (hashCode3 != -77725029) {
                    if (hashCode3 != 433141802) {
                        if (hashCode3 == 1511893915 && readString6.equals("PORTRAIT")) {
                            c3 = 1;
                        }
                    } else if (readString6.equals("UNKNOWN")) {
                        c3 = 0;
                    }
                } else if (readString6.equals("LANDSCAPE")) {
                    c3 = 2;
                }
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 != 2) {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                Integer num2 = num;
                if (readInt3 == 0) {
                    z = false;
                }
                return new afgh(i, i2, i3, z, num2, parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GroupInfo[i];
            case 1:
                return new ResumeDownloadResult[i];
            case 2:
                return new UserInfo[i];
            case 3:
                return new ImsEvent[i];
            case 4:
                return new ImsRegistrationState[i];
            case 5:
                return new InitializeAndStartRcsTransportRequest[i];
            case 6:
                return new StopAllRcsTransportsExceptRequest[i];
            case 7:
                return new LocationInformation[i];
            case 8:
                return new LocationSharingResult[i];
            case 9:
                return new RcsProfileServiceResult[i];
            case 10:
                return new TransportControlServiceResult[i];
            case 11:
                return new TransportOptions[i];
            case 12:
                return new Content[i];
            case 13:
                return new aeey[i];
            case 14:
                return new afcm[i];
            case 15:
                return new afcn[i];
            case 16:
                return new afco[i];
            case 17:
                return new afct[i];
            case 18:
                return new afge[i];
            case 19:
                return new afgf[i];
            default:
                return new afgh[i];
        }
    }
}
