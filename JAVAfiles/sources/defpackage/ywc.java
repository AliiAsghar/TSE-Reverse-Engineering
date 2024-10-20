package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywc {
    private final String a;
    private final String b;
    private final ParticipantColor c;

    public ywc(String str, String str2, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = (ParticipantColor) optional.orElse(new ParticipantColor());
    }

    public final ackf a() {
        ackf ackfVar = new ackf();
        ackfVar.n("1", this.a);
        String str = this.b;
        if (str != null) {
            ackfVar.n("4", str);
        }
        ParticipantColor participantColor = this.c;
        ackfVar.l("2", participantColor.a);
        ackfVar.l("3", participantColor.b);
        ackfVar.l("5", participantColor.c);
        return ackfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ywc) {
            return a().equals(((ywc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
