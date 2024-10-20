package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.Conversation;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addy {
    public final Object a;
    public final Object b;
    public final Object c;

    public addy(abtd abtdVar, ahjj ahjjVar, Runnable runnable) {
        this.b = abtdVar;
        this.c = ahjjVar;
        this.a = runnable;
    }

    public static String c(Conversation conversation) {
        if (conversation.c() == 2) {
            return conversation.b();
        }
        return conversation.a().a();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [addv, java.lang.Object] */
    public final addz a(ajpe ajpeVar) {
        adrc adrcVar;
        String str;
        Conversation b = ajpeVar.b();
        String c = c(b);
        String str2 = null;
        atkv atkvVar = new atkv((byte[]) null);
        synchronized (this.a) {
            adrcVar = (adrc) ((addw) this.c).get(c);
            if (adrcVar == null) {
                adrcVar = this.b.createOutgoingSession(adcx.y(b.a()));
                adrcVar.bo();
                adrcVar.O = adqq.CONFERENCE_URI;
                if (ajpeVar.e()) {
                    advr.c("Updating CREATED GroupSession to support encryption", new Object[0]);
                    adrcVar.aT(true);
                    adrcVar.aS(true);
                }
                String b2 = b.b();
                if (adrcVar.ak()) {
                    str = aikx.b();
                } else {
                    str = b2;
                }
                if (true == adrcVar.ak()) {
                    str2 = b2;
                }
                adrcVar.z = str;
                if (str2 != null) {
                    adrcVar.A = str2;
                }
                atkvVar.a = 1;
                adrcVar.aG(new addx(this, c, adrcVar));
                ((addw) this.c).put(c, adrcVar);
            } else {
                atkvVar.a = 2;
            }
        }
        atkvVar.p(adrcVar);
        return atkvVar.o();
    }

    public final addz b(Conversation conversation, adrv adrvVar) {
        synchronized (this.a) {
            String c = c(conversation);
            advr.c("Using session key for incoming session: %s", advq.PHONE_NUMBER.c(c));
            if (adrvVar instanceof adrt) {
                c = a.cp(c, "standfw_");
            }
            adrc adrcVar = (adrc) ((addw) this.c).get(c);
            if (adrcVar == null) {
                adrvVar.aG(new addx(this, c, adrvVar));
                ((addw) this.c).put(c, adrvVar);
                atkv atkvVar = new atkv((byte[]) null);
                atkvVar.a = 1;
                atkvVar.p(adrvVar);
                return atkvVar.o();
            }
            String c2 = c(conversation);
            synchronized (this.a) {
                adrvVar.aG(new addx(this, c2, adrvVar));
                ((addw) this.c).put(c2, adrvVar);
            }
            atkv atkvVar2 = new atkv((byte[]) null);
            atkvVar2.a = 3;
            atkvVar2.p(adrcVar);
            return atkvVar2.o();
        }
    }

    public final File d() {
        return (File) ((acak) this.a).b;
    }

    public final File e() {
        return (File) ((acak) this.a).a;
    }

    public final boolean f() {
        if (!d().isFile() || !((File) this.b).isDirectory()) {
            return false;
        }
        return true;
    }

    public addy(abtd abtdVar, ahjj ahjjVar, Runnable runnable, byte[] bArr) {
        this.b = abtdVar;
        this.c = ahjjVar;
        this.a = runnable;
    }

    public addy(acak acakVar, File file, File file2) {
        this.a = acakVar;
        this.b = file;
        this.c = file2;
    }

    public addy(addv addvVar, addw addwVar) {
        this.a = new Object();
        this.b = addvVar;
        this.c = addwVar;
    }

    public addy(armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
    }

    public addy(aczt acztVar) {
        this.b = acztVar.i("enable_send_departed_user", false);
        this.a = acztVar.i("enable_send_referrer", false);
        this.c = acztVar.i("enable_send_group_event", false);
    }

    public addy(Context context) {
        this.a = context;
        this.c = abwd.a(context);
        this.b = new acda(context.getMainLooper());
    }

    public addy(Context context, aegu aeguVar) {
        alhr D = albo.D(new ynw(context, 13));
        albo.D(new ylq(context, aeguVar, 12));
        this.b = context;
        this.c = aeguVar;
        this.a = D;
    }
}
