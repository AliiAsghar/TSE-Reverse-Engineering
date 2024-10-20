package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhh {
    public static final dhn a = new dhn("ContentDescription", true, AnonymousClass1.a);
    public static final dhn b = new dhn("StateDescription", (byte[]) null);
    public static final dhn c = new dhn("ProgressBarRangeInfo", (byte[]) null);
    public static final dhn d = new dhn("PaneTitle", true, AnonymousClass7.a);
    public static final dhn e = new dhn("SelectableGroup", (byte[]) null);
    public static final dhn f = new dhn("CollectionInfo", (byte[]) null);
    public static final dhn g = new dhn("CollectionItemInfo", (byte[]) null);
    public static final dhn h = new dhn("Heading", (byte[]) null);
    public static final dhn i = new dhn("Disabled", (byte[]) null);
    public static final dhn j = new dhn("LiveRegion", (byte[]) null);
    public static final dhn k = new dhn("Focused", (byte[]) null);
    public static final dhn l = new dhn("IsContainer", (byte[]) null);
    public static final dhn m = new dhn("IsTraversalGroup");
    public static final dhn n = new dhn("InvisibleToUser", AnonymousClass3.a);
    public static final dhn o = new dhn("HideFromAccessibility", AnonymousClass2.a);
    public static final dhn p = new dhn("TraversalIndex", AnonymousClass11.a);
    public static final dhn q = new dhn("HorizontalScrollAxisRange", (byte[]) null);
    public static final dhn r = new dhn("VerticalScrollAxisRange", (byte[]) null);
    public static final dhn s = new dhn("IsPopup", true, AnonymousClass5.a);
    public static final dhn t = new dhn("IsDialog", true, AnonymousClass4.a);
    public static final dhn u = new dhn("Role", true, AnonymousClass8.a);
    public static final dhn v = new dhn("TestTag", false, AnonymousClass9.a);
    public static final dhn w = new dhn("LinkTestMarker", false, AnonymousClass6.a);
    public static final dhn x = new dhn("Text", true, AnonymousClass10.a);
    public static final dhn y = new dhn("TextSubstitution");
    public static final dhn z = new dhn("IsShowingTextSubstitution");
    public static final dhn A = new dhn("EditableText", (byte[]) null);
    public static final dhn B = new dhn("TextSelectionRange", (byte[]) null);
    public static final dhn C = new dhn("ImeAction", (byte[]) null);
    public static final dhn D = new dhn("Selected", (byte[]) null);
    public static final dhn E = new dhn("ToggleableState", (byte[]) null);
    public static final dhn F = new dhn("Password", (byte[]) null);
    public static final dhn G = new dhn("Error", (byte[]) null);
    public static final dhn H = new dhn("IndexForKey");
    public static final dhn I = new dhn("IsEditable");
    public static final dhn J = new dhn("MaxTextLength");

    /* compiled from: PG */
    /* renamed from: dhh$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list != null) {
                List az = aqjn.az(list);
                az.addAll(list2);
                return az;
            }
            return list2;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$10, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass10 extends arrp implements arqv<List<? extends dhv>, List<? extends dhv>, List<? extends dhv>> {
        public static final AnonymousClass10 a = new AnonymousClass10();

        public AnonymousClass10() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list != null) {
                List az = aqjn.az(list);
                az.addAll(list2);
                return az;
            }
            return list2;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$11, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass11 extends arrp implements arqv<Float, Float, Float> {
        public static final AnonymousClass11 a = new AnonymousClass11();

        public AnonymousClass11() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            Float f = (Float) obj;
            ((Number) obj2).floatValue();
            return f;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<arnb, arnb, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return (arnb) obj;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqv<arnb, arnb, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return (arnb) obj;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqv<arnb, arnb, arnb> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqv<arnb, arnb, arnb> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqv<arnb, arnb, arnb> {
        public static final AnonymousClass6 a = new AnonymousClass6();

        public AnonymousClass6() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return (arnb) obj;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqv<String, String, String> {
        public static final AnonymousClass7 a = new AnonymousClass7();

        public AnonymousClass7() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$8, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass8 extends arrp implements arqv<dgv, dgv, dgv> {
        public static final AnonymousClass8 a = new AnonymousClass8();

        public AnonymousClass8() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            dgv dgvVar = (dgv) obj;
            int i = ((dgv) obj2).a;
            return dgvVar;
        }
    }

    /* compiled from: PG */
    /* renamed from: dhh$9, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass9 extends arrp implements arqv<String, String, String> {
        public static final AnonymousClass9 a = new AnonymousClass9();

        public AnonymousClass9() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return (String) obj;
        }
    }
}
