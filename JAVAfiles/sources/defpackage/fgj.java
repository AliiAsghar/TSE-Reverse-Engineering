package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgj implements fgu {
    public frj a;
    private final fgi b;
    private boolean c;

    public fgj(Context context, flx flxVar) {
        evm evmVar = new evm(context);
        fri friVar = new fri(1);
        this.a = friVar;
        fgi fgiVar = new fgi(flxVar, friVar);
        this.b = fgiVar;
        if (evmVar != fgiVar.d) {
            fgiVar.d = evmVar;
            fgiVar.b.clear();
            fgiVar.c.clear();
        }
        this.c = true;
    }

    public static fgu a(Class cls, evf evfVar) {
        try {
            return (fgu) cls.getConstructor(evf.class).newInstance(evfVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fgu
    public final fgx b(ere ereVar) {
        fgh fghVar;
        dzg.g(ereVar.b);
        String scheme = ereVar.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(ereVar.b.b, "application/x-image-uri")) {
            erb erbVar = ereVar.b;
            int o = eul.o(erbVar.a, erbVar.b);
            if (ereVar.b.i != -9223372036854775807L) {
                ((flq) this.b.a).c();
            }
            try {
                fgi fgiVar = this.b;
                Map map = fgiVar.c;
                Integer valueOf = Integer.valueOf(o);
                fgu fguVar = (fgu) map.get(valueOf);
                int i = 0;
                int i2 = 1;
                if (fguVar == null) {
                    alhr alhrVar = (alhr) fgiVar.b.get(valueOf);
                    if (alhrVar == null) {
                        evf evfVar = fgiVar.d;
                        dzg.g(evfVar);
                        if (o != 0) {
                            if (o != 1) {
                                int i3 = 2;
                                if (o != 2) {
                                    int i4 = 3;
                                    if (o != 3) {
                                        alhrVar = new fgh(fgiVar, evfVar, i4);
                                    } else {
                                        alhrVar = new ezp(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(fgu.class), 11);
                                    }
                                } else {
                                    alhrVar = new fgh(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(fgu.class), evfVar, i3);
                                }
                                fgiVar.b.put(valueOf, alhrVar);
                            } else {
                                fghVar = new fgh(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(fgu.class), evfVar, i);
                            }
                        } else {
                            fghVar = new fgh(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(fgu.class), evfVar, i2);
                        }
                        alhrVar = fghVar;
                        fgiVar.b.put(valueOf, alhrVar);
                    }
                    fguVar = (fgu) alhrVar.get();
                    fguVar.d(fgiVar.f);
                    fguVar.c(fgiVar.e);
                    fgiVar.c.put(valueOf, fguVar);
                }
                era eraVar = ereVar.c;
                eqz eqzVar = new eqz(eraVar);
                if (eraVar.a == -9223372036854775807L) {
                    eqzVar.a = -9223372036854775807L;
                }
                if (eraVar.d == -3.4028235E38f) {
                    eqzVar.d = -3.4028235E38f;
                }
                if (eraVar.e == -3.4028235E38f) {
                    eqzVar.e = -3.4028235E38f;
                }
                if (eraVar.b == -9223372036854775807L) {
                    eqzVar.b = -9223372036854775807L;
                }
                if (eraVar.c == -9223372036854775807L) {
                    eqzVar.c = -9223372036854775807L;
                }
                era eraVar2 = new era(eqzVar);
                if (!eraVar2.equals(eraVar)) {
                    equ equVar = new equ(ereVar);
                    equVar.c = new eqz(eraVar2);
                    ereVar = equVar.a();
                }
                fgx b = fguVar.b(ereVar);
                alog alogVar = ereVar.b.g;
                if (!alogVar.isEmpty()) {
                    alsx alsxVar = (alsx) alogVar;
                    fgx[] fgxVarArr = new fgx[alsxVar.c + 1];
                    fgxVarArr[0] = b;
                    int i5 = 0;
                    while (i5 < alsxVar.c) {
                        if (!this.c) {
                            int i6 = i5 + 1;
                            fgxVarArr[i6] = new fhz((erd) alogVar.get(i5));
                            i5 = i6;
                        } else {
                            eqm eqmVar = new eqm();
                            String str = ((erd) alogVar.get(i5)).b;
                            eqmVar.b(null);
                            String str2 = ((erd) alogVar.get(i5)).c;
                            eqmVar.d = null;
                            int i7 = ((erd) alogVar.get(i5)).d;
                            eqmVar.e = 0;
                            int i8 = ((erd) alogVar.get(i5)).e;
                            eqmVar.f = 0;
                            String str3 = ((erd) alogVar.get(i5)).f;
                            eqmVar.b = null;
                            String str4 = ((erd) alogVar.get(i5)).g;
                            eqmVar.a = null;
                            new eqn(eqmVar);
                            Uri uri = ((erd) alogVar.get(i5)).a;
                            throw null;
                        }
                    }
                    b = new fhf(fgxVarArr);
                }
                long j = ereVar.e.b;
                if (j != 0) {
                    b = new fgb(b, j, true);
                }
                dzg.g(ereVar.b);
                eqt eqtVar = ereVar.b.d;
                return b;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j2 = ereVar.b.i;
        int i9 = eul.a;
        throw null;
    }

    @Override // defpackage.fgu
    @Deprecated
    public final /* bridge */ /* synthetic */ void c(boolean z) {
        this.c = z;
        fgi fgiVar = this.b;
        fgiVar.e = z;
        ((flq) fgiVar.a).b(z);
        Iterator it = fgiVar.c.values().iterator();
        while (it.hasNext()) {
            ((fgu) it.next()).c(z);
        }
    }

    @Override // defpackage.fgu
    public final /* bridge */ /* synthetic */ void d(frj frjVar) {
        dzg.g(frjVar);
        this.a = frjVar;
        fgi fgiVar = this.b;
        fgiVar.f = frjVar;
        ((flq) fgiVar.a).d(frjVar);
        Iterator it = fgiVar.c.values().iterator();
        while (it.hasNext()) {
            ((fgu) it.next()).d(frjVar);
        }
    }
}
