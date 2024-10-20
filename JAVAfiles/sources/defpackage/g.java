package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class g extends Format.Field {
    public static final g a = new g();
    private static final long serialVersionUID = 7510380454602616157L;

    protected g() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() {
        if (getClass() == g.class) {
            String name = getName();
            g gVar = a;
            if (name.equals(gVar.getName())) {
                return gVar;
            }
            throw new InvalidObjectException("Unknown attribute name.");
        }
        throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
    }
}
