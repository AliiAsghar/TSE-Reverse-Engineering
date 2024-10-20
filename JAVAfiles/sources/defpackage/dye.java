package defpackage;

import android.app.Notification;
import android.content.ClipData;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dye {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Icon a(Notification.Action action) {
        return action.getIcon();
    }

    public static Bundle[] b(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
            bundle.putParcelableArray(str, bundleArr);
            return bundleArr;
        }
        return (Bundle[]) parcelableArray;
    }

    public static dzw[] c(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        dzw[] dzwVarArr = new dzw[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add(stringArrayList.get(i2));
                }
            }
            dzwVarArr[i] = new dzw(bundle.getString("resultKey"), bundle.getCharSequence(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return dzwVarArr;
    }

    public static final ecv d(ecq ecqVar) {
        return ecqVar.a();
    }

    public static final void e(ClipData clipData, ecq ecqVar) {
        ecqVar.b(clipData);
    }

    public static void f(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void g(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void h(int i, String str) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(Object obj) {
        obj.getClass();
    }

    public static void j(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
        } else {
            throw new IllegalArgumentException("id cannot be empty");
        }
    }

    public static boolean k(flv flvVar) {
        euf eufVar = new euf(8);
        int i = atgu.a(flvVar, eufVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        flvVar.j(eufVar.a, 0, 4);
        eufVar.J(0);
        int e = eufVar.e();
        if (e != 1463899717) {
            eub.c("WavHeaderReader", a.bV(e, "Unsupported form type: "));
            return false;
        }
        return true;
    }

    public static int l(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long m(euf eufVar, int i, int i2) {
        eufVar.J(i);
        if (eufVar.b() >= 5) {
            int e = eufVar.e();
            if ((8388608 & e) == 0 && ((e >> 8) & 8191) == i2 && (e & 32) != 0 && eufVar.j() >= 7 && eufVar.b() >= 7 && (eufVar.j() & 16) == 16) {
                byte[] bArr = new byte[6];
                eufVar.E(bArr, 0, 6);
                long j = bArr[0];
                long j2 = bArr[1];
                long j3 = bArr[2];
                long j4 = bArr[3] & 255;
                return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static int n(fjl fjlVar, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        albo.cQ(albo.cQ(i4, i5), 1 << i3);
        if (fjlVar.f() < i) {
            return -1;
        }
        int i6 = fjlVar.i(i);
        if (i6 == i4) {
            if (fjlVar.f() < i2) {
                return -1;
            }
            int i7 = fjlVar.i(i2);
            int i8 = i6 + i7;
            if (i7 == i5) {
                if (fjlVar.f() < i3) {
                    return -1;
                }
                return i8 + fjlVar.i(i3);
            }
            return i8;
        }
        return i6;
    }

    public static void o(fjl fjlVar) {
        fjlVar.s(3);
        fjlVar.s(8);
        boolean u = fjlVar.u();
        boolean u2 = fjlVar.u();
        if (u) {
            fjlVar.s(5);
        }
        if (u2) {
            fjlVar.s(6);
        }
    }

    public static void p(fjl fjlVar) {
        int i;
        int i2;
        int i3 = fjlVar.i(2);
        int i4 = 6;
        if (i3 == 0) {
            fjlVar.s(6);
            return;
        }
        int i5 = 5;
        int n = n(fjlVar, 5, 8, 16) + 1;
        if (i3 == 1) {
            fjlVar.s(n * 7);
            return;
        }
        if (i3 == 2) {
            boolean u = fjlVar.u();
            if (true != u) {
                i = 5;
            } else {
                i = 1;
            }
            if (true == u) {
                i5 = 7;
            }
            if (true == u) {
                i4 = 8;
            }
            int i6 = 0;
            while (i6 < n) {
                if (fjlVar.u()) {
                    fjlVar.s(7);
                    i2 = 0;
                } else {
                    if (fjlVar.i(2) == 3 && fjlVar.i(i5) * i != 0) {
                        fjlVar.r();
                    }
                    i2 = fjlVar.i(i4) * i;
                    if (i2 != 0 && i2 != 180) {
                        fjlVar.r();
                    }
                    fjlVar.r();
                }
                if (i2 != 0 && i2 != 180 && fjlVar.u()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static boolean q(fjl fjlVar) {
        fjlVar.s(3);
        boolean u = fjlVar.u();
        if (u) {
            fjlVar.s(13);
        }
        return u;
    }

    public static atgu r(int i, flv flvVar, euf eufVar) {
        atgu a = atgu.a(flvVar, eufVar);
        while (true) {
            int i2 = a.a;
            if (i2 != i) {
                eub.f("WavHeaderReader", a.bV(i2, "Ignoring unknown WAV chunk: "));
                long j = a.b;
                long j2 = 8 + j;
                if ((1 & j) != 0) {
                    j2 = j + 9;
                }
                if (j2 <= 2147483647L) {
                    flvVar.m((int) j2);
                    a = atgu.a(flvVar, eufVar);
                } else {
                    throw new erm("Chunk is too large (~2GB+) to skip; id: " + a.a, null, false, 1);
                }
            } else {
                return a;
            }
        }
    }
}
