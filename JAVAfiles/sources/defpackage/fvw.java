package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvw implements fvl {
    public final Context a;
    public final fxt b;

    public fvw(ktk ktkVar) {
        this.a = (Context) ktkVar.a;
        this.b = (fxt) ktkVar.c;
    }

    public static fwo a(eqn eqnVar, String str) {
        return fwo.b(new IllegalArgumentException(str), 4003, new fwn(eqnVar.toString(), erl.j(eqnVar.o), false, null));
    }

    public static fwo b(eqn eqnVar, boolean z) {
        String str;
        if (z && eqd.i(eqnVar.C)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: ".concat(String.valueOf(String.valueOf(eqnVar.C)));
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return fwo.b(new IllegalArgumentException(str), 4003, new fwn(eqnVar.toString(), z, false, null));
    }

    public static alog c(List list, fvv fvvVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) list.get(i2);
            int a = fvvVar.a(mediaCodecInfo);
            if (a != Integer.MAX_VALUE) {
                if (a < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = a;
                } else if (a == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return alog.n(arrayList);
    }
}
