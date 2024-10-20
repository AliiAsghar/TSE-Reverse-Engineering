package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addi {
    public static final ContentType e;
    public static final alor f;
    public static final advp g;
    public final aegu h;
    public final adov i;
    public final aifa j;
    private final ajsc l;
    static final acyz a = aczd.a(169783196);
    static final acyz b = aczd.a(182480073);
    static final acyz c = aczd.a(181336021);
    static final acyz d = aczd.a(185593693);
    private static final acyz k = aczd.a(188541474);

    static {
        aoad g2 = ContentType.g();
        g2.C("message");
        g2.B("cpim");
        e = g2.y();
        f = alor.l("urn:ietf:params:imdn", "imdn");
        g = new advp("MessageConverter");
    }

    public addi(aegu aeguVar, adov adovVar, ajsc ajscVar, aifa aifaVar) {
        this.h = aeguVar;
        this.l = ajscVar;
        this.i = adovVar;
        this.j = aifaVar;
    }

    public final adqu a(Conversation conversation, Message message, MessageClass messageClass) {
        return b(conversation, message, Optional.of(messageClass), ajqw.MESSAGING_METHOD_CHAT);
    }

    public final adqu b(Conversation conversation, Message message, Optional optional, ajqw ajqwVar) {
        Object a2;
        boolean z;
        ajpz c2 = c(conversation, message, optional);
        if (message.f().isPresent()) {
            a2 = message.f().get();
        } else {
            a2 = conversation.a();
        }
        String y = adcx.y((RcsDestinationId) a2);
        String y2 = adcx.y(message.a());
        int i = 1;
        if (!optional.isEmpty() && ((MessageClass) optional.get()).b() != ajqt.USER) {
            z = false;
        } else {
            z = true;
        }
        adqt adqtVar = adqt.CPIM_MESSAGE;
        if (true == ajqwVar.equals(ajqw.MESSAGING_METHOD_SLM)) {
            i = 2;
        }
        adqu adquVar = new adqu(adqtVar, i);
        adquVar.b = y;
        adquVar.c = y2;
        adquVar.k = message.h();
        adquVar.j = this.h.f().toEpochMilli();
        adquVar.f(e.toString(), c2);
        adquVar.r = z;
        return adquVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ajpz c(Conversation conversation, Message message, Optional optional) {
        ajrt b2;
        String y = adcx.y(message.a());
        String str = "sip:anonymous@anonymous.invalid";
        if (conversation.c() != 2) {
            y = "sip:anonymous@anonymous.invalid";
        }
        if (conversation.c() == 2 && message.f().isPresent()) {
            str = adcx.y((RcsDestinationId) message.f().get());
        }
        try {
            if (message.b().size() == 1) {
                Message.MessageContent messageContent = (Message.MessageContent) message.b().get(0);
                int ordinal = messageContent.a().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                b2 = this.l.b(messageContent.b());
                            } else {
                                b2 = this.l.b(messageContent.e());
                            }
                        } else {
                            b2 = this.l.b(messageContent.c());
                        }
                    } else {
                        b2 = this.l.b(messageContent.f());
                    }
                } else {
                    b2 = this.l.b(messageContent.d());
                }
                String str2 = (String) f.get("urn:ietf:params:imdn");
                str2.getClass();
                asmg e2 = ajpz.e();
                e2.z(str2, "urn:ietf:params:imdn");
                e2.x("From", new aife(y).toString());
                e2.x("To", new aife(str).toString());
                e2.x("DateTime", this.h.f().toString());
                e2.y("urn:ietf:params:imdn", "Message-ID", message.h());
                anjs c2 = ajqa.c();
                c2.h(new aiez(b2.a, b2.a.d()));
                c2.f(assi.a, b2.b.toString());
                if (((Boolean) d.a()).booleanValue() && optional.isPresent() && MessageClass.f((MessageClass) optional.get())) {
                    c2.f(assi.c, "notification");
                }
                if (((Boolean) c.a()).booleanValue()) {
                    c2.f("Content-Length", String.valueOf(b2.a.d()));
                }
                e2.a = c2.d();
                if (((Boolean) b.a()).booleanValue()) {
                    optional.flatMap(new aaky(this, 18)).ifPresent(new acsa(e2, 13));
                }
                alog c3 = message.c();
                HashMap hashMap = new HashMap();
                int size = c3.size();
                for (int i = 0; i < size; i++) {
                    MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) c3.get(i);
                    aozy aozyVar = (aozy) hashMap.get(messageExtensionHeader.b());
                    if (aozyVar == null) {
                        aozyVar = apws.a.createBuilder();
                        hashMap.put(messageExtensionHeader.b(), aozyVar);
                    }
                    aozyVar.bJ(messageExtensionHeader.a(), messageExtensionHeader.c());
                }
                aozy createBuilder = apwq.a.createBuilder();
                Map.EL.forEach(hashMap, new lui(createBuilder, 10));
                int i2 = 1;
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((apwq) createBuilder.s()).b).entrySet()) {
                    int i3 = i2 + 1;
                    e2.z(String.format(Locale.US, "n%d", Integer.valueOf(i2)), (String) entry.getKey());
                    for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                        e2.y((String) entry.getKey(), (String) entry2.getKey(), (String) entry2.getValue());
                    }
                    i2 = i3;
                }
                return e2.u();
            }
            throw new IllegalArgumentException("Expect one content, found " + message.b().size());
        } catch (ajsh e3) {
            throw new IllegalArgumentException("MessageContent could not be serialized", e3);
        }
    }

    public final Message d(Conversation conversation, adqu adquVar) {
        alog g2;
        String str;
        RcsDestinationId a2;
        Instant f2;
        if (adquVar.a == adqt.CPIM_MESSAGE) {
            alob alobVar = new alob();
            try {
                ajpz j = ajki.j(adquVar.f);
                int i = 1;
                if (((Boolean) a.a()).booleanValue()) {
                    alobVar.j(adcx.gv(adquVar));
                } else {
                    ContentType d2 = ContentType.d((String) j.c.b().orElseThrow(new addh(1)));
                    ajur ajurVar = new ajur(null);
                    ajurVar.m(j.c.b);
                    ajurVar.n(d2);
                    alobVar.h(ajki.i(ajurVar.l()));
                }
                alog g3 = alobVar.g();
                int i2 = 0;
                if (((Boolean) k.a()).booleanValue()) {
                    str = (String) j.d("Message-ID").map(new addg(i2)).orElse("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID()))));
                } else {
                    str = ((ajqb) j.d("Message-ID").orElseThrow(new addh(0))).c;
                }
                if (conversation.c() == 2) {
                    a2 = adcx.x(aife.a(((ajqb) j.c("From").orElseThrow(new addh(2))).c).a);
                } else {
                    a2 = conversation.a();
                }
                Optional c2 = j.c("DateTime");
                if (c2.isPresent()) {
                    try {
                        f2 = Instant.ofEpochMilli(advi.c(((ajqb) c2.get()).c).a);
                    } catch (IllegalArgumentException unused) {
                        advr.r(g, "Date can't be parsed as RFC3339 date: %s", ((ajqb) c2.get()).c);
                        f2 = this.h.f();
                    }
                } else {
                    f2 = this.h.f();
                }
                alob alobVar2 = new alob();
                alob alobVar3 = new alob();
                Collection.EL.stream(j.b).filter(new adru(12)).forEach(new ajpx(alobVar3, 4));
                Collection.EL.stream(alobVar3.g()).forEach(new acsa(alobVar2, 14));
                ajqn i3 = Message.i();
                i3.f(str);
                i3.i(a2);
                i3.c(g3);
                i3.j(f2);
                i3.e(alobVar2.g());
                if (aczf.E()) {
                    i3.d(alpt.o((Set) Collection.EL.stream(anna.g(",").i().d().c((String) j.d("Disposition-Notification").map(new aiec(19)).orElse(""))).map(new addg(i)).filter(new addf(i2)).collect(Collectors.toSet())));
                }
                return i3.a();
            } catch (IOException e2) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e2);
            }
        }
        alob alobVar4 = new alob();
        if (((Boolean) a.a()).booleanValue()) {
            alobVar4.j(adcx.gv(adquVar));
        } else {
            ContentType d3 = ContentType.d(adquVar.h);
            ajur ajurVar2 = new ajur(null);
            ajurVar2.m(aozb.w(adquVar.f));
            ajurVar2.n(d3);
            alobVar4.h(ajki.i(ajurVar2.l()));
        }
        ajqn i4 = Message.i();
        i4.f(albo.ag(adquVar.k));
        i4.i(conversation.a());
        i4.j(Instant.ofEpochMilli(adquVar.j));
        i4.c(alobVar4.g());
        apwq apwqVar = adquVar.i;
        if (apwqVar == null) {
            int i5 = alog.d;
            g2 = alsx.a;
        } else {
            alob alobVar5 = new alob();
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                    arbj arbjVar = new arbj();
                    arbjVar.r((String) entry.getKey());
                    arbjVar.q((String) entry2.getKey());
                    arbjVar.s((String) entry2.getValue());
                    alobVar5.h(arbjVar.p());
                }
            }
            g2 = alobVar5.g();
        }
        i4.e(g2);
        i4.g(adquVar.s);
        return i4.a();
    }
}
