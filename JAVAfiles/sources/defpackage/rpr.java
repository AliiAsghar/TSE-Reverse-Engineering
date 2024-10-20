package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpr implements rpj {
    private final /* synthetic */ int k;
    public static final rpr j = new rpr(10);
    public static final rpr i = new rpr(9);
    public static final rpr h = new rpr(7);
    public static final rpr g = new rpr(6);
    public static final rpr f = new rpr(5);
    public static final rpr e = new rpr(4);
    public static final rpr d = new rpr(3);
    public static final rpr c = new rpr(2);
    public static final rpr b = new rpr(1);
    public static final rpr a = new rpr(0);

    public rpr(int i2) {
        this.k = i2;
    }

    @Override // defpackage.rpj
    public final long a() {
        switch (this.k) {
            case 0:
                return new slk(slm.a).b().k((agmh) slm.d.b);
            case 1:
                return sld.a().b().k((agmh) sld.e.c);
            case 2:
                return new smm(smp.a).b().i();
            case 3:
                return sni.e().b().k(sni.c.a);
            case 4:
                return sss.c().b().k(sss.d.a);
            case 5:
                return svq.a().b().k((agmh) svq.d.d);
            case 6:
                return new svx(svz.a).b().k((agmh) svz.d.a);
            case 7:
                return new sxb(sxc.a).b().k((agmh) sxc.d.b);
            case 8:
                return MessagesTable.d().b().k(MessagesTable.c.a);
            case 9:
                return PartsTable.d().b().k(PartsTable.d.a);
            default:
                return ParticipantsTable.e().b().k(ParticipantsTable.c.a);
        }
    }

    @Override // defpackage.rpj
    public final rpo b() {
        switch (this.k) {
            case 0:
                return rpk.h;
            case 1:
                return rpk.e;
            case 2:
                return rpk.f;
            case 3:
                return rpk.a;
            case 4:
                return rpk.k;
            case 5:
                return rpk.i;
            case 6:
                return rpk.j;
            case 7:
                return rpk.g;
            case 8:
                return rpk.b;
            case 9:
                return rpk.d;
            default:
                return rpk.c;
        }
    }

    @Override // defpackage.rpj
    public final agof c() {
        switch (this.k) {
            case 0:
                if (pyx.a()) {
                    agof agofVar = new agof("conversation_pin", "$primary");
                    agofVar.d = 4;
                    return agofVar;
                }
                return new agof("conversation_pin", "$primary");
            case 1:
                return new agof("conversation_participants", "$primary");
            case 2:
                return new agof("conversation_to_participants", "$primary");
            case 3:
                return new agof("conversations", "$primary");
            case 4:
                if (pyx.a()) {
                    agof agofVar2 = new agof("link_preview", "$primary");
                    agofVar2.d = 4;
                    return agofVar2;
                }
                return new agof("link_preview", "$primary");
            case 5:
                if (pyx.a()) {
                    agof agofVar3 = new agof("message_reactions", "$primary");
                    agofVar3.d = 4;
                    return agofVar3;
                }
                return new agof("message_reactions", "$primary");
            case 6:
                if (pyx.a()) {
                    agof agofVar4 = new agof("message_replies", "$primary");
                    agofVar4.d = 4;
                    return agofVar4;
                }
                return new agof("message_replies", "$primary");
            case 7:
                if (pyx.a()) {
                    agof agofVar5 = new agof("message_star", "$primary");
                    agofVar5.d = 4;
                    return agofVar5;
                }
                return new agof("message_star", "$primary");
            case 8:
                return new agof("messages", "$primary");
            case 9:
                return new agof("parts", "$primary");
            default:
                return new agof("participants", "$primary");
        }
    }

    @Override // defpackage.rpj
    public final /* synthetic */ String d() {
        switch (this.k) {
            case 0:
                return ujy.g(this);
            case 1:
                return ujy.g(this);
            case 2:
                return ujy.g(this);
            case 3:
                return ujy.g(this);
            case 4:
                return ujy.g(this);
            case 5:
                return ujy.g(this);
            case 6:
                return ujy.g(this);
            case 7:
                return ujy.g(this);
            case 8:
                return ujy.g(this);
            case 9:
                return ujy.g(this);
            default:
                return ujy.g(this);
        }
    }
}
