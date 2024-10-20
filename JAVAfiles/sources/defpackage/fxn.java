package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxn {
    public final Context a;
    public final boolean b;
    public final fvj c;
    public final etu d;
    public final List e;
    public final Object f;
    public final List g;
    public final fwy h;
    public final Object i;
    public final Object j;
    public boolean k;
    public long l;
    public int m;
    public RuntimeException n;
    public volatile boolean o;
    public final hka p;
    public final gpx q;
    public final aqws r;
    public final arjs s;
    public final qdq t;
    private final etu u;
    private final HandlerThread v;

    /* JADX WARN: Multi-variable type inference failed */
    public fxn(Context context, hka hkaVar, fxh fxhVar, fvb fvbVar, dyf dyfVar, esi esiVar, fvl fvlVar, fwy fwyVar, qdq qdqVar, fwr fwrVar, etu etuVar, eqg eqgVar, eti etiVar) {
        this.a = context;
        this.p = hkaVar;
        this.c = new fvj(fvlVar);
        this.t = qdqVar;
        this.u = etuVar;
        this.h = fwyVar;
        Log.i("TransformerInternal", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-alpha01] [" + eul.e + "]");
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.v = handlerThread;
        handlerThread.start();
        this.e = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.f = new Object();
        this.q = new gpx(hkaVar);
        for (int i = 0; i < ((alog) hkaVar.d).size(); i++) {
            fxm fxmVar = new fxm(this, i, hkaVar, fxhVar, dyfVar, esiVar, fwrVar, eqgVar);
            atkn atknVar = (atkn) ((alog) hkaVar.d).get(i);
            this.e.add(new fxf(atknVar, fvbVar, new ita(fxhVar.d, hkaVar.b), fxmVar, etiVar, looper));
            boolean z = atknVar.a;
            this.m++;
        }
        this.b = this.m != ((alog) hkaVar.d).size();
        this.i = new Object();
        this.r = new aqws((char[]) null);
        this.j = new Object();
        this.s = new arjs();
        this.g = new ArrayList();
        this.d = etiVar.b(looper, new Handler.Callback() { // from class: fxk
            /* JADX WARN: Code restructure failed: missing block: B:140:0x03c1, code lost:
            
                if (defpackage.erl.b(r9.a.o) == r7) goto L203;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:126:0x03e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:165:0x0229 A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0247 A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:181:0x025f A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:191:0x02e5 A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:194:0x02f5 A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:205:0x0332  */
            /* JADX WARN: Removed duplicated region for block: B:207:0x0333  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x0276  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x029a  */
            /* JADX WARN: Removed duplicated region for block: B:222:0x02a6 A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:231:0x02be A[Catch: RuntimeException -> 0x035e, fwo -> 0x0362, TryCatch #28 {fwo -> 0x0362, RuntimeException -> 0x035e, blocks: (B:151:0x01c7, B:153:0x01cf, B:155:0x01d7, B:157:0x0204, B:159:0x020c, B:162:0x0213, B:163:0x0223, B:165:0x0229, B:170:0x023e, B:172:0x0247, B:177:0x0256, B:179:0x025b, B:181:0x025f, B:186:0x026f, B:189:0x02d4, B:191:0x02e5, B:192:0x02e8, B:194:0x02f5, B:203:0x0321, B:206:0x0334, B:212:0x027b, B:217:0x028f, B:220:0x029d, B:222:0x02a6, B:227:0x02b5, B:229:0x02ba, B:231:0x02be, B:236:0x02ce, B:127:0x03e5, B:129:0x03f0, B:70:0x0403, B:75:0x0445, B:79:0x0451, B:80:0x045e, B:83:0x046f, B:87:0x048e, B:139:0x03b0, B:143:0x03c8), top: B:150:0x01c7 }] */
            /* JADX WARN: Removed duplicated region for block: B:240:0x029c  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x007f A[Catch: fww -> 0x01a1, fuz -> 0x01ad, RuntimeException -> 0x064c, fwo -> 0x065e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x064c, blocks: (B:9:0x0013, B:18:0x0022, B:253:0x0043, B:255:0x004f, B:257:0x0053, B:259:0x005f, B:264:0x0070, B:266:0x007f, B:268:0x0093, B:271:0x009a, B:274:0x00aa, B:276:0x00c3, B:278:0x00c7, B:279:0x00cc, B:282:0x00d8, B:283:0x00e0, B:284:0x00e1, B:286:0x00f4, B:289:0x0136, B:292:0x0143, B:295:0x0157, B:297:0x015f, B:299:0x016f, B:301:0x017c, B:304:0x017f, B:306:0x0187, B:307:0x018c, B:311:0x0191, B:312:0x01a0, B:316:0x010e, B:317:0x0126, B:318:0x0127, B:327:0x01a3, B:328:0x01ac, B:323:0x01ae, B:324:0x01b8), top: B:8:0x0013 }] */
            /* JADX WARN: Removed duplicated region for block: B:270:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:273:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:276:0x00c3 A[Catch: fww -> 0x01a1, fuz -> 0x01ad, fwo -> 0x01b9, RuntimeException -> 0x064c, TRY_LEAVE, TryCatch #1 {fwo -> 0x01b9, blocks: (B:253:0x0043, B:255:0x004f, B:259:0x005f, B:264:0x0070, B:268:0x0093, B:271:0x009a, B:274:0x00aa, B:276:0x00c3, B:278:0x00c7, B:279:0x00cc, B:282:0x00d8, B:283:0x00e0, B:284:0x00e1, B:286:0x00f4, B:288:0x0101, B:289:0x0136, B:291:0x013b, B:292:0x0143, B:295:0x0157, B:297:0x015f, B:299:0x016f, B:301:0x017c, B:304:0x017f, B:306:0x0187, B:307:0x018c, B:311:0x0191, B:312:0x01a0, B:316:0x010e, B:317:0x0126, B:318:0x0127, B:327:0x01a3, B:328:0x01ac, B:323:0x01ae, B:324:0x01b8), top: B:252:0x0043 }] */
            /* JADX WARN: Removed duplicated region for block: B:286:0x00f4 A[Catch: fww -> 0x01a1, fuz -> 0x01ad, fwo -> 0x01b9, RuntimeException -> 0x064c, TRY_LEAVE, TryCatch #1 {fwo -> 0x01b9, blocks: (B:253:0x0043, B:255:0x004f, B:259:0x005f, B:264:0x0070, B:268:0x0093, B:271:0x009a, B:274:0x00aa, B:276:0x00c3, B:278:0x00c7, B:279:0x00cc, B:282:0x00d8, B:283:0x00e0, B:284:0x00e1, B:286:0x00f4, B:288:0x0101, B:289:0x0136, B:291:0x013b, B:292:0x0143, B:295:0x0157, B:297:0x015f, B:299:0x016f, B:301:0x017c, B:304:0x017f, B:306:0x0187, B:307:0x018c, B:311:0x0191, B:312:0x01a0, B:316:0x010e, B:317:0x0126, B:318:0x0127, B:327:0x01a3, B:328:0x01ac, B:323:0x01ae, B:324:0x01b8), top: B:252:0x0043 }] */
            /* JADX WARN: Removed duplicated region for block: B:294:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:306:0x0187 A[Catch: fww -> 0x01a1, fuz -> 0x01ad, fwo -> 0x01b9, RuntimeException -> 0x064c, TRY_LEAVE, TryCatch #1 {fwo -> 0x01b9, blocks: (B:253:0x0043, B:255:0x004f, B:259:0x005f, B:264:0x0070, B:268:0x0093, B:271:0x009a, B:274:0x00aa, B:276:0x00c3, B:278:0x00c7, B:279:0x00cc, B:282:0x00d8, B:283:0x00e0, B:284:0x00e1, B:286:0x00f4, B:288:0x0101, B:289:0x0136, B:291:0x013b, B:292:0x0143, B:295:0x0157, B:297:0x015f, B:299:0x016f, B:301:0x017c, B:304:0x017f, B:306:0x0187, B:307:0x018c, B:311:0x0191, B:312:0x01a0, B:316:0x010e, B:317:0x0126, B:318:0x0127, B:327:0x01a3, B:328:0x01ac, B:323:0x01ae, B:324:0x01b8), top: B:252:0x0043 }] */
            /* JADX WARN: Removed duplicated region for block: B:318:0x0127 A[Catch: fww -> 0x01a1, fuz -> 0x01ad, fwo -> 0x01b9, RuntimeException -> 0x064c, TryCatch #1 {fwo -> 0x01b9, blocks: (B:253:0x0043, B:255:0x004f, B:259:0x005f, B:264:0x0070, B:268:0x0093, B:271:0x009a, B:274:0x00aa, B:276:0x00c3, B:278:0x00c7, B:279:0x00cc, B:282:0x00d8, B:283:0x00e0, B:284:0x00e1, B:286:0x00f4, B:288:0x0101, B:289:0x0136, B:291:0x013b, B:292:0x0143, B:295:0x0157, B:297:0x015f, B:299:0x016f, B:301:0x017c, B:304:0x017f, B:306:0x0187, B:307:0x018c, B:311:0x0191, B:312:0x01a0, B:316:0x010e, B:317:0x0126, B:318:0x0127, B:327:0x01a3, B:328:0x01ac, B:323:0x01ae, B:324:0x01b8), top: B:252:0x0043 }] */
            /* JADX WARN: Removed duplicated region for block: B:319:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:320:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x03f9  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x03ff A[Catch: fuz -> 0x0552, RuntimeException -> 0x0589, fwo -> 0x0591, TRY_ENTER, TRY_LEAVE, TryCatch #11 {fuz -> 0x0552, blocks: (B:58:0x036d, B:61:0x03e0, B:68:0x03ff, B:73:0x0408, B:81:0x0464, B:85:0x0483, B:133:0x0393, B:136:0x039e, B:141:0x03c4, B:144:0x03d5), top: B:57:0x036d }] */
            /* JADX WARN: Type inference failed for: r1v0, types: [fxk] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v25 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v9, types: [fxn] */
            /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Message] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v17 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r8v23 */
            /* JADX WARN: Type inference failed for: r8v31 */
            /* JADX WARN: Type inference failed for: r8v7, types: [int] */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean handleMessage(android.os.Message r30) {
                /*
                    Method dump skipped, instructions count: 1640
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fxk.handleMessage(android.os.Message):boolean");
            }
        });
    }

    public final void a(int i, fwo fwoVar) {
        fwo fwoVar2;
        fwo fwoVar3;
        char c;
        alob alobVar = new alob();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            fxf fxfVar = (fxf) this.e.get(i2);
            fxfVar.j();
            alobVar.j(fxfVar.e.g());
        }
        boolean z = this.o;
        fwo fwoVar4 = null;
        if (!this.o) {
            this.o = true;
            synchronized (this.j) {
            }
            Log.i("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-alpha01] [" + eul.e + "] [" + erf.a() + "]");
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                try {
                    ((fxb) this.g.get(i3)).d();
                } catch (RuntimeException e) {
                    if (fwoVar4 == null) {
                        fwoVar4 = new fwo("Unexpected runtime error", e, 1001);
                        this.n = e;
                    }
                }
            }
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                try {
                    ((fxf) this.e.get(i4)).f();
                } catch (RuntimeException e2) {
                    if (fwoVar4 == null) {
                        fwoVar4 = new fwo("Unexpected runtime error", e2, 1001);
                        this.n = e2;
                    }
                }
            }
            try {
                try {
                    fwy fwyVar = this.h;
                    if (i == 0) {
                        c = 0;
                    } else if (i == 1) {
                        c = 1;
                    } else {
                        c = 2;
                        if (i != 2) {
                            throw new IllegalStateException(a.bV(i, "Unexpected end reason "));
                        }
                    }
                    fwyVar.h = false;
                    fwyVar.e.shutdownNow();
                    fva fvaVar = fwyVar.p;
                    if (fvaVar != null) {
                        try {
                            fva fvaVar2 = ((fvy) fvaVar).a;
                            if (!((fws) fvaVar2).g) {
                                if (!((fws) fvaVar2).f) {
                                    ((fws) fvaVar2).a();
                                }
                                ((fws) fvaVar2).f = false;
                                try {
                                    try {
                                        MediaMuxer mediaMuxer = ((fws) fvaVar2).c;
                                        try {
                                            mediaMuxer.stop();
                                        } catch (RuntimeException e3) {
                                            if (eul.a < 30) {
                                                try {
                                                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                                                    declaredField.setAccessible(true);
                                                    Integer num = (Integer) declaredField.get(mediaMuxer);
                                                    num.intValue();
                                                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                                                    declaredField2.setAccessible(true);
                                                    declaredField2.set(mediaMuxer, num);
                                                } catch (Exception unused) {
                                                }
                                            }
                                            throw e3;
                                        }
                                    } finally {
                                        ((fws) fvaVar2).c.release();
                                        ((fws) fvaVar2).g = true;
                                    }
                                } catch (RuntimeException e4) {
                                    throw new fuz("Failed to stop the MediaMuxer", e4);
                                }
                            }
                        } catch (fuz e5) {
                            if (c == 1) {
                                String message = e5.getMessage();
                                dzg.g(message);
                                if (message.equals("Failed to stop the MediaMuxer")) {
                                }
                            }
                            throw e5;
                        }
                    }
                } catch (RuntimeException e6) {
                    if (fwoVar4 == null) {
                        fwoVar3 = new fwo("Unexpected runtime error", e6, 1001);
                        this.n = e6;
                        fwoVar4 = fwoVar3;
                    }
                }
            } catch (fuz e7) {
                if (fwoVar4 == null) {
                    fwoVar3 = new fwo("Muxer error", e7, 7001);
                    fwoVar4 = fwoVar3;
                }
            }
            etu etuVar = this.d;
            HandlerThread handlerThread = this.v;
            handlerThread.getClass();
            etuVar.b(new fhg(handlerThread, 19));
        }
        if (i == 1) {
            this.r.h();
            return;
        }
        if (fwoVar != null) {
            fwoVar2 = fwoVar;
        } else {
            fwoVar2 = fwoVar4;
        }
        if (fwoVar2 != null) {
            if (z) {
                Log.w("TransformerInternal", "Export error after export ended", fwoVar2);
                return;
            } else {
                dzg.d(this.u.b(new faq(this, alobVar, fwoVar2, 9, (short[]) null)));
                return;
            }
        }
        if (z) {
            return;
        }
        dzg.d(this.u.b(new fhh(this, alobVar, 6)));
    }

    public final void b(fwo fwoVar) {
        c();
        this.d.i(2, fwoVar).f();
    }

    public final void c() {
        dzg.e(this.v.isAlive(), "Internal thread is dead.");
    }
}
