package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvr implements fvk {
    public final Context a;
    private final ffj b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ffj] */
    public fvr(fvq fvqVar) {
        this.a = (Context) fvqVar.a;
        this.b = fvqVar.b;
    }

    public static fwo b(eqn eqnVar, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String eqnVar2 = eqnVar.toString();
        String str2 = eqnVar.o;
        dzg.g(str2);
        return fwo.b(illegalArgumentException, 3003, new fwn(eqnVar2, erl.j(str2), true, null));
    }

    public final fvp a(MediaFormat mediaFormat, eqn eqnVar, Surface surface, boolean z) {
        int i = alog.d;
        alog alogVar = alsx.a;
        dzg.g(eqnVar.o);
        try {
            List d = ffp.d(ffp.f(eqnVar, false, false), eqnVar);
            if (!d.isEmpty()) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < d.size(); i2++) {
                        ffe ffeVar = (ffe) d.get(i2);
                        if (!ffeVar.g) {
                            arrayList.add(ffeVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        d = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Context context = this.a;
                for (ffe ffeVar2 : d.subList(0, 1)) {
                    mediaFormat.setString("mime", ffeVar2.c);
                    try {
                        fvp fvpVar = new fvp(context, eqnVar, mediaFormat, ffeVar2.a, true, surface);
                        fvpVar.d();
                        return fvpVar;
                    } catch (fwo e) {
                        arrayList2.add(e);
                    }
                }
                throw ((fwo) arrayList2.get(0));
            }
            throw b(eqnVar, "No decoders for format");
        } catch (ffn e2) {
            eub.d("DefaultDecoderFactory", "Error querying decoders", e2);
            throw b(eqnVar, "Querying codecs failed");
        }
    }
}
