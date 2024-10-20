package defpackage;

import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wba extends unp {
    static final GetMessagesRequest c;
    public final anen d;
    public final anen e;
    public final vza f;
    public final vzh g;
    public final xnv h;
    public final armf i;
    public final wfh j;
    public final wfh k;
    public final zap l;
    private final anen o;
    private final ylg p;
    private final BiFunction q;
    private final lzz r;
    private static final utz m = uuh.e(uuh.b, "rcs_engine_get_single_message_max_retry_count", 5);
    private static final utz n = uuh.e(uuh.b, "rcs_engine_get_single_message_retry_delay_seconds", 2);
    public static final xze a = xze.g("BugleRcs", "GetMessagesMethod");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler");

    static {
        akia c2 = GetMessagesRequest.c();
        c2.c(1);
        c = c2.b();
    }

    public wba(zap zapVar, ylg ylgVar, BiFunction biFunction, vza vzaVar, wfh wfhVar, anen anenVar, anen anenVar2, anen anenVar3, vzh vzhVar, wfh wfhVar2, lzz lzzVar, xnv xnvVar, armf armfVar) {
        this.d = anenVar;
        this.o = anenVar2;
        this.l = zapVar;
        this.e = anenVar3;
        this.p = ylgVar;
        this.q = biFunction;
        this.f = vzaVar;
        this.j = wfhVar;
        this.g = vzhVar;
        this.k = wfhVar2;
        this.r = lzzVar;
        this.h = xnvVar;
        this.i = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(((Integer) m.e()).intValue());
        a2.h(Duration.ofSeconds(((Integer) n.e()).intValue()).toMillis());
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("GetSingleMessageHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        wbd wbdVar = (wbd) apbtVar;
        int i = 19;
        if (((Boolean) ((utz) vzh.e.get()).e()).booleanValue()) {
            vzh vzhVar = this.g;
            qgr qgrVar = wbdVar.e;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            vzhVar.g(qgrVar, rve.a, 4, 19);
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(this.h.a());
        return this.p.a(this.q, RcsMessagingService.class).f(TimeoutException.class, new vek(this, i), this.e).h(new way(this, ofEpochMilli, wbdVar, 0), this.o).i(new ancs() { // from class: waz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, apbt] */
            /* JADX WARN: Type inference failed for: r14v16, types: [armf, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                Optional empty;
                uta j;
                akul ai;
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (getMessagesResponse == null) {
                    wba.a.q("Null response from getMessages. RCS Engine might not be ready");
                    return aktp.ag(upm.e());
                }
                wba wbaVar = wba.this;
                if (!MessagingResult.d.equals(getMessagesResponse.a())) {
                    xyo e = wba.a.e();
                    e.H("Fetching incoming RCS messages failed");
                    e.x("errorCode", getMessagesResponse.a().b());
                    e.q();
                    empty = Optional.empty();
                } else {
                    alog b2 = getMessagesResponse.b();
                    wbaVar.f.b(b2.size());
                    if (b2.isEmpty()) {
                        xyo e2 = wba.a.e();
                        e2.H("Fetching incoming RCS messages successful but no messages returned from GetSingleMessageHandler");
                        e2.q();
                        empty = Optional.empty();
                    } else if (b2.size() <= 1) {
                        MessageNotification messageNotification = (MessageNotification) b2.get(0);
                        if (aczf.v()) {
                            Optional d = messageNotification.d();
                            vza vzaVar = wbaVar.f;
                            vzaVar.getClass();
                            d.ifPresent(new vwq(vzaVar, 10));
                        }
                        rve a2 = rve.a(messageNotification.b().h());
                        try {
                            empty = Optional.of(wbaVar.l.i(messageNotification));
                        } catch (IllegalArgumentException e3) {
                            xyo e4 = wba.a.e();
                            e4.H("Ignoring invalid incoming RCS message");
                            e4.g(a2);
                            e4.r(e3);
                            empty = Optional.empty();
                        }
                    } else {
                        throw new IllegalStateException("Unexpected number of messages: " + b2.size());
                    }
                }
                if (empty.isEmpty()) {
                    return aktp.ag(upm.d());
                }
                rve a3 = rve.a(((qfo) empty.get()).g);
                if (((Boolean) ((utz) vzh.f.get()).e()).booleanValue()) {
                    wbaVar.g.f(a3, 4, 20);
                }
                ?? r10 = empty.get();
                wfh wfhVar = wbaVar.k;
                qfo qfoVar = (qfo) r10;
                qei qeiVar = qfoVar.e;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                qeh b3 = qeh.b(qeiVar.c);
                if (b3 == null) {
                    b3 = qeh.UNKNOWN_TYPE;
                }
                if (b3.equals(qeh.GROUP)) {
                    j = wbaVar.j(qfoVar.h);
                } else {
                    qei qeiVar2 = qfoVar.e;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    j = wbaVar.j(qjh.q(qeiVar2));
                }
                akul b4 = ((uof) wfhVar.a.b()).b(upk.b("post_incoming_message_to_chat_api", r10, j));
                qei qeiVar3 = qfoVar.e;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                qeh b5 = qeh.b(qeiVar3.c);
                if (b5 == null) {
                    b5 = qeh.UNKNOWN_TYPE;
                }
                if (!b5.equals(qeh.GROUP)) {
                    ai = aktp.ag(false);
                } else {
                    ai = aktp.ai(new vze(wbaVar, r10, 5, null), wbaVar.d);
                }
                akul akulVar = ai;
                return aktp.an(b4, akulVar).i(new ncx(b4, akulVar, (Object) r10, 13, (byte[]) null), wbaVar.e).h(new vqv(wbaVar, a3, 8), wbaVar.e);
            }
        }, this.d).h(new vqv(this, wbdVar, 9, null), this.e).e(ajpt.class, new wax(1), this.e).e(TimeoutException.class, new wax(0), this.e).e(ylp.class, new wax(2), this.e);
    }

    @Override // defpackage.unx
    public final apca e() {
        return wbd.a.getParserForType();
    }

    public final uta j(String str) {
        return new uta(Long.toString(this.r.b(str)), null, null, null, null, null);
    }
}
