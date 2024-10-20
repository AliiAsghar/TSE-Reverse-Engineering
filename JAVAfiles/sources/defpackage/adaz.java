package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public adaz(Context context, Executor executor, adqg adqgVar, addp addpVar, aegu aeguVar, ajsj ajsjVar, anen anenVar, yjr yjrVar, adov adovVar, aikc aikcVar, acqy acqyVar, addv addvVar, wcf wcfVar, aneo aneoVar) {
        this.a = context;
        this.b = executor;
        this.c = adqgVar;
        this.d = addpVar;
        this.e = aeguVar;
        this.f = ajsjVar;
        this.g = anenVar;
        this.h = yjrVar;
        this.i = adovVar;
        this.j = aikcVar;
        this.k = acqyVar;
        this.l = addvVar;
        this.m = wcfVar;
        this.n = aneoVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, aneo] */
    public final ListenableFuture a(addl addlVar) {
        this.c.getClass();
        Object obj = this.d;
        obj.getClass();
        this.i.getClass();
        this.j.getClass();
        return new adan(addlVar, (Context) this.a, this.b, (addp) obj, this.e, this.n, (wcf) this.m).d.d();
    }

    public adaz(adwp adwpVar) {
        this.k = adwpVar.j("org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcse.dp", "1.0", "Capability Discovery via Presence");
        this.m = adwpVar.j("org.openmobilealliance:ChatSession", "2.0", "Chat");
        this.d = adwpVar.j("org.openmobilealliance:File-Transfer-HTTP", "1.0", "File Transfer via HTTP");
        this.c = adwpVar.j("org.openmobilealliance:File-Transfer", "2.0", "File Transfer");
        this.i = adwpVar.j("org.openmobilealliance:File-Transfer-thumb", "2.0", "File Transfer Thumbnail");
        this.l = adwpVar.j("org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.ftsms", "1.0", "File Transfer via SMS");
        adwpVar.j("org.gsma.videoshare", "1.0", "Video Share");
        this.e = adwpVar.j("org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.geopush", "1.0", "Geolocation PUSH");
        this.j = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.iari.rcs.geosms", "1.0", "Geolocation PUSH via SMS");
        this.a = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.callcomposer", "1.0", "Call composer");
        this.g = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.callunanswered", "1.0", "Post-Call");
        this.n = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.sharedmap", "1.0", "Shared Map");
        this.b = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.sharedsketch", "1.0", "Shared Sketch");
        this.h = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.iari.rcs.chatbot", "1.0", "Chatbot Communication");
        adwpVar.j("org.gsma.rcs.isbot", "1.0", "Chatbot role");
        adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.iari.rcs.plugin", "1.0", "Plug-ins");
        this.f = adwpVar.j("org.3gpp.urn:urn-7:3gpp-service.ims.icsi.mmtel", "1.0", "IMS Multimedia telephony communication service");
    }
}
