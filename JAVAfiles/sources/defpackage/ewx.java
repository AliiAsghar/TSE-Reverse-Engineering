package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewx {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        alok alokVar = new alok();
        alokVar.h("TransformerInternal", alog.r("Start"));
        alokVar.h("AssetLoader", alog.s("InputFormat", "OutputFormat"));
        alokVar.h("AudioDecoder", alog.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        alokVar.h("AudioGraph", alog.s("RegisterNewInputStream", "OutputEnded"));
        alokVar.h("AudioMixer", alog.t("RegisterNewInputStream", "OutputFormat", "ProducedOutput"));
        alokVar.h("AudioEncoder", alog.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        alokVar.h("VideoDecoder", alog.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        alokVar.h("VFP", alog.z("RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"));
        alokVar.h("ExternalTextureManager", alog.s("SignalEOS", "SurfaceTextureTransformFix"));
        alokVar.h("BitmapTextureManager", alog.r("SignalEOS"));
        alokVar.h("TexIdTextureManager", alog.r("SignalEOS"));
        alokVar.h("Compositor", alog.r("OutputTextureRendered"));
        alokVar.h("VideoEncoder", alog.w("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        alokVar.h("Muxer", alog.v("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        alokVar.b();
        b = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String a() {
        synchronized (ewx.class) {
        }
        return "\"Tracing disabled\"";
    }

    public static synchronized void b() {
        synchronized (ewx.class) {
            b.clear();
            SystemClock.elapsedRealtime();
        }
    }
}
