package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import io.grpc.Status;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxx {
    private static final aqun a = new aqxw(null, true);

    private aqxx() {
    }

    public static aqut a(Parcel parcel, aqrm aqrmVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new aqut();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            int i4 = i + 4;
            byte[] c = c(parcel, readInt2, i4);
            int i5 = i4 + readInt2;
            int i6 = i3 + i3;
            objArr[i6] = c;
            int readInt3 = parcel.readInt();
            i = i5 + 4;
            if (readInt3 == -1) {
                aqwt aqwtVar = (aqwt) aqrmVar.a(aqxh.h);
                if (aqwtVar.b) {
                    int dataPosition = parcel.dataPosition();
                    try {
                        Parcelable readParcelable = parcel.readParcelable(aqxx.class.getClassLoader());
                        if (readParcelable != null) {
                            objArr[i6 + 1] = new aquq(a, readParcelable);
                            i2 += parcel.dataPosition() - dataPosition;
                            int i7 = aqwtVar.c;
                            if (i2 > 32768) {
                                throw Status.j.withDescription("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)").asException();
                            }
                        } else {
                            throw Status.m.withDescription("Read null parcelable in metadata").asException();
                        }
                    } catch (AndroidRuntimeException e) {
                        throw Status.m.d(e).withDescription("Failure reading parcelable in metadata").asException();
                    }
                } else {
                    throw Status.h.withDescription("Parcelable metadata values not allowed").asException();
                }
            } else if (readInt3 >= 0) {
                byte[] c2 = c(parcel, readInt3, i);
                i += readInt3;
                objArr[i6 + 1] = c2;
            } else {
                throw Status.m.withDescription("Unrecognized metadata sentinel").asException();
            }
        }
        Charset charset = aqth.a;
        return new aqut(readInt, objArr);
    }

    public static void b(Parcel parcel, aqut aqutVar) {
        int i;
        int length;
        int read;
        if (aqutVar != null) {
            Charset charset = aqth.a;
            i = aqutVar.f;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = aqth.a;
        Object[] objArr = new Object[aqutVar.a()];
        for (int i2 = 0; i2 < aqutVar.f; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = aqutVar.l(i2);
            int i4 = i3 + 1;
            Object c = aqutVar.c(i2);
            if (!(c instanceof byte[])) {
                c = ((aquq) c).b();
            }
            objArr[i4] = c;
        }
        parcel.writeInt(i);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 + i5;
            byte[] bArr = (byte[]) objArr[i6];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i6 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof aqyh) {
                parcel.writeInt(-1);
                ((aqyh) obj).a(parcel);
            } else {
                byte[] b = aqxm.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i7 = 0;
                    while (true) {
                        length = b.length;
                        if (i7 >= length || (read = inputStream.read(b, i7, length - i7)) == -1) {
                            break;
                        } else {
                            i7 += read;
                        }
                    }
                    if (i7 != length) {
                        parcel.writeInt(i7);
                        if (i7 > 0) {
                            parcel.writeByteArray(b, 0, i7);
                        }
                    } else {
                        throw Status.j.withDescription("Metadata value too large").asException();
                    }
                } finally {
                    aqxm.a(b);
                }
            }
        }
    }

    private static byte[] c(Parcel parcel, int i, int i2) {
        if (i2 + i <= 8192) {
            byte[] bArr = new byte[i];
            if (i > 0) {
                parcel.readByteArray(bArr);
            }
            return bArr;
        }
        throw Status.j.withDescription("Metadata too large").asException();
    }
}
