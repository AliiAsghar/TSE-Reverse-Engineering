package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.android.libraries.glide.fife.module.FifeGlideModule;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bwj;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hld {
    public hld() {
    }

    public static jhq A(Bundle bundle) {
        if (bundle.containsKey("COMPOSE_ROW_MODE")) {
            return jhq.values()[bundle.getInt("COMPOSE_ROW_MODE")];
        }
        return null;
    }

    public static void B(Bundle bundle, jhq jhqVar) {
        if (jhqVar == null) {
            bundle.remove("COMPOSE_ROW_MODE");
        } else {
            bundle.putInt("COMPOSE_ROW_MODE", jhqVar.ordinal());
        }
    }

    private static boolean C(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() - i >= i2) {
            return true;
        }
        return false;
    }

    public static ListenableFuture a(hlp hlpVar) {
        return ancj.f(d.m(new hml(hlpVar)), new ihl(1), hyn.b);
    }

    public static Bitmap b(InputStream inputStream, BitmapFactory.Options options) {
        Bitmap.Config config;
        boolean z;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT == 34 && hud.a(options)) {
            Bitmap.Config config4 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config4 == config) {
                z = true;
            } else {
                z = false;
            }
            hwr.e(z);
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                if (decodeStream == null) {
                    config3 = Bitmap.Config.HARDWARE;
                } else {
                    try {
                        bitmap = c(decodeStream);
                        decodeStream.recycle();
                        config3 = Bitmap.Config.HARDWARE;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = decodeStream;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        config2 = Bitmap.Config.HARDWARE;
                        options.inPreferredConfig = config2;
                        throw th;
                    }
                }
                options.inPreferredConfig = config3;
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
    }

    public static Bitmap c(Bitmap bitmap) {
        Gainmap gainmap;
        Bitmap.Config config;
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        boolean z;
        float[] ratioMin;
        float[] ratioMax;
        float[] gamma;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        try {
            gainmap = bitmap.getGainmap();
            if (gainmap != null) {
                gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                    ColorMatrixColorFilter colorMatrixColorFilter = hub.a;
                    gainmapContents2 = gainmap.getGainmapContents();
                    if (gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8) {
                        if (gainmapContents2.getConfig() == Bitmap.Config.ALPHA_8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hwr.e(z);
                        Bitmap createBitmap = Bitmap.createBitmap(gainmapContents2.getWidth(), gainmapContents2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        paint.setColorFilter(hub.a);
                        canvas.drawBitmap(gainmapContents2, brg.a, brg.a, paint);
                        canvas.setBitmap(null);
                        Gainmap gainmap2 = new Gainmap(createBitmap);
                        ratioMin = gainmap.getRatioMin();
                        gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                        ratioMax = gainmap.getRatioMax();
                        gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                        gamma = gainmap.getGamma();
                        gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                        epsilonSdr = gainmap.getEpsilonSdr();
                        gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                        epsilonHdr = gainmap.getEpsilonHdr();
                        gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                        gainmap2.setDisplayRatioForFullHdr(displayRatioForFullHdr);
                        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                        gainmap2.setMinDisplayRatioForHdrTransition(minDisplayRatioForHdrTransition);
                        gainmap = gainmap2;
                    }
                    bitmap.setGainmap(gainmap);
                }
            }
            config = Bitmap.Config.HARDWARE;
            return bitmap.copy(config, false);
        } finally {
            bitmap.recycle();
        }
    }

    public static int d(int i, ByteBuffer byteBuffer) {
        if (C(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static short e(int i, ByteBuffer byteBuffer) {
        if (C(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public static /* synthetic */ String f(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "RBM_BLOCK";
                }
                return "GROUP_SPAM";
            }
            return "SPAM";
        }
        return "BLOCK";
    }

    public static /* synthetic */ String g(int i) {
        if (i != 1) {
            return "LIGHTER_CONVERSATION_TARGET";
        }
        return "PARTICIPANT";
    }

    public static /* synthetic */ String h(int i) {
        if (i != 1) {
            return "RBM_BLOCK_AND_REPORT_SPAM_DIALOG_SOURCE";
        }
        return "BLOCK_AND_REPORT_SPAM_DIALOG_SOURCE";
    }

    public static /* synthetic */ String i(int i) {
        if (i != 1) {
            return "LIGHTER_CONVERSATION_ID";
        }
        return "PARTICIPANT";
    }

    public static ihd j(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        return new igh(bindData);
    }

    public static /* synthetic */ armo k(Boolean bool, boolean z) {
        if (d.F(bool, false) && z) {
            return new armo(bool, null);
        }
        if (d.F(bool, false) && !z) {
            return new armo(bool, false);
        }
        return new armo(null, Boolean.valueOf(z));
    }

    public static void m(Context context, hkz hkzVar, mgu mguVar, List list, hwq hwqVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FifeGlideModule fifeGlideModule = (FifeGlideModule) it.next();
            try {
                mguVar.x(String.class, InputStream.class, new hsq(6));
                mguVar.x(String.class, ByteBuffer.class, new hsq(5));
                mguVar.v(agqj.class, ByteBuffer.class, new hsq(3));
                mguVar.v(agqj.class, InputStream.class, new hsq(4));
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(fifeGlideModule.getClass().getName())), e);
            }
        }
        if (hwqVar != null) {
            hwqVar.d(context, hkzVar, mguVar);
        }
    }

    public static Set n() {
        return (Set) joe.b.a();
    }

    public static /* synthetic */ jnd o() {
        return new jnd(new jno(afsz.b, new afsp(null, 7), null), false);
    }

    public static MediaViewerItem p(jha jhaVar, afsp afspVar) {
        afso afsoVar;
        jgz jgzVar;
        Uri uri;
        afcq q = q(jhaVar);
        if (q instanceof afso) {
            afsoVar = (afso) q;
        } else {
            afsoVar = null;
        }
        if (afsoVar == null || !r(afsoVar.m())) {
            return null;
        }
        afsm f = afsy.f(afsoVar, afspVar);
        if (jhaVar instanceof jgz) {
            jgzVar = (jgz) jhaVar;
        } else {
            jgzVar = null;
        }
        if (jgzVar != null) {
            uri = jgzVar.b.a;
        } else {
            uri = null;
        }
        if (uri == null) {
            uri = Uri.parse(f.i());
        }
        aaxm aaxmVar = new aaxm();
        aaxmVar.c(uri);
        aaxmVar.a = null;
        aaxmVar.b(f.l().c().a());
        return aaxmVar.a();
    }

    public static afcq q(jha jhaVar) {
        if (jhaVar instanceof jgz) {
            return ((jgz) jhaVar).a;
        }
        if (jhaVar instanceof jgv) {
            return ((jgv) jhaVar).a;
        }
        if (jhaVar instanceof jgw) {
            return null;
        }
        throw new armm();
    }

    public static boolean r(afsw afswVar) {
        if (!d.F(afswVar, afsu.a) && !d.F(afswVar, afsv.a)) {
            return false;
        }
        return true;
    }

    public static boolean s(jkl jklVar, bwj bwjVar) {
        bwjVar.y(-511575432);
        agfn agfnVar = ((jjq) cak.a(jklVar.d, bwjVar).a()).b.a;
        bwjVar.q();
        return !(agfnVar instanceof agfg);
    }

    public static void t(bwj bwjVar) {
        bwjVar.y(1983588933);
        bwjVar.q();
    }

    public static jka u(cas casVar) {
        return (jka) casVar.a();
    }

    public static void v(aerb aerbVar, arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-615835388);
        if (i5 == 0) {
            if (true != c.G(aerbVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.I(arqgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            ahji.P(arqgVar, null, false, null, null, cdk.e(-1581196510, new gck(aerbVar, 12), c), c, ((i2 >> 3) & 14) | 1572864, 62);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(aerbVar, arqgVar, i, 7, null);
        }
    }

    public static void w(agch agchVar, cga cgaVar, jkl jklVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(-1966014864);
        if (i6 == 0) {
            if (true != c.G(agchVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(jklVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            cas a = cak.a(jklVar.a, c);
            ahfn.a(cdk.e(1338311732, new gck(a, 11), c), cgaVar, cdk.e(-386530506, new ifn(agchVar, a, 3), c), cdk.e(455404127, new jjs(a, 2), c), brg.a, null, ahji.c(cku.g, 0L, adom.cb(c).h, c, 22), null, c, (i2 & 112) | 3462, 176);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(agchVar, cgaVar, jklVar, i, 0);
        }
    }

    public static boolean x(jhc jhcVar) {
        jhcVar.getClass();
        return jhcVar.b.isEmpty();
    }

    public static int y(byk bykVar) {
        return bykVar.b();
    }

    public static void z(agcf agcfVar, cga cgaVar, jkl jklVar, bwj bwjVar, int i) {
        int i2;
        int z;
        int i3;
        int i4;
        int i5;
        cgaVar.getClass();
        bwj c = bwjVar.c(-416580864);
        if ((i & 14) == 0) {
            if (true != c.G(agcfVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.G(jklVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            c.y(1954612584);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new bys(0);
                bwkVar.ad(T);
            }
            byk bykVar = (byk) T;
            bwkVar.Y();
            cas b = cao.b(jklVar.c, arnv.a, null, c, 2);
            c.y(1954620056);
            t(c);
            bwkVar.Y();
            if (!a.x(b).isEmpty()) {
                c.y(464176431);
                int z2 = aqjn.z(a.x(b));
                List x = a.x(b);
                x.getClass();
                c.y(-827883366);
                if (x.isEmpty()) {
                    z = 0;
                } else {
                    z = aqjn.z(x);
                }
                avc b2 = avf.b(arrn.u(z2, 0, z), new afzg(x, 15), c, 2);
                bwkVar.Y();
                Integer valueOf = Integer.valueOf(a.x(b).size());
                c.y(1954646789);
                boolean G = c.G(b) | c.G(b2);
                Object T2 = bwkVar.T();
                if (G || T2 == bwj.a.a) {
                    T2 = new gvr(b2, bykVar, b, (arpe) null, 12);
                    bwkVar.ad(T2);
                }
                bwkVar.Y();
                bxl.g(valueOf, (arqv) T2, c);
                afzv.E(agcfVar, a.x(b), agcfVar.b(cgaVar), b2, c, (i2 & 14) | 64);
                bxl.f(b2, a.x(b), new gvr(b2, jklVar, b, (arpe) null, 13), c);
                bwkVar.Y();
            } else {
                c.y(1954672367);
                c.y(306905591);
                boolean isEmpty = a.x(cak.a(jklVar.c, c)).isEmpty();
                bwkVar.Y();
                bwkVar.Y();
                if (isEmpty) {
                    c.y(465352416);
                    akh.a(agcfVar.b(cgaVar), null, cdk.e(-1241266410, new jjs(jklVar, 0), c), c, 3072, 6);
                    bwkVar.Y();
                } else {
                    alvw i6 = jkn.a.i();
                    i6.X(alwp.a, "BugleComposeRow2");
                    ((alvg) i6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendContentUiKt", "DirectSendContentUi", 82, "DirectSendContentUi.kt")).q("Nothing to render from DirectSendContentUi");
                }
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new jkb(agcfVar, cgaVar, jklVar, i, 1);
        }
    }

    public hld(byte[] bArr) {
    }
}
