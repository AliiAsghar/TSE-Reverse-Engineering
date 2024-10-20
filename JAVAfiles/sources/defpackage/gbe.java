package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbe extends dyh {
    public final gbb a;
    public final int b;
    public final int c;
    public final int d;

    public gbe(gbb gbbVar, int i, int i2, int i3) {
        super(null);
        this.a = gbbVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (gbbVar != gbb.REFRESH) {
            if (g() > 0) {
                if (i3 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("Invalid placeholdersRemaining " + i3);
            }
            throw new IllegalArgumentException("Drop count must be > 0, but was " + g());
        }
        throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbe)) {
            return false;
        }
        gbe gbeVar = (gbe) obj;
        if (this.a == gbeVar.a && this.b == gbeVar.b && this.c == gbeVar.c && this.d == gbeVar.d) {
            return true;
        }
        return false;
    }

    public final int g() {
        return (this.c - this.b) + 1;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str = ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME;
            } else {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
        } else {
            str = "front";
        }
        return arsd.s("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)");
    }
}
