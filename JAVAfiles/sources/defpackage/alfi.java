package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class alfi {
    public static final alfi a;
    public static final alfi b;
    public static final alfi c;
    public static final alfi d;
    public static final alfi e;
    private static final /* synthetic */ alfi[] h;
    public final algc f;
    public final String g;

    static {
        final alfs alfsVar = new alfs('-');
        alfi alfiVar = new alfi(alfsVar) { // from class: alff
        };
        a = alfiVar;
        final alfs alfsVar2 = new alfs('_');
        alfi alfiVar2 = new alfi(alfsVar2) { // from class: alfg
        };
        b = alfiVar2;
        alfi alfiVar3 = new alfi("LOWER_CAMEL", 2, new alfr('A', 'Z'), "");
        c = alfiVar3;
        alfi alfiVar4 = new alfi("UPPER_CAMEL", 3, new alfr('A', 'Z'), "");
        d = alfiVar4;
        final alfs alfsVar3 = new alfs('_');
        alfi alfiVar5 = new alfi(alfsVar3) { // from class: alfh
        };
        e = alfiVar5;
        h = new alfi[]{alfiVar, alfiVar2, alfiVar3, alfiVar4, alfiVar5};
    }

    public alfi(String str, int i, algc algcVar, String str2) {
        this.f = algcVar;
        this.g = str2;
    }

    private static String b(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return albo.ao(str.charAt(0)) + albo.ap(str.substring(1));
    }

    public static alfi[] values() {
        return (alfi[]) h.clone();
    }

    public final String a(String str) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return albo.aq(str);
                        }
                        throw null;
                    }
                    return b(str);
                }
                return b(str);
            }
            return albo.ap(str);
        }
        return albo.ap(str);
    }
}
