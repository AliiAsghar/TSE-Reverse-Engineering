package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(Notification.Action action) {
        return action.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(Notification.Action action) {
        return action.getRemoteInputs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r4 = r4.getBubbleMetadata();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.dyr c(android.app.Notification r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L23
            android.app.Notification$BubbleMetadata r4 = defpackage.coj$$ExternalSyntheticApiModelOutline1.m(r4)
            if (r4 != 0) goto Le
            goto L1d
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L19
            dyr r1 = defpackage.dyq.b(r4)
            goto L1d
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 == r2) goto L1e
        L1d:
            return r1
        L1e:
            dyr r4 = defpackage.dyp.d(r4)
            return r4
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyd.c(android.app.Notification):dyr");
    }

    public static boolean d(Notification notification) {
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public static void e(Object obj) {
        obj.getClass();
    }

    public static void f(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Objects.toString(file2);
            Log.e("AtomicFile", "Failed to delete file which is a directory ".concat(String.valueOf(file2)));
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", a.cd(file2, file, "Failed to rename ", " to "));
        }
    }

    public static boolean g(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void h(File file, File file2, File file3) {
        file.delete();
        file2.delete();
        file3.delete();
    }

    public static byte[] i(byte[] bArr, UUID uuid) {
        apuv o = o(bArr);
        if (o == null) {
            return null;
        }
        if (!uuid.equals(o.b)) {
            eub.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid.toString() + ", got: " + o.b.toString() + ".");
            return null;
        }
        return (byte[]) o.c;
    }

    public static int j(euf eufVar) {
        int e = eufVar.e();
        if (eufVar.e() == 1684108385) {
            eufVar.K(8);
            int i = e - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (eufVar.d() & 128) == 0) {
                            return eufVar.m();
                        }
                    } else {
                        return eufVar.l();
                    }
                } else {
                    return eufVar.n();
                }
            } else {
                return eufVar.j();
            }
        }
        eub.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static fom k(int i, String str, euf eufVar, boolean z, boolean z2) {
        int j = j(eufVar);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j >= 0) {
            if (z) {
                return new Cfor(str, null, alog.r(Integer.toString(j)));
            }
            return new foj("und", str, Integer.toString(j));
        }
        eub.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(eup.e(i)));
        return null;
    }

    public static Cfor l(int i, String str, euf eufVar) {
        int e = eufVar.e();
        if (eufVar.e() == 1684108385 && e >= 22) {
            eufVar.K(10);
            int n = eufVar.n();
            if (n > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(n);
                String sb2 = sb.toString();
                int n2 = eufVar.n();
                if (n2 > 0) {
                    sb2 = sb2 + "/" + n2;
                }
                return new Cfor(str, null, alog.r(sb2));
            }
        }
        eub.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(eup.e(i)));
        return null;
    }

    public static Cfor m(int i, String str, euf eufVar) {
        int e = eufVar.e();
        if (eufVar.e() == 1684108385) {
            eufVar.K(8);
            return new Cfor(str, null, alog.r(eufVar.x(e - 16)));
        }
        eub.f("MetadataUtil", "Failed to parse text attribute: ".concat(eup.e(i)));
        return null;
    }

    public static final long n(fmf fmfVar, long j) {
        if (j != -1 && j != 0) {
            return eul.v((j * fmfVar.g) - 1, fmfVar.d);
        }
        return -9223372036854775807L;
    }

    public static apuv o(byte[] bArr) {
        euf eufVar = new euf(bArr);
        if (eufVar.c < 32) {
            return null;
        }
        eufVar.J(0);
        int b = eufVar.b();
        int e = eufVar.e();
        if (e != b) {
            eub.f("PsshAtomUtil", a.bU(b, e, "Advertised atom size (", ") does not match buffer size: "));
            return null;
        }
        int e2 = eufVar.e();
        if (e2 != 1886614376) {
            eub.f("PsshAtomUtil", a.bV(e2, "Atom type is not pssh: "));
            return null;
        }
        int b2 = fpz.b(eufVar.e());
        if (b2 > 1) {
            eub.f("PsshAtomUtil", a.bV(b2, "Unsupported pssh version: "));
            return null;
        }
        UUID uuid = new UUID(eufVar.q(), eufVar.q());
        if (b2 == 1) {
            int m = eufVar.m();
            UUID[] uuidArr = new UUID[m];
            for (int i = 0; i < m; i++) {
                uuidArr[i] = new UUID(eufVar.q(), eufVar.q());
            }
        }
        int m2 = eufVar.m();
        int b3 = eufVar.b();
        if (m2 != b3) {
            eub.f("PsshAtomUtil", a.bU(b3, m2, "Atom data size (", ") does not match the bytes left: "));
            return null;
        }
        byte[] bArr2 = new byte[m2];
        eufVar.E(bArr2, 0, m2);
        return new apuv(uuid, b2, bArr2);
    }
}
