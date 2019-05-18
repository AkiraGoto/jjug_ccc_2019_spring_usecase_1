## Num of result : 639

## Android-ObservableScrollView\library\src\androidTest\java\com\github\ksoichiro\android\observablescrollview\test\ViewPagerTab2Activity.java
### Line: 260
```
switch(pattern) {
    case 0:
        f = new ViewPagerTab2ScrollViewFragment();
        break;
    case 1:
        f = new ViewPagerTab2ListViewFragment();
        break;
    case 2:
        f = new ViewPagerTab2RecyclerViewFragment();
        break;
    case 3:
        f = new ViewPagerTab2GridViewFragment();
        break;
    case 4:
    default:
        f = new ViewPagerTab2WebViewFragment();
        break;
}
```

## Android-ObservableScrollView\samples\src\main\java\com\github\ksoichiro\android\observablescrollview\samples\FlexibleSpaceWithImageWithViewPagerTab2Activity.java
### Line: 314
```
switch(pattern) {
    case 0:
        f = new ViewPagerTab2ScrollViewFragment();
        break;
    case 1:
        f = new ViewPagerTab2ListViewFragment();
        break;
    case 2:
        f = new ViewPagerTab2RecyclerViewFragment();
        break;
    case 3:
        f = new ViewPagerTab2GridViewFragment();
        break;
    case 4:
    default:
        f = new ViewPagerTab2WebViewFragment();
        break;
}
```

## Android-ObservableScrollView\samples\src\main\java\com\github\ksoichiro\android\observablescrollview\samples\SlidingUpBaseActivity.java
### Line: 247
```
switch(slidingState) {
    case SLIDING_STATE_TOP:
        translationY = 0;
        break;
    case SLIDING_STATE_MIDDLE:
        translationY = getAnchorYImage();
        break;
    case SLIDING_STATE_BOTTOM:
        translationY = getAnchorYBottom();
        break;
}
```

## Android-ObservableScrollView\samples\src\main\java\com\github\ksoichiro\android\observablescrollview\samples\ViewPagerTab2Activity.java
### Line: 252
```
switch(pattern) {
    case 0:
        f = new ViewPagerTab2ScrollViewFragment();
        break;
    case 1:
        f = new ViewPagerTab2ListViewFragment();
        break;
    case 2:
        f = new ViewPagerTab2RecyclerViewFragment();
        break;
    case 3:
        f = new ViewPagerTab2GridViewFragment();
        break;
    case 4:
    default:
        f = new ViewPagerTab2WebViewFragment();
        break;
}
```

## Android-ObservableScrollView\samples\src\main\java\com\github\ksoichiro\android\observablescrollview\samples\ViewPagerTabFragmentParentFragment.java
### Line: 256
```
switch(pattern) {
    case 0:
        f = new ViewPagerTabFragmentScrollViewFragment();
        break;
    case 1:
        f = new ViewPagerTabFragmentListViewFragment();
        break;
    case 2:
        f = new ViewPagerTabFragmentRecyclerViewFragment();
        break;
    case 3:
        f = new ViewPagerTabFragmentGridViewFragment();
        break;
    case 4:
    default:
        f = new ViewPagerTabFragmentWebViewFragment();
        break;
}
```

## Android-PickerView\pickerview\src\main\java\com\bigkoo\pickerview\utils\ChinaDate.java
### Line: 225
```
switch(one) {
    case 1:
        a += "一";
        break;
    case 2:
        a += "二";
        break;
    case 3:
        a += "三";
        break;
    case 4:
        a += "四";
        break;
    case 5:
        a += "五";
        break;
    case 6:
        a += "六";
        break;
    case 7:
        a += "七";
        break;
    case 8:
        a += "八";
        break;
    case 9:
        a += "九";
        break;
}
```

## Android-PullToRefresh\library\src\com\handmark\pulltorefresh\library\PullToRefreshBase.java
### Line: 1254
```
switch(getPullToRefreshScrollDirection()) {
    case HORIZONTAL:
        oldScrollValue = getScrollX();
        break;
    case VERTICAL:
    default:
        oldScrollValue = getScrollY();
        break;
}
```

## Android-PullToRefresh\sample\src\com\handmark\pulltorefresh\samples\LauncherActivity.java
### Line: 40
```
switch(position) {
    default:
    case 0:
        intent = new Intent(this, PullToRefreshListActivity.class);
        break;
    case 1:
        intent = new Intent(this, PullToRefreshExpandableListActivity.class);
        break;
    case 2:
        intent = new Intent(this, PullToRefreshGridActivity.class);
        break;
    case 3:
        intent = new Intent(this, PullToRefreshWebViewActivity.class);
        break;
    case 4:
        intent = new Intent(this, PullToRefreshScrollViewActivity.class);
        break;
    case 5:
        intent = new Intent(this, PullToRefreshHorizontalScrollViewActivity.class);
        break;
    case 6:
        intent = new Intent(this, PullToRefreshViewPagerActivity.class);
        break;
    case 7:
        intent = new Intent(this, PullToRefreshListFragmentActivity.class);
        break;
    case 8:
        intent = new Intent(this, PullToRefreshWebView2Activity.class);
        break;
    case 9:
        intent = new Intent(this, PullToRefreshListInViewPagerActivity.class);
        break;
}
```

## androidannotations\AndroidAnnotations\androidannotations-core\androidannotations\src\main\java\org\androidannotations\internal\core\handler\IgnoreWhenHandler.java
### Line: 60
```
switch(ignoreWhen.value()) {
    case VIEW_DESTROYED:
        conditional = methodBody._if(holder.getViewDestroyedField().not());
        break;
    case DETACHED:
        conditional = methodBody._if(invoke(holder.getGeneratedClass().staticRef("this"), "getActivity").ne(_null()));
        break;
}
```

## androidannotations\AndroidAnnotations\androidannotations-core\androidannotations\src\main\java\org\androidannotations\internal\core\handler\SharedPrefHandler.java
### Line: 329
```
switch(res) {
    case BOOL:
        resourceGetMethodName = "getBoolean";
        break;
    case INTEGER:
        resourceGetMethodName = "getInteger";
        break;
    case STRING:
        resourceGetMethodName = "getString";
        break;
    case ARRAY:
        resourceGetMethodName = "getStringArray";
        break;
    default:
        break;
}
```

## AndroidSwipeLayout\library\src\main\java\com\daimajia\swipe\SwipeLayout.java
### Line: 724
```
switch(dragEdge) {
    case Left:
        gravity = Gravity.LEFT;
        break;
    case Right:
        gravity = Gravity.RIGHT;
        break;
    case Top:
        gravity = Gravity.TOP;
        break;
    case Bottom:
        gravity = Gravity.BOTTOM;
        break;
}
```

## Arduino\app\src\processing\app\SerialMonitor.java
### Line: 75
```
switch(lineEndings.getSelectedIndex()) {
    case 1:
        s += "\n";
        break;
    case 2:
        s += "\r";
        break;
    case 3:
        s += "\r\n";
        break;
    default:
        break;
}
```

## BaseRecyclerViewAdapterHelper-master\library\src\main\java\com\chad\library\adapter\base\BaseQuickAdapter.java
### Line: 1538
```
switch(animationType) {
    case ALPHAIN:
        mSelectAnimation = new AlphaInAnimation();
        break;
    case SCALEIN:
        mSelectAnimation = new ScaleInAnimation();
        break;
    case SLIDEIN_BOTTOM:
        mSelectAnimation = new SlideInBottomAnimation();
        break;
    case SLIDEIN_LEFT:
        mSelectAnimation = new SlideInLeftAnimation();
        break;
    case SLIDEIN_RIGHT:
        mSelectAnimation = new SlideInRightAnimation();
        break;
    default:
        break;
}
```

## BaseRecyclerViewAdapterHelper-master\library\src\main\java\com\chad\library\adapter\base\util\TouchEventUtil.java
### Line: 9
```
switch(actionId) {
    case MotionEvent.ACTION_DOWN:
        actionName = "ACTION_DOWN";
        break;
    case MotionEvent.ACTION_MOVE:
        actionName = "ACTION_MOVE";
        break;
    case MotionEvent.ACTION_UP:
        actionName = "ACTION_UP";
        break;
    case MotionEvent.ACTION_CANCEL:
        actionName = "ACTION_CANCEL";
        break;
    case MotionEvent.ACTION_OUTSIDE:
        actionName = "ACTION_OUTSIDE";
        break;
    default:
        break;
}
```

## bazel\src\java_tools\buildjar\java\com\google\devtools\build\java\turbine\javac\TreePruner.java
### Line: 155
```
switch(method.getKind()) {
    case IDENTIFIER:
        name = ((JCIdent) method).getName();
        break;
    case MEMBER_SELECT:
        name = ((JCFieldAccess) method).getIdentifier();
        break;
    default:
        return false;
}
```

## bazel\src\main\java\com\google\devtools\build\lib\actions\LocalHostCapacity.java
### Line: 41
```
switch(currentOS) {
    case DARWIN:
        localResources = LocalHostResourceManagerDarwin.getLocalHostResources();
        break;
    case LINUX:
        localResources = LocalHostResourceManagerLinux.getLocalHostResources();
        break;
    default:
        break;
}
```

## bazel\src\main\java\com\google\devtools\build\lib\syntax\Parser.java
### Line: 406
```
switch(token.kind) {
    case ASSERT:
        error = "'assert' not supported, use 'fail' instead";
        break;
    case DEL:
        error = "'del' not supported, use '.pop()' to delete an item from a dictionary or a list";
        break;
    case IMPORT:
        error = "'import' not supported, use 'load' instead";
        break;
    case IS:
        error = "'is' not supported, use '==' instead";
        break;
    case LAMBDA:
        error = "'lambda' not supported, declare a function instead";
        break;
    case RAISE:
        error = "'raise' not supported, use 'fail' instead";
        break;
    case TRY:
        error = "'try' not supported, all exceptions are fatal";
        break;
    case WHILE:
        error = "'while' not supported, use 'for' instead";
        break;
    default:
        error = "keyword '" + token.kind.getPrettyName() + "' not supported";
        break;
}
```

## bazel\src\main\java\com\google\devtools\build\skydoc\rendering\MarkdownUtil.java
### Line: 83
```
switch(attrInfo.getType()) {
    case LABEL:
    case LABEL_LIST:
    case OUTPUT:
        typeLink = "https://bazel.build/docs/build-ref.html#labels";
        break;
    case NAME:
        typeLink = "https://bazel.build/docs/build-ref.html#name";
        break;
    case STRING_DICT:
    case STRING_LIST_DICT:
    case LABEL_STRING_DICT:
        typeLink = "https://bazel.build/docs/skylark/lib/dict.html";
        break;
    default:
        typeLink = null;
        break;
}
```

## bazel\src\test\java\com\google\devtools\build\lib\windows\MockSubprocess.java
### Line: 57
```
switch(arg.charAt(1)) {
    case '-':
        // Immediate string
        buf = arg.substring(2).getBytes(UTF8);
        break;
    case '$':
        // Environment variable
        buf = System.getenv(arg.substring(2)).getBytes(UTF8);
        break;
    case '.':
        buf = Paths.get(".").toAbsolutePath().normalize().toString().getBytes(UTF8);
        break;
    default:
        buf = registers.get(arg.charAt(1));
        break;
}
```

## bazel\src\tools\android\java\com\google\devtools\build\android\desugar\BytecodeTypeInference.java
### Line: 598
```
switch(type) {
    case Opcodes.F_NEW:
        // Expanded form.
        previousFrame = FrameInfo.create(convertTypesInStackMapFrame(nLocal, local), convertTypesInStackMapFrame(nStack, stack));
        break;
    case Opcodes.F_SAME:
        // This frame type indicates that the frame has exactly the same local variables as the
        // previous frame and that the operand stack is empty.
        previousFrame = FrameInfo.create(previousFrame.locals(), ImmutableList.of());
        break;
    case Opcodes.F_SAME1:
        // This frame type indicates that the frame has exactly the same local variables as the
        // previous frame and that the operand stack has one entry.
        previousFrame = FrameInfo.create(previousFrame.locals(), convertTypesInStackMapFrame(nStack, stack));
        break;
    case Opcodes.F_APPEND:
        // This frame type indicates that the frame has the same locals as the previous frame except
        // that k additional locals are defined, and that the operand stack is empty.
        previousFrame = FrameInfo.create(appendArrayToList(previousFrame.locals(), nLocal, local), ImmutableList.of());
        break;
    case Opcodes.F_CHOP:
        // This frame type indicates that the frame has the same local variables as the previous
        // frame except that the last k local variables are absent, and that the operand stack is
        // empty.
        previousFrame = FrameInfo.create(removeBackFromList(previousFrame.locals(), nLocal), ImmutableList.of());
        break;
    case Opcodes.F_FULL:
        previousFrame = FrameInfo.create(convertTypesInStackMapFrame(nLocal, local), convertTypesInStackMapFrame(nStack, stack));
        break;
    default:
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\classfile\instruction\SimpleInstruction.java
### Line: 152
```
switch(requiredConstantSize()) {
    case 0:
        opcode = (byte) (InstructionConstants.OP_ICONST_0 + constant);
        break;
    case 1:
        opcode = InstructionConstants.OP_BIPUSH;
        break;
    case 2:
        opcode = InstructionConstants.OP_SIPUSH;
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\classfile\instruction\VariableInstruction.java
### Line: 226
```
switch(opcode) {
    case InstructionConstants.OP_ILOAD:
        opcode = (byte) (InstructionConstants.OP_ILOAD_0 + variableIndex);
        break;
    case InstructionConstants.OP_LLOAD:
        opcode = (byte) (InstructionConstants.OP_LLOAD_0 + variableIndex);
        break;
    case InstructionConstants.OP_FLOAD:
        opcode = (byte) (InstructionConstants.OP_FLOAD_0 + variableIndex);
        break;
    case InstructionConstants.OP_DLOAD:
        opcode = (byte) (InstructionConstants.OP_DLOAD_0 + variableIndex);
        break;
    case InstructionConstants.OP_ALOAD:
        opcode = (byte) (InstructionConstants.OP_ALOAD_0 + variableIndex);
        break;
    case InstructionConstants.OP_ISTORE:
        opcode = (byte) (InstructionConstants.OP_ISTORE_0 + variableIndex);
        break;
    case InstructionConstants.OP_LSTORE:
        opcode = (byte) (InstructionConstants.OP_LSTORE_0 + variableIndex);
        break;
    case InstructionConstants.OP_FSTORE:
        opcode = (byte) (InstructionConstants.OP_FSTORE_0 + variableIndex);
        break;
    case InstructionConstants.OP_DSTORE:
        opcode = (byte) (InstructionConstants.OP_DSTORE_0 + variableIndex);
        break;
    case InstructionConstants.OP_ASTORE:
        opcode = (byte) (InstructionConstants.OP_ASTORE_0 + variableIndex);
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\optimize\info\SideEffectInstructionChecker.java
### Line: 106
```
// Check for instructions that might cause side effects.
switch(opcode) {
    case InstructionConstants.OP_IDIV:
    case InstructionConstants.OP_LDIV:
    case InstructionConstants.OP_IREM:
    case InstructionConstants.OP_LREM:
    case InstructionConstants.OP_IALOAD:
    case InstructionConstants.OP_LALOAD:
    case InstructionConstants.OP_FALOAD:
    case InstructionConstants.OP_DALOAD:
    case InstructionConstants.OP_AALOAD:
    case InstructionConstants.OP_BALOAD:
    case InstructionConstants.OP_CALOAD:
    case InstructionConstants.OP_SALOAD:
    case InstructionConstants.OP_NEWARRAY:
    case InstructionConstants.OP_ARRAYLENGTH:
    case InstructionConstants.OP_ANEWARRAY:
    case InstructionConstants.OP_MULTIANEWARRAY:
        // These instructions strictly taken may cause a side effect
        // (ArithmeticException, NullPointerException,
        // ArrayIndexOutOfBoundsException, NegativeArraySizeException).
        hasSideEffects = OPTIMIZE_CONSERVATIVELY;
        break;
    case InstructionConstants.OP_IASTORE:
    case InstructionConstants.OP_LASTORE:
    case InstructionConstants.OP_FASTORE:
    case InstructionConstants.OP_DASTORE:
    case InstructionConstants.OP_AASTORE:
    case InstructionConstants.OP_BASTORE:
    case InstructionConstants.OP_CASTORE:
    case InstructionConstants.OP_SASTORE:
    case InstructionConstants.OP_ATHROW:
    case InstructionConstants.OP_MONITORENTER:
    case InstructionConstants.OP_MONITOREXIT:
        // These instructions always cause a side effect.
        hasSideEffects = true;
        break;
    case InstructionConstants.OP_IRETURN:
    case InstructionConstants.OP_LRETURN:
    case InstructionConstants.OP_FRETURN:
    case InstructionConstants.OP_DRETURN:
    case InstructionConstants.OP_ARETURN:
    case InstructionConstants.OP_RETURN:
        // These instructions may have a side effect.
        hasSideEffects = includeReturnInstructions;
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\optimize\info\SideEffectInstructionChecker.java
### Line: 163
```
// Check for instructions that might cause side effects.
switch(opcode) {
    case InstructionConstants.OP_RET:
        // This instruction may have a side effect.
        hasSideEffects = includeReturnInstructions;
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\optimize\info\SideEffectInstructionChecker.java
### Line: 260
```
// Check for instructions that might cause side effects.
switch(opcode) {
    case InstructionConstants.OP_JSR:
    case InstructionConstants.OP_JSR_W:
        hasSideEffects = includeReturnInstructions;
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\optimize\peephole\MethodInliner.java
### Line: 316
```
switch(parameterType.charAt(0)) {
    case ClassConstants.TYPE_BOOLEAN:
    case ClassConstants.TYPE_BYTE:
    case ClassConstants.TYPE_CHAR:
    case ClassConstants.TYPE_SHORT:
    case ClassConstants.TYPE_INT:
        opcode = InstructionConstants.OP_ISTORE;
        break;
    case ClassConstants.TYPE_LONG:
        opcode = InstructionConstants.OP_LSTORE;
        break;
    case ClassConstants.TYPE_FLOAT:
        opcode = InstructionConstants.OP_FSTORE;
        break;
    case ClassConstants.TYPE_DOUBLE:
        opcode = InstructionConstants.OP_DSTORE;
        break;
    default:
        opcode = InstructionConstants.OP_ASTORE;
        break;
}
```

## bazel\third_party\java\proguard\proguard5.3.3\src\proguard\optimize\TailRecursionSimplifier.java
### Line: 314
```
switch(parameterType.charAt(0)) {
    case ClassConstants.TYPE_BOOLEAN:
    case ClassConstants.TYPE_BYTE:
    case ClassConstants.TYPE_CHAR:
    case ClassConstants.TYPE_SHORT:
    case ClassConstants.TYPE_INT:
        opcode = InstructionConstants.OP_ISTORE;
        break;
    case ClassConstants.TYPE_LONG:
        opcode = InstructionConstants.OP_LSTORE;
        break;
    case ClassConstants.TYPE_FLOAT:
        opcode = InstructionConstants.OP_FSTORE;
        break;
    case ClassConstants.TYPE_DOUBLE:
        opcode = InstructionConstants.OP_DSTORE;
        break;
    default:
        opcode = InstructionConstants.OP_ASTORE;
        break;
}
```

## bazel\third_party\protobuf\3.6.1\java\core\src\main\java\com\google\protobuf\Descriptors.java
### Line: 1461
```
switch(getJavaType()) {
    case ENUM:
        // We guarantee elsewhere that an enum type always has at least
        // one possible value.
        defaultValue = enumType.getValues().get(0);
        break;
    case MESSAGE:
        defaultValue = null;
        break;
    default:
        defaultValue = getJavaType().defaultDefault;
        break;
}
```

## bazel\third_party\protobuf\3.6.1\java\core\src\main\java\com\google\protobuf\FieldSet.java
### Line: 397
```
switch(type.getJavaType()) {
    case INT:
        isValid = value instanceof Integer;
        break;
    case LONG:
        isValid = value instanceof Long;
        break;
    case FLOAT:
        isValid = value instanceof Float;
        break;
    case DOUBLE:
        isValid = value instanceof Double;
        break;
    case BOOLEAN:
        isValid = value instanceof Boolean;
        break;
    case STRING:
        isValid = value instanceof String;
        break;
    case BYTE_STRING:
        isValid = value instanceof ByteString || value instanceof byte[];
        break;
    case ENUM:
        // TODO(kenton):  Caller must do type checking here, I guess.
        isValid = (value instanceof Integer || value instanceof Internal.EnumLite);
        break;
    case MESSAGE:
        // TODO(kenton):  Caller must do type checking here, I guess.
        isValid = (value instanceof MessageLite) || (value instanceof LazyField);
        break;
}
```

## bazel\third_party\protobuf\3.6.1\ruby\src\main\java\com\google\protobuf\jruby\RubyMessage.java
### Line: 506
```
switch(fieldDescriptor.getType()) {
    case INT32:
        val = RubyNumeric.num2int(value);
        break;
    case INT64:
        val = RubyNumeric.num2long(value);
        break;
    case UINT32:
        val = Utils.num2uint(value);
        break;
    case UINT64:
        val = Utils.num2ulong(context.runtime, value);
        break;
    default:
        break;
}
```

## bazel\third_party\protobuf\3.6.1\ruby\src\main\java\com\google\protobuf\jruby\Utils.java
### Line: 193
```
switch(type) {
    case BYTES:
        value = ((RubyString) value).encode(context, context.runtime.evalScriptlet("Encoding::ASCII_8BIT"));
        break;
    case STRING:
        value = ((RubyString) value).encode(context, context.runtime.evalScriptlet("Encoding::UTF_8"));
        break;
    default:
        break;
}
```

## BottomBar\app\src\main\java\com\example\bottombar\sample\MainActivity.java
### Line: 27
```
switch(v.getId()) {
    case R.id.simple_three_tabs:
        clazz = ThreeTabsActivity.class;
        break;
    case R.id.icons_only:
        clazz = IconsOnlyActivity.class;
        break;
    case R.id.five_tabs_changing_colors:
        clazz = FiveColorChangingTabsActivity.class;
        break;
    case R.id.three_tabs_quick_return:
        clazz = ThreeTabsQRActivity.class;
        break;
    case R.id.five_tabs_custom_colors:
        clazz = CustomColorAndFontActivity.class;
        break;
    case R.id.badges:
        clazz = BadgeActivity.class;
        break;
}
```

## BottomBar\app\src\main\java\com\example\bottombar\sample\TabMessage.java
### Line: 10
```
switch(menuItemId) {
    case R.id.tab_recents:
        message += "recents";
        break;
    case R.id.tab_favorites:
        message += "favorites";
        break;
    case R.id.tab_nearby:
        message += "nearby";
        break;
    case R.id.tab_friends:
        message += "friends";
        break;
    case R.id.tab_food:
        message += "food";
        break;
}
```

## bytecode-viewer\src\org\objectweb\asm\commons\GeneratorAdapter.java
### Line: 1042
```
switch(mode) {
    case EQ:
        intOp = Opcodes.IF_ICMPEQ;
        break;
    case NE:
        intOp = Opcodes.IF_ICMPNE;
        break;
    case GE:
        intOp = Opcodes.IF_ICMPGE;
        break;
    case LT:
        intOp = Opcodes.IF_ICMPLT;
        break;
    case LE:
        intOp = Opcodes.IF_ICMPLE;
        break;
    case GT:
        intOp = Opcodes.IF_ICMPGT;
        break;
}
```

## bytecode-viewer\src\org\objectweb\asm\commons\LocalVariablesSorter.java
### Line: 124
```
switch(opcode) {
    case Opcodes.LLOAD:
    case Opcodes.LSTORE:
        type = Type.LONG_TYPE;
        break;
    case Opcodes.DLOAD:
    case Opcodes.DSTORE:
        type = Type.DOUBLE_TYPE;
        break;
    case Opcodes.FLOAD:
    case Opcodes.FSTORE:
        type = Type.FLOAT_TYPE;
        break;
    case Opcodes.ILOAD:
    case Opcodes.ISTORE:
        type = Type.INT_TYPE;
        break;
    default:
        // case Opcodes.ALOAD:
        // case Opcodes.ASTORE:
        // case RET:
        type = OBJECT_TYPE;
        break;
}
```

## bytecode-viewer\src\org\objectweb\asm\commons\LocalVariablesSorter.java
### Line: 265
```
switch(type.getSort()) {
    case Type.BOOLEAN:
    case Type.CHAR:
    case Type.BYTE:
    case Type.SHORT:
    case Type.INT:
        t = Opcodes.INTEGER;
        break;
    case Type.FLOAT:
        t = Opcodes.FLOAT;
        break;
    case Type.LONG:
        t = Opcodes.LONG;
        break;
    case Type.DOUBLE:
        t = Opcodes.DOUBLE;
        break;
    case Type.ARRAY:
        t = type.getDescriptor();
        break;
    // case Type.OBJECT:
    default:
        t = type.getInternalName();
        break;
}
```

## bytecode-viewer\src\org\objectweb\asm\MethodWriter.java
### Line: 850
```
switch(opcode) {
    case Opcodes.GETSTATIC:
        size = stackSize + (c == 'D' || c == 'J' ? 2 : 1);
        break;
    case Opcodes.PUTSTATIC:
        size = stackSize + (c == 'D' || c == 'J' ? -2 : -1);
        break;
    case Opcodes.GETFIELD:
        size = stackSize + (c == 'D' || c == 'J' ? 1 : 0);
        break;
    // case Constants.PUTFIELD:
    default:
        size = stackSize + (c == 'D' || c == 'J' ? -3 : -2);
        break;
}
```

## cat\cat-home\src\main\java\com\dianping\cat\report\page\overload\task\TableCapacityService.java
### Line: 119
```
switch(reportType) {
    case CapacityUpdater.HOURLY_TYPE:
        report = m_hourlyReportDao.findByPK(reportId, HourlyReportEntity.READSET_FULL);
        break;
    case CapacityUpdater.DAILY_TYPE:
        report = m_dailyReportDao.findByPK(reportId, DailyReportEntity.READSET_FULL);
        break;
    case CapacityUpdater.WEEKLY_TYPE:
        report = m_weeklyReportDao.findByPK(reportId, WeeklyReportEntity.READSET_FULL);
        break;
    case CapacityUpdater.MONTHLY_TYPE:
        report = m_monthlyReportDao.findByPK(reportId, MonthlyReportEntity.READSET_FULL);
        break;
}
```

## cat\lib\java\src\main\java\com\dianping\cat\message\internal\DefaultTransaction.java
### Line: 197
```
switch(longType) {
    case LONG_CACHE:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_CACHE.getName());
        break;
    case LONG_CALL:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_CALL.getName());
        break;
    case LONG_SERVICE:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_SERVICE.getName());
        break;
    case LONG_SQL:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_SQL.getName());
        break;
    case LONG_URL:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_URL.getName());
        break;
    case LONG_MQ:
        threshold = config.getLongConfigThreshold(ProblemLongType.LONG_MQ.getName());
        break;
}
```

## cat\lib\java\src\main\java\com\dianping\cat\status\jvm\ThreadInfoWriter.java
### Line: 148
```
switch(externalFlag) {
    case 10:
        result = "A";
        break;
    case 11:
        result = "B";
        break;
    case 12:
        result = "C";
        break;
    case 13:
        result = "D";
        break;
    case 14:
        result = "E";
        break;
    case 15:
        result = "F";
        break;
    default:
        result = String.valueOf(externalFlag);
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.core\src\org\jkiss\dbeaver\registry\driver\DriverDescriptor.java
### Line: 1503
```
switch(localName) {
    case RegistryConstants.TAG_LIBRARY:
        curLibrary = null;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.core\src\org\jkiss\dbeaver\registry\maven\versioning\ComparableVersion.java
### Line: 155
```
// a1 = alpha-1, b1 = beta-1, m1 = milestone-1
switch(value.charAt(0)) {
    case 'a':
        value = "alpha";
        break;
    case 'b':
        value = "beta";
        break;
    case 'm':
        value = "milestone";
        break;
    default:
}
```

## dbeaver\plugins\org.jkiss.dbeaver.core\src\org\jkiss\dbeaver\ui\actions\datasource\DataSourceHandler.java
### Line: 270
```
switch(closeConfirmer.result) {
    case IDialogConstants.YES_ID:
        commitTxn = true;
        break;
    case IDialogConstants.NO_ID:
        commitTxn = false;
        break;
    default:
        return false;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.data.transfer\src\org\jkiss\dbeaver\tools\transfer\database\DatabaseMappingAttribute.java
### Line: 111
```
switch(mappingType) {
    case create:
        targetName = getSource().getName();
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.data.transfer\src\org\jkiss\dbeaver\tools\transfer\database\page\ColumnsMappingDialog.java
### Line: 316
```
switch(mapping.getMappingType()) {
    case unspecified:
        text = "?";
        break;
    case existing:
        text = "existing";
        break;
    case create:
        text = "new";
        break;
    case skip:
        text = "skip";
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.data.transfer\src\org\jkiss\dbeaver\tools\transfer\database\page\DatabaseConsumerPageMapping.java
### Line: 525
```
switch(mapping.getParent().getMappingType()) {
    case skip:
    case unspecified:
        allowsCreate = false;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.data.transfer\src\org\jkiss\dbeaver\tools\transfer\stream\StreamTransferConsumer.java
### Line: 146
```
switch(settings.getLobExtractType()) {
    case SKIP:
        // Set it it null
        value = null;
        break;
    case INLINE:
        // Just pass content to exporter
        break;
    case FILES:
        // Save content to file and pass file reference to exporter
        value = saveContentToFile(session.getProgressMonitor(), (DBDContent) value);
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.erd\src\org\jkiss\dbeaver\ext\erd\editor\ERDPreferencePage.java
### Line: 140
```
switch(store.getInt(ERDConstants.PREF_PRINT_PAGE_MODE)) {
    case PrintFigureOperation.FIT_PAGE:
        modeIndex = 1;
        break;
    case PrintFigureOperation.FIT_WIDTH:
        modeIndex = 2;
        break;
    case PrintFigureOperation.FIT_HEIGHT:
        modeIndex = 3;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.erd\src\org\jkiss\dbeaver\ext\erd\editor\ERDPreferencePage.java
### Line: 177
```
switch(modeCombo.getSelectionIndex()) {
    case 1:
        pageMode = PrintFigureOperation.FIT_PAGE;
        break;
    case 2:
        pageMode = PrintFigureOperation.FIT_WIDTH;
        break;
    case 3:
        pageMode = PrintFigureOperation.FIT_HEIGHT;
        break;
    default:
        pageMode = PrintFigureOperation.TILE;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\data\GenericTimestampValueHandler.java
### Line: 46
```
switch(type.getTypeID()) {
    case Types.TIMESTAMP:
    case Types.TIMESTAMP_WITH_TIMEZONE:
        nativeFormat = dataSource.getNativeFormatTimestamp();
        break;
    case Types.TIME:
    case Types.TIME_WITH_TIMEZONE:
        nativeFormat = dataSource.getNativeFormatTime();
        break;
    case Types.DATE:
        nativeFormat = dataSource.getNativeFormatDate();
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\ForeignKeysCache.java
### Line: 103
```
switch(deferabilityNum) {
    case DatabaseMetaData.importedKeyInitiallyDeferred:
        deferability = DBSForeignKeyDeferability.INITIALLY_DEFERRED;
        break;
    case DatabaseMetaData.importedKeyInitiallyImmediate:
        deferability = DBSForeignKeyDeferability.INITIALLY_IMMEDIATE;
        break;
    case DatabaseMetaData.importedKeyNotDeferrable:
        deferability = DBSForeignKeyDeferability.NOT_DEFERRABLE;
        break;
    default:
        deferability = DBSForeignKeyDeferability.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\GenericProcedure.java
### Line: 159
```
switch(columnTypeNum) {
    case DatabaseMetaData.procedureColumnIn:
        parameterType = DBSProcedureParameterKind.IN;
        break;
    case DatabaseMetaData.procedureColumnInOut:
        parameterType = DBSProcedureParameterKind.INOUT;
        break;
    case DatabaseMetaData.procedureColumnOut:
        parameterType = DBSProcedureParameterKind.OUT;
        break;
    case DatabaseMetaData.procedureColumnReturn:
        parameterType = DBSProcedureParameterKind.RETURN;
        break;
    case DatabaseMetaData.procedureColumnResult:
        parameterType = DBSProcedureParameterKind.RESULTSET;
        break;
    default:
        parameterType = DBSProcedureParameterKind.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\GenericProcedure.java
### Line: 180
```
switch(columnTypeNum) {
    case DatabaseMetaData.functionColumnIn:
        parameterType = DBSProcedureParameterKind.IN;
        break;
    case DatabaseMetaData.functionColumnInOut:
        parameterType = DBSProcedureParameterKind.INOUT;
        break;
    case DatabaseMetaData.functionColumnOut:
        parameterType = DBSProcedureParameterKind.OUT;
        break;
    case DatabaseMetaData.functionReturn:
        parameterType = DBSProcedureParameterKind.RETURN;
        break;
    case DatabaseMetaData.functionColumnResult:
        parameterType = DBSProcedureParameterKind.RESULTSET;
        break;
    default:
        parameterType = DBSProcedureParameterKind.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\GenericTable.java
### Line: 380
```
switch(info.deferabilityNum) {
    case DatabaseMetaData.importedKeyInitiallyDeferred:
        deferability = DBSForeignKeyDeferability.INITIALLY_DEFERRED;
        break;
    case DatabaseMetaData.importedKeyInitiallyImmediate:
        deferability = DBSForeignKeyDeferability.INITIALLY_IMMEDIATE;
        break;
    case DatabaseMetaData.importedKeyNotDeferrable:
        deferability = DBSForeignKeyDeferability.NOT_DEFERRABLE;
        break;
    default:
        deferability = DBSForeignKeyDeferability.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\meta\GenericMetaModel.java
### Line: 228
```
switch(procTypeNum) {
    case DatabaseMetaData.procedureNoResult:
        procedureType = DBSProcedureType.PROCEDURE;
        break;
    case DatabaseMetaData.procedureReturnsResult:
        procedureType = DBSProcedureType.FUNCTION;
        break;
    case DatabaseMetaData.procedureResultUnknown:
        procedureType = DBSProcedureType.PROCEDURE;
        break;
    default:
        procedureType = DBSProcedureType.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.generic\src\org\jkiss\dbeaver\ext\generic\model\meta\GenericMetaModel.java
### Line: 308
```
switch(funcTypeNum) {
    // case DatabaseMetaData.functionResultUnknown: functionResultType = GenericFunctionResultType.UNKNOWN; break;
    case DatabaseMetaData.functionNoTable:
        functionResultType = GenericFunctionResultType.NO_TABLE;
        break;
    case DatabaseMetaData.functionReturnsTable:
        functionResultType = GenericFunctionResultType.TABLE;
        break;
    default:
        functionResultType = GenericFunctionResultType.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.mssql\src\org\jkiss\dbeaver\ext\mssql\model\SQLServerSchema.java
### Line: 401
```
switch(indexTypeNum) {
    case 0:
        indexType = SQLServerConstants.INDEX_TYPE_HEAP;
        break;
    case 1:
        indexType = DBSIndexType.CLUSTERED;
        break;
    case 2:
        indexType = SQLServerConstants.INDEX_TYPE_NON_CLUSTERED;
        break;
    default:
        indexType = DBSIndexType.OTHER;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.mysql\src\org\jkiss\dbeaver\ext\mysql\model\MySQLCatalog.java
### Line: 711
```
switch(columnTypeNum) {
    case DatabaseMetaData.procedureColumnIn:
        parameterType = DBSProcedureParameterKind.IN;
        break;
    case DatabaseMetaData.procedureColumnInOut:
        parameterType = DBSProcedureParameterKind.INOUT;
        break;
    case DatabaseMetaData.procedureColumnOut:
        parameterType = DBSProcedureParameterKind.OUT;
        break;
    case DatabaseMetaData.procedureColumnReturn:
        parameterType = DBSProcedureParameterKind.RETURN;
        break;
    case DatabaseMetaData.procedureColumnResult:
        parameterType = DBSProcedureParameterKind.RESULTSET;
        break;
    default:
        parameterType = DBSProcedureParameterKind.UNKNOWN;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreDataType.java
### Line: 905
```
switch(name) {
    case "bytea":
        valueType = Types.BINARY;
        break;
    case "xml":
        valueType = Types.SQLXML;
        break;
    default:
        valueType = Types.OTHER;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreDataType.java
### Line: 852
```
switch((int) typeId) {
    case PostgreOid.DATE:
        valueType = Types.DATE;
        break;
    case PostgreOid.TIME:
    case PostgreOid.TIMETZ:
        valueType = Types.TIME;
        break;
    case PostgreOid.TIMESTAMP:
    case PostgreOid.TIMESTAMPTZ:
        valueType = Types.TIMESTAMP;
        break;
    default:
        valueType = Types.TIMESTAMP;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreDataType.java
### Line: 875
```
switch(typeLength) {
    case 4:
        valueType = Types.FLOAT;
        break;
    case 8:
        valueType = Types.DOUBLE;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreDataType.java
### Line: 884
```
switch(typeLength) {
    case 2:
        valueType = Types.SMALLINT;
        break;
    case 4:
        valueType = Types.INTEGER;
        break;
    case 8:
        valueType = Types.BIGINT;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreGenericTypeCache.java
### Line: 145
```
switch(name) {
    case "bytea":
        valueType = Types.BINARY;
        break;
    case "xml":
        valueType = Types.SQLXML;
        break;
    default:
        valueType = Types.OTHER;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreGenericTypeCache.java
### Line: 115
```
switch(typeLength) {
    case 4:
        valueType = Types.FLOAT;
        break;
    case 8:
        valueType = Types.DOUBLE;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\model\PostgreGenericTypeCache.java
### Line: 124
```
switch(typeLength) {
    case 2:
        valueType = Types.SMALLINT;
        break;
    case 4:
        valueType = Types.INTEGER;
        break;
    case 8:
        valueType = Types.BIGINT;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ext.postgresql\src\org\jkiss\dbeaver\ext\postgresql\PostgreUtils.java
### Line: 326
```
switch(typmod) {
    case -1:
        secondSize = 6 + 1;
        break;
    case 0:
        secondSize = 0;
        break;
    case 1:
        // Bizarrely SELECT '0:0:0.1'::time(1); returns 2 digits.
        secondSize = 2 + 1;
        break;
    default:
        secondSize = typmod + 1;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.lang\src\org\jkiss\dbeaver\lang\sql\SQLNodeParser.java
### Line: 49
```
switch((SQLKeyword) keyword) {
    case SELECT:
        statement = new SQLStatementSelect(container);
        break;
    case INSERT:
    case UPDATE:
    case DELETE:
        break;
    default:
        // Unexpected keyword
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.model\src\org\jkiss\dbeaver\model\impl\jdbc\data\handlers\JDBCContentValueHandler.java
### Line: 79
```
// This may happen in some bad drivers like ODBC bridge
switch(type.getTypeID()) {
    case java.sql.Types.CHAR:
    case java.sql.Types.VARCHAR:
    case java.sql.Types.NVARCHAR:
    case java.sql.Types.LONGVARCHAR:
    case java.sql.Types.LONGNVARCHAR:
    case java.sql.Types.CLOB:
    case java.sql.Types.NCLOB:
        value = resultSet.getString(index);
        break;
    case java.sql.Types.BINARY:
    case java.sql.Types.VARBINARY:
    case java.sql.Types.LONGVARBINARY:
    case java.sql.Types.BLOB:
        value = resultSet.getBytes(index);
        break;
    case java.sql.Types.SQLXML:
        value = resultSet.getSQLXML(index);
        break;
    default:
        value = resultSet.getObject(index);
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.model\src\org\jkiss\dbeaver\model\navigator\DBNModel.java
### Line: 267
```
switch(nodePath.type) {
    case database:
        curNode = projectNode.getDatabases().getDataSource(nodePath.first());
        break;
    case folder:
        curNode = projectNode.getDatabases();
        break;
    default:
        curNode = projectNode;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.net.ssh.jsch\src\org\jkiss\dbeaver\model\net\ssh\SSHImplementationJsch.java
### Line: 181
```
switch(level) {
    case INFO:
        levelStr = "INFO";
        break;
    case WARN:
        levelStr = "WARN";
        break;
    case ERROR:
        levelStr = "ERROR";
        break;
    case FATAL:
        levelStr = "FATAL";
        break;
    case DEBUG:
    default:
        levelStr = "DEBUG";
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui\src\org\jkiss\dbeaver\ui\dialogs\exec\ExecutionQueueErrorJob.java
### Line: 56
```
switch(result) {
    case IDialogConstants.CANCEL_ID:
    case IDialogConstants.STOP_ID:
        response = ExecutionQueueErrorResponse.STOP;
        break;
    case IDialogConstants.SKIP_ID:
        response = ExecutionQueueErrorResponse.IGNORE;
        break;
    case IDialogConstants.RETRY_ID:
        response = ExecutionQueueErrorResponse.RETRY;
        break;
    case IDialogConstants.IGNORE_ID:
        response = ExecutionQueueErrorResponse.IGNORE_ALL;
        break;
    default:
        response = ExecutionQueueErrorResponse.STOP;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui\src\org\jkiss\dbeaver\ui\notifications\DatabaseNotification.java
### Line: 69
```
switch(messageType) {
    case ERROR:
        iconType = SWT.ICON_ERROR;
        break;
    case WARNING:
        iconType = SWT.ICON_WARNING;
        break;
    default:
        iconType = SWT.ICON_INFORMATION;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui\src\org\jkiss\dbeaver\ui\TrayIconHandler.java
### Line: 133
```
switch(status) {
    case IStatus.INFO:
        type = TrayIcon.MessageType.INFO;
        break;
    case IStatus.ERROR:
        type = TrayIcon.MessageType.ERROR;
        break;
    case IStatus.WARNING:
        type = TrayIcon.MessageType.WARNING;
        break;
    default:
        type = TrayIcon.MessageType.NONE;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.editors.data\src\org\jkiss\dbeaver\ui\controls\resultset\StatusLabel.java
### Line: 130
```
switch(messageType) {
    case ERROR:
        // fg = colorError;
        statusIconId = Dialog.DLG_IMG_MESSAGE_ERROR;
        break;
    case WARNING:
        // fg = colorWarning;
        statusIconId = Dialog.DLG_IMG_MESSAGE_WARNING;
        break;
    default:
        // fg = null;
        statusIconId = Dialog.DLG_IMG_MESSAGE_INFO;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.editors.data\src\org\jkiss\dbeaver\ui\editors\content\ContentEditor.java
### Line: 166
```
switch(matchType) {
    case EXCLUSIVE:
    case PRIMARY:
        setDefault = true;
        break;
    case DEFAULT:
        setDefault = (defaultMatch == IStreamValueManager.MatchType.APPLIES);
        break;
    default:
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.editors.sql\src\org\jkiss\dbeaver\ui\controls\ObjectCompilerLogViewer.java
### Line: 113
```
switch(type) {
    case LOG_LEVEL_TRACE:
        color = SWT.COLOR_DARK_BLUE;
        break;
    case LOG_LEVEL_DEBUG:
    case LOG_LEVEL_INFO:
        break;
    case LOG_LEVEL_WARN:
        color = SWT.COLOR_DARK_YELLOW;
        break;
    case LOG_LEVEL_ERROR:
    case LOG_LEVEL_FATAL:
        color = SWT.COLOR_DARK_RED;
        break;
    default:
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.editors.sql\src\org\jkiss\dbeaver\ui\editors\sql\execute\SQLQueryJob.java
### Line: 333
```
switch(confirmResult) {
    case IDialogConstants.NO_ID:
        return true;
    case IDialogConstants.YES_ID:
        break;
    case IDialogConstants.YES_TO_ALL_ID:
        skipConfirmation = true;
        break;
    default:
        return false;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.editors.sql\src\org\jkiss\dbeaver\ui\editors\sql\handlers\NavigateQueryHandler.java
### Line: 42
```
switch(actionId) {
    case SQLEditorCommands.CMD_SQL_QUERY_NEXT:
        nextQuery = editor.extractNextQuery(true);
        break;
    case SQLEditorCommands.CMD_SQL_QUERY_PREV:
        nextQuery = editor.extractNextQuery(false);
        break;
    default:
        nextQuery = null;
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.navigator\src\org\jkiss\dbeaver\ui\editors\entity\ErrorEditorPartEx.java
### Line: 123
```
switch(error.getSeverity()) {
    case IStatus.ERROR:
        image = d.getSystemImage(SWT.ICON_ERROR);
        break;
    case IStatus.WARNING:
        image = d.getSystemImage(SWT.ICON_WARNING);
        break;
    default:
        image = d.getSystemImage(SWT.ICON_INFORMATION);
        break;
}
```

## dbeaver\plugins\org.jkiss.dbeaver.ui.navigator\src\org\jkiss\dbeaver\ui\editors\entity\handlers\SaveChangesHandler.java
### Line: 115
```
switch(confirmResult) {
    case IDialogConstants.YES_ID:
        choice = ISaveablePart2.YES;
        break;
    case IDialogConstants.NO_ID:
        choice = ISaveablePart2.NO;
        break;
    default:
        choice = ISaveablePart2.CANCEL;
        break;
}
```

## deeplearning4j\datavec\datavec-api\src\main\java\org\datavec\api\transform\transform\string\ChangeCaseStringTransform.java
### Line: 50
```
switch(caseType) {
    case UPPER:
        result = input.toUpperCase();
        break;
    case LOWER:
    default:
        result = input.toLowerCase();
        break;
}
```

## deeplearning4j\datavec\datavec-arrow\src\main\java\org\datavec\arrow\ArrowConverter.java
### Line: 178
```
switch(type) {
    case Integer:
        buffer = Nd4j.createBuffer(direct, DataType.INT, cols, 0);
        break;
    case Float:
        buffer = Nd4j.createBuffer(direct, DataType.FLOAT, cols);
        break;
    case Double:
        buffer = Nd4j.createBuffer(direct, DataType.DOUBLE, cols);
        break;
    case Long:
        buffer = Nd4j.createBuffer(direct, DataType.LONG, cols);
        break;
}
```

## deeplearning4j\datavec\datavec-data\datavec-data-image\src\main\java\org\datavec\image\loader\NativeImageLoader.java
### Line: 560
```
switch((int) channels) {
    case 3:
        code = CV_GRAY2BGR;
        break;
    case 4:
        code = CV_GRAY2RGBA;
        break;
}
```

## deeplearning4j\datavec\datavec-data\datavec-data-image\src\main\java\org\datavec\image\loader\NativeImageLoader.java
### Line: 570
```
switch((int) channels) {
    case 1:
        code = CV_BGR2GRAY;
        break;
    case 4:
        code = CV_BGR2RGBA;
        break;
}
```

## deeplearning4j\datavec\datavec-data\datavec-data-image\src\main\java\org\datavec\image\loader\NativeImageLoader.java
### Line: 580
```
switch((int) channels) {
    case 1:
        code = CV_RGBA2GRAY;
        break;
    case 3:
        code = CV_RGBA2BGR;
        break;
}
```

## deeplearning4j\deeplearning4j\deeplearning4j-cuda\src\main\java\org\deeplearning4j\nn\layers\convolution\subsampling\CudnnSubsamplingHelper.java
### Line: 140
```
switch(poolingType) {
    case AVG:
        poolingMode = CUDNN_POOLING_AVERAGE_COUNT_INCLUDE_PADDING;
        break;
    case MAX:
        poolingMode = CUDNN_POOLING_MAX;
        break;
    default:
        return null;
}
```

## deeplearning4j\deeplearning4j\deeplearning4j-cuda\src\main\java\org\deeplearning4j\nn\layers\convolution\subsampling\CudnnSubsamplingHelper.java
### Line: 225
```
switch(poolingType) {
    case AVG:
        poolingMode = CUDNN_POOLING_AVERAGE_COUNT_INCLUDE_PADDING;
        break;
    case MAX:
        poolingMode = CUDNN_POOLING_MAX;
        break;
    default:
        return null;
}
```

## deeplearning4j\nd4j\nd4j-backends\nd4j-api-parent\nd4j-api\src\main\java\org\nd4j\imports\graphmapper\onnx\OnnxGraphMapper.java
### Line: 241
```
switch(type) {
    case INT:
        valueToSet = attr.getI();
        break;
    case FLOAT:
        valueToSet = attr.getF();
        break;
    case STRING:
        valueToSet = attr.getF();
        break;
}
```

## deeplearning4j\nd4j\nd4j-backends\nd4j-api-parent\nd4j-api\src\main\java\org\nd4j\imports\graphmapper\tf\TFGraphMapper.java
### Line: 235
```
switch(type) {
    case DT_BOOL:
        valueToSet = attr.getB();
        break;
    case DT_INT8:
        valueToSet = attr.getI();
        break;
    case DT_INT16:
        valueToSet = attr.getI();
        break;
    case DT_INT32:
        valueToSet = attr.getI();
        break;
    case DT_FLOAT:
        valueToSet = attr.getF();
        break;
    case DT_DOUBLE:
        valueToSet = attr.getF();
        break;
    case DT_STRING:
        valueToSet = attr.getS();
        break;
    case DT_INT64:
        valueToSet = attr.getI();
        break;
}
```

## deeplearning4j\nd4j\nd4j-backends\nd4j-api-parent\nd4j-api\src\main\java\org\nd4j\linalg\api\shape\options\ArrayOptionsHelper.java
### Line: 148
```
switch(type) {
    case SPARSE:
        bit = ATYPE_SPARSE_BIT;
        break;
    case COMPRESSED:
        bit = ATYPE_COMPRESSED_BIT;
        break;
    case EMPTY:
        bit = ATYPE_EMPTY_BIT;
        break;
    default:
    case DENSE:
        return storage;
}
```

## druid\src\main\java\com\alibaba\druid\sql\dialect\mysql\parser\MySqlStatementParser.java
### Line: 1069
```
switch(lexer.token()) {
    case SELECT:
    case WITH:
    case DELETE:
    case UPDATE:
    case INSERT:
    case SHOW:
    case REPLACE:
    case TRUNCATE:
    case DROP:
    case ALTER:
    case CREATE:
    case CHECK:
    case SET:
        acceptHint = true;
        break;
    case IDENTIFIER:
        acceptHint = lexer.hash_lower() == FnvHash.Constants.DUMP || lexer.hash_lower() == FnvHash.Constants.RENAME;
        break;
    default:
        break;
}
```

## druid\src\main\java\com\alibaba\druid\sql\parser\SQLExprParser.java
### Line: 2435
```
switch(lexer.token) {
    case BETWEEN:
    case IS:
    case EQ:
    case IN:
    case CONTAINS:
    case BANG_TILDE_STAR:
    case TILDE_EQ:
    case LT:
    case LTEQ:
    case LTEQGT:
    case GT:
    case GTEQ:
    case LTGT:
    case BANGEQ:
    case LIKE:
    case NOT:
        expr = relationalRest(expr);
        break;
    default:
        break;
}
```

## druid\src\main\java\com\alibaba\druid\sql\parser\SQLSelectParser.java
### Line: 474
```
switch(lexer.token) {
    case BETWEEN:
    case IS:
    case EQ:
    case IN:
    case CONTAINS:
    case BANG_TILDE_STAR:
    case TILDE_EQ:
    case LT:
    case LTEQ:
    case LTEQGT:
    case GT:
    case GTEQ:
    case LTGT:
    case BANGEQ:
    case LIKE:
    case NOT:
        where = this.exprParser.relationalRest(where);
        break;
    default:
        break;
}
```

## druid\src\main\java\com\alibaba\druid\sql\SQLUtils.java
### Line: 824
```
switch(op) {
    case Equality:
        notOp = SQLBinaryOperator.LessThanOrGreater;
        break;
    case LessThanOrEqualOrGreaterThan:
        notOp = SQLBinaryOperator.Equality;
        break;
    case LessThan:
        notOp = SQLBinaryOperator.GreaterThanOrEqual;
        break;
    case LessThanOrEqual:
        notOp = SQLBinaryOperator.GreaterThan;
        break;
    case GreaterThan:
        notOp = SQLBinaryOperator.LessThanOrEqual;
        break;
    case GreaterThanOrEqual:
        notOp = SQLBinaryOperator.LessThan;
        break;
    case Is:
        notOp = SQLBinaryOperator.IsNot;
        break;
    case IsNot:
        notOp = SQLBinaryOperator.Is;
        break;
    default:
        break;
}
```

## druid\src\main\java\com\alibaba\druid\sql\visitor\SQLASTOutputVisitor.java
### Line: 546
```
switch(operator) {
    case BooleanAnd:
    case BooleanOr:
    case BooleanXor:
    case Assignment:
        quote = true;
        break;
    default:
        quote = ((SQLBinaryOpExpr) testExpr).isBracket();
        break;
}
```

## elasticsearch\server\src\main\java\org\elasticsearch\common\Strings.java
### Line: 96
```
switch(ch) {
    case 'n':
        ch = '\n';
        break;
    case 't':
        ch = '\t';
        break;
    case 'r':
        ch = '\r';
        break;
    case 'b':
        ch = '\b';
        break;
    case 'f':
        ch = '\f';
        break;
}
```

## elasticsearch\server\src\main\java\org\elasticsearch\index\mapper\DocumentParser.java
### Line: 631
```
switch(fieldType.typeName()) {
    case DateFieldMapper.CONTENT_TYPE:
        builder = context.root().findTemplateBuilder(context, currentFieldName, XContentFieldType.DATE);
        break;
    case "long":
        builder = context.root().findTemplateBuilder(context, currentFieldName, "long", XContentFieldType.LONG);
        break;
    case "double":
        builder = context.root().findTemplateBuilder(context, currentFieldName, "double", XContentFieldType.DOUBLE);
        break;
    case "integer":
        builder = context.root().findTemplateBuilder(context, currentFieldName, "integer", XContentFieldType.LONG);
        break;
    case "float":
        builder = context.root().findTemplateBuilder(context, currentFieldName, "float", XContentFieldType.DOUBLE);
        break;
    case BooleanFieldMapper.CONTENT_TYPE:
        builder = context.root().findTemplateBuilder(context, currentFieldName, "boolean", XContentFieldType.BOOLEAN);
        break;
    default:
        break;
}
```

## elasticsearch\server\src\main\java\org\elasticsearch\search\aggregations\bucket\composite\LongValuesSource.java
### Line: 256
```
switch(ft.typeName()) {
    case "long":
        toBucketFunction = (value) -> rounding.applyAsLong(LongPoint.decodeDimension(value, 0));
        break;
    case "int":
    case "short":
    case "byte":
        toBucketFunction = (value) -> rounding.applyAsLong(IntPoint.decodeDimension(value, 0));
        break;
    default:
        return null;
}
```

## elasticsearch\server\src\main\java\org\elasticsearch\search\aggregations\metrics\HyperLogLogPlusPlus.java
### Line: 775
```
switch(p) {
    case 4:
        alpha = 0.673;
        break;
    case 5:
        alpha = 0.697;
        break;
    default:
        alpha = 0.7213 / (1 + 1.079 / m);
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\action\admin\HotThreadsIT.java
### Line: 67
```
switch(randomIntBetween(0, 2)) {
    case 2:
        type = "cpu";
        break;
    case 1:
        type = "wait";
        break;
    default:
        type = "block";
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\common\geo\builders\EnvelopeBuilderTests.java
### Line: 52
```
// move one corner to the middle of original
switch(randomIntBetween(0, 3)) {
    case 0:
        mutation = new EnvelopeBuilder(new Coordinate(randomDoubleBetween(-180.0, original.bottomRight().x, true), original.topLeft().y), original.bottomRight());
        break;
    case 1:
        mutation = new EnvelopeBuilder(new Coordinate(original.topLeft().x, randomDoubleBetween(original.bottomRight().y, 90.0, true)), original.bottomRight());
        break;
    case 2:
        mutation = new EnvelopeBuilder(original.topLeft(), new Coordinate(randomDoubleBetween(original.topLeft().x, 180.0, true), original.bottomRight().y));
        break;
    case 3:
        mutation = new EnvelopeBuilder(original.topLeft(), new Coordinate(original.bottomRight().x, randomDoubleBetween(-90.0, original.topLeft().y, true)));
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\common\time\DateUtilsTests.java
### Line: 142
```
switch(randomChronoField) {
    case SECOND_OF_MINUTE:
        result = result.withNano(0);
        break;
    case MINUTE_OF_HOUR:
        result = result.withNano(0).withSecond(0);
        break;
    case HOUR_OF_DAY:
        result = result.withNano(0).withSecond(0).withMinute(0);
        break;
    case DAY_OF_MONTH:
        result = result.withNano(0).withSecond(0).withMinute(0).withHour(0);
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\index\fielddata\AbstractStringFieldDataTestCase.java
### Line: 394
```
switch(randomInt(4)) {
    case 0:
        missingValue = "_first";
        break;
    case 1:
        missingValue = "_last";
        break;
    case 2:
        missingValue = new BytesRef(RandomPicks.randomFrom(random(), values));
        break;
    default:
        missingValue = new BytesRef(TestUtil.randomSimpleString(random()));
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\monitor\jvm\JvmMonitorTests.java
### Line: 336
```
switch(expectedThreshold) {
    case WARN:
        fraction = randomIntBetween(warnThreshold, 100);
        break;
    case INFO:
        fraction = randomIntBetween(infoThreshold, warnThreshold - 1);
        break;
    case DEBUG:
        fraction = randomIntBetween(debugThreshold, infoThreshold - 1);
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\aggregations\bucket\SignificantTermsTests.java
### Line: 71
```
switch(minDocCount) {
    case 0:
        break;
    case 1:
    case 2:
    case 3:
    case 4:
        minDocCount = randomIntBetween(0, Integer.MAX_VALUE);
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\aggregations\bucket\SignificantTextTests.java
### Line: 49
```
switch(minDocCount) {
    case 0:
        break;
    case 1:
    case 2:
    case 3:
    case 4:
        minDocCount = randomIntBetween(0, Integer.MAX_VALUE);
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\fetch\subphase\highlight\HighlightBuilderTests.java
### Line: 542
```
switch(randomInt(2)) {
    case 0:
        highlightQuery = new MatchAllQueryBuilder();
        break;
    case 1:
        highlightQuery = new IdsQueryBuilder();
        break;
    default:
    case 2:
        highlightQuery = new TermQueryBuilder(randomAlphaOfLengthBetween(1, 10), randomAlphaOfLengthBetween(1, 10));
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\fetch\subphase\highlight\HighlightBuilderTests.java
### Line: 599
```
switch(randomInt(2)) {
    case 0:
        value = randomAlphaOfLengthBetween(1, 10);
        break;
    case 1:
        value = Integer.valueOf(randomInt(1000));
        break;
    case 2:
        value = Boolean.valueOf(randomBoolean());
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\suggest\CompletionSuggestSearchIT.java
### Line: 1023
```
switch(contextMapping.getValue().type()) {
    case CATEGORY:
        mapping = mapping.field("path", ((CategoryContextMapping) contextMapping.getValue()).getFieldName());
        break;
    case GEO:
        mapping = mapping.field("path", ((GeoContextMapping) contextMapping.getValue()).getFieldName()).field("precision", ((GeoContextMapping) contextMapping.getValue()).getPrecision());
        break;
}
```

## elasticsearch\server\src\test\java\org\elasticsearch\search\suggest\phrase\PhraseSuggestionBuilderTests.java
### Line: 79
```
switch(randomIntBetween(0, 2)) {
    case 0:
        model = LaplaceModelTests.createRandomModel();
        break;
    case 1:
        model = StupidBackoffModelTests.createRandomModel();
        break;
    case 2:
        model = LinearInterpolationModelTests.createRandomModel();
        break;
}
```

## elasticsearch\x-pack\plugin\ml\src\main\java\org\elasticsearch\xpack\ml\filestructurefinder\DelimitedFileStructureFinderFactory.java
### Line: 49
```
switch((char) csvPreference.getDelimiterChar()) {
    case ',':
        formatName = "CSV";
        break;
    case '\t':
        formatName = "TSV";
        break;
    default:
        formatName = Character.getName(csvPreference.getDelimiterChar()).toLowerCase(Locale.ROOT) + " delimited values";
        break;
}
```

## elasticsearch\x-pack\plugin\ml\src\test\java\org\elasticsearch\xpack\ml\filestructurefinder\TimestampFormatFinderTests.java
### Line: 299
```
switch(timestampFormat) {
    case "ISO8601":
        actualEpochMs = Joda.forPattern("date_optional_time").withZone(defaultZone).parseMillis(text);
        break;
    default:
        actualEpochMs = Joda.forPattern(timestampFormat).withYear(2018).withZone(defaultZone).parseMillis(text);
        break;
}
```

## elasticsearch\x-pack\plugin\sql\qa\src\main\java\org\elasticsearch\xpack\sql\qa\jdbc\JdbcAssert.java
### Line: 207
```
switch(columnClassName) {
    case "Date":
        columnClassName = "java.sql.Date";
        break;
    case "Timestamp":
        columnClassName = "java.sql.Timestamp";
        break;
    case "Int":
        columnClassName = "java.lang.Integer";
        break;
    default:
        columnClassName = "java.lang." + columnClassName;
        break;
}
```

## elasticsearch\x-pack\plugin\watcher\src\test\java\org\elasticsearch\xpack\watcher\common\http\HttpResponseTests.java
### Line: 45
```
switch(randomIntBetween(0, 2)) {
    case 0:
        response = new HttpResponse(status, body, headers);
        break;
    case 1:
        response = new HttpResponse(status, body.getBytes(StandardCharsets.UTF_8), headers);
        break;
    default:
        // 2
        response = new HttpResponse(status, new BytesArray(body), headers);
        break;
}
```

## elasticsearch\x-pack\plugin\watcher\src\test\java\org\elasticsearch\xpack\watcher\common\http\HttpResponseTests.java
### Line: 57
```
// body is null
switch(randomIntBetween(0, 3)) {
    case 0:
        response = new HttpResponse(status, (String) null, headers);
        break;
    case 1:
        response = new HttpResponse(status, (byte[]) null, headers);
        break;
    case 2:
        response = new HttpResponse(status, (BytesReference) null, headers);
        break;
    default:
        // 3
        response = new HttpResponse(status, headers);
        break;
}
```

## ExoPlayer\extensions\vp9\src\main\java\com\google\android\exoplayer2\ext\vp9\VpxRenderer.java
### Line: 167
```
switch(outputBuffer.colorspace) {
    case VpxOutputBuffer.COLORSPACE_BT601:
        colorConversion = kColorConversion601;
        break;
    case VpxOutputBuffer.COLORSPACE_BT2020:
        colorConversion = kColorConversion2020;
        break;
    case VpxOutputBuffer.COLORSPACE_BT709:
    default:
        // Do nothing
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\audio\Ac3Util.java
### Line: 258
```
switch(// strmtyp
data.readBits(2)) {
    case 0:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE0;
        break;
    case 1:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE1;
        break;
    case 2:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE2;
        break;
    default:
        streamType = SyncFrameInfo.STREAM_TYPE_UNDEFINED;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\extractor\mp3\VbriSeeker.java
### Line: 71
```
switch(entrySize) {
    case 1:
        segmentSize = frame.readUnsignedByte();
        break;
    case 2:
        segmentSize = frame.readUnsignedShort();
        break;
    case 3:
        segmentSize = frame.readUnsignedInt24();
        break;
    case 4:
        segmentSize = frame.readUnsignedIntToInt();
        break;
    default:
        return null;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\extractor\mp4\AtomParsers.java
### Line: 907
```
switch(layout) {
    case 0:
        stereoMode = C.STEREO_MODE_MONO;
        break;
    case 1:
        stereoMode = C.STEREO_MODE_TOP_BOTTOM;
        break;
    case 2:
        stereoMode = C.STEREO_MODE_LEFT_RIGHT;
        break;
    case 3:
        stereoMode = C.STEREO_MODE_STEREO_MESH;
        break;
    default:
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\extractor\ogg\OpusReader.java
### Line: 107
```
switch(toc & 0x3) {
    case 0:
        frames = 1;
        break;
    case 1:
    case 2:
        frames = 2;
        break;
    default:
        frames = packet[1] & 0x3F;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\extractor\ts\H262Reader.java
### Line: 228
```
switch(aspectRatioCode) {
    case 2:
        pixelWidthHeightRatio = (4 * height) / (float) (3 * width);
        break;
    case 3:
        pixelWidthHeightRatio = (16 * height) / (float) (9 * width);
        break;
    case 4:
        pixelWidthHeightRatio = (121 * height) / (float) (100 * width);
        break;
    default:
        // Do nothing.
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\metadata\scte35\SpliceInfoDecoder.java
### Line: 74
```
switch(spliceCommandType) {
    case TYPE_SPLICE_NULL:
        command = new SpliceNullCommand();
        break;
    case TYPE_SPLICE_SCHEDULE:
        command = SpliceScheduleCommand.parseFromSection(sectionData);
        break;
    case TYPE_SPLICE_INSERT:
        command = SpliceInsertCommand.parseFromSection(sectionData, ptsAdjustment, timestampAdjuster);
        break;
    case TYPE_TIME_SIGNAL:
        command = TimeSignalCommand.parseFromSection(sectionData, ptsAdjustment, timestampAdjuster);
        break;
    case TYPE_PRIVATE_COMMAND:
        command = PrivateCommand.parseFromSection(sectionData, spliceCommandLength, ptsAdjustment);
        break;
    default:
        // Do nothing.
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\text\subrip\SubripDecoder.java
### Line: 184
```
switch(alignmentTag) {
    case ALIGN_BOTTOM_LEFT:
    case ALIGN_MID_LEFT:
    case ALIGN_TOP_LEFT:
        positionAnchor = Cue.ANCHOR_TYPE_START;
        break;
    case ALIGN_BOTTOM_RIGHT:
    case ALIGN_MID_RIGHT:
    case ALIGN_TOP_RIGHT:
        positionAnchor = Cue.ANCHOR_TYPE_END;
        break;
    case ALIGN_BOTTOM_MID:
    case ALIGN_MID_MID:
    case ALIGN_TOP_MID:
    default:
        positionAnchor = Cue.ANCHOR_TYPE_MIDDLE;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\text\subrip\SubripDecoder.java
### Line: 205
```
switch(alignmentTag) {
    case ALIGN_BOTTOM_LEFT:
    case ALIGN_BOTTOM_MID:
    case ALIGN_BOTTOM_RIGHT:
        lineAnchor = Cue.ANCHOR_TYPE_END;
        break;
    case ALIGN_TOP_LEFT:
    case ALIGN_TOP_MID:
    case ALIGN_TOP_RIGHT:
        lineAnchor = Cue.ANCHOR_TYPE_START;
        break;
    case ALIGN_MID_LEFT:
    case ALIGN_MID_MID:
    case ALIGN_MID_RIGHT:
    default:
        lineAnchor = Cue.ANCHOR_TYPE_MIDDLE;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 696
```
switch(unit) {
    case "h":
        offsetSeconds *= 3600;
        break;
    case "m":
        offsetSeconds *= 60;
        break;
    case "s":
        // Do nothing.
        break;
    case "ms":
        offsetSeconds /= 1000;
        break;
    case "f":
        offsetSeconds /= frameAndTickRate.effectiveFrameRate;
        break;
    case "t":
        offsetSeconds /= frameAndTickRate.tickRate;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 487
```
switch(Util.toLowerInvariant(attributeValue)) {
    case TtmlNode.LEFT:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
        break;
    case TtmlNode.START:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
        break;
    case TtmlNode.RIGHT:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
        break;
    case TtmlNode.END:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
        break;
    case TtmlNode.CENTER:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_CENTER);
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 506
```
switch(Util.toLowerInvariant(attributeValue)) {
    case TtmlNode.LINETHROUGH:
        style = createIfNull(style).setLinethrough(true);
        break;
    case TtmlNode.NO_LINETHROUGH:
        style = createIfNull(style).setLinethrough(false);
        break;
    case TtmlNode.UNDERLINE:
        style = createIfNull(style).setUnderline(true);
        break;
    case TtmlNode.NO_UNDERLINE:
        style = createIfNull(style).setUnderline(false);
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\trackselection\MappingTrackSelector.java
### Line: 160
```
switch(rendererFormatSupport[i][j] & RendererCapabilities.FORMAT_SUPPORT_MASK) {
    case RendererCapabilities.FORMAT_HANDLED:
        return RENDERER_SUPPORT_PLAYABLE_TRACKS;
    case RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES:
        trackRendererSupport = RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS;
        break;
    default:
        trackRendererSupport = RENDERER_SUPPORT_UNSUPPORTED_TRACKS;
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\video\MediaCodecVideoRenderer.java
### Line: 1328
```
// https://github.com/google/ExoPlayer/issues/5312.
switch(Util.DEVICE) {
    case "1601":
    case "1713":
    case "1714":
    case "A10-70F":
    case "A1601":
    case "A2016a40":
    case "A7000-a":
    case "A7000plus":
    case "A7010a48":
    case "A7020a48":
    case "AquaPowerM":
    case "ASUS_X00AD_2":
    case "Aura_Note_2":
    case "BLACK-1X":
    case "BRAVIA_ATV2":
    case "BRAVIA_ATV3_4K":
    case "C1":
    case "ComioS1":
    case "CP8676_I02":
    case "CPH1609":
    case "CPY83_I00":
    case "cv1":
    case "cv3":
    case "deb":
    case "E5643":
    case "ELUGA_A3_Pro":
    case "ELUGA_Note":
    case "ELUGA_Prim":
    case "ELUGA_Ray_X":
    case "EverStar_S":
    case "F3111":
    case "F3113":
    case "F3116":
    case "F3211":
    case "F3213":
    case "F3215":
    case "F3311":
    case "flo":
    case "fugu":
    case "GiONEE_CBL7513":
    case "GiONEE_GBL7319":
    case "GIONEE_GBL7360":
    case "GIONEE_SWW1609":
    case "GIONEE_SWW1627":
    case "GIONEE_SWW1631":
    case "GIONEE_WBL5708":
    case "GIONEE_WBL7365":
    case "GIONEE_WBL7519":
    case "griffin":
    case "htc_e56ml_dtul":
    case "hwALE-H":
    case "HWBLN-H":
    case "HWCAM-H":
    case "HWVNS-H":
    case "HWWAS-H":
    case "i9031":
    case "iball8735_9806":
    case "Infinix-X572":
    case "iris60":
    case "itel_S41":
    case "j2xlteins":
    case "JGZ":
    case "K50a40":
    case "kate":
    case "le_x6":
    case "LS-5017":
    case "M5c":
    case "manning":
    case "marino_f":
    case "MEIZU_M5":
    case "mh":
    case "mido":
    case "MX6":
    case "namath":
    case "nicklaus_f":
    case "NX541J":
    case "NX573J":
    case "OnePlus5T":
    case "p212":
    case "P681":
    case "P85":
    case "panell_d":
    case "panell_dl":
    case "panell_ds":
    case "panell_dt":
    case "PB2-670M":
    case "PGN528":
    case "PGN610":
    case "PGN611":
    case "Phantom6":
    case "Pixi4-7_3G":
    case "Pixi5-10_4G":
    case "PLE":
    case "PRO7S":
    case "Q350":
    case "Q4260":
    case "Q427":
    case "Q4310":
    case "Q5":
    case "QM16XE_U":
    case "QX1":
    case "santoni":
    case "Slate_Pro":
    case "SVP-DTV15":
    case "s905x018":
    case "taido_row":
    case "TB3-730F":
    case "TB3-730X":
    case "TB3-850F":
    case "TB3-850M":
    case "tcl_eu":
    case "V1":
    case "V23GB":
    case "V5":
    case "vernee_M5":
    case "watson":
    case "whyred":
    case "woods_f":
    case "woods_fn":
    case "X3_HK":
    case "XE2X":
    case "XT1663":
    case "Z12_PRO":
    case "Z80":
        deviceNeedsSetOutputSurfaceWorkaround = true;
        break;
    default:
        // Do nothing.
        break;
}
```

## ExoPlayer\library\core\src\main\java\com\google\android\exoplayer2\video\MediaCodecVideoRenderer.java
### Line: 1459
```
switch(Util.MODEL) {
    case "AFTA":
    case "AFTN":
        deviceNeedsSetOutputSurfaceWorkaround = true;
        break;
    default:
        // Do nothing.
        break;
}
```

## ExoPlayer\library\ui\src\main\java\com\google\android\exoplayer2\ui\DebugTextViewHelper.java
### Line: 115
```
switch(player.getPlaybackState()) {
    case Player.STATE_BUFFERING:
        playbackStateString = "buffering";
        break;
    case Player.STATE_ENDED:
        playbackStateString = "ended";
        break;
    case Player.STATE_IDLE:
        playbackStateString = "idle";
        break;
    case Player.STATE_READY:
        playbackStateString = "ready";
        break;
    default:
        playbackStateString = "unknown";
        break;
}
```

## ExoPlayer\library\ui\src\main\java\com\google\android\exoplayer2\ui\spherical\ProjectionRenderer.java
### Line: 227
```
switch(subMesh.mode) {
    case Projection.DRAW_MODE_TRIANGLES_STRIP:
        drawMode = GLES20.GL_TRIANGLE_STRIP;
        break;
    case Projection.DRAW_MODE_TRIANGLES_FAN:
        drawMode = GLES20.GL_TRIANGLE_FAN;
        break;
    case Projection.DRAW_MODE_TRIANGLES:
    default:
        drawMode = GLES20.GL_TRIANGLES;
        break;
}
```

## fastjson\src\main\java\com\alibaba\fastjson\JSONReader.java
### Line: 126
```
switch(state) {
    case PropertyKey:
        newState = PropertyValue;
        break;
    case StartArray:
        newState = ArrayValue;
        break;
    case PropertyValue:
    case StartObject:
        newState = PropertyKey;
        break;
    default:
        break;
}
```

## fastjson\src\main\java\com\alibaba\fastjson\JSONReader.java
### Line: 261
```
switch(context.state) {
    case StartObject:
    case PropertyValue:
        object = parser.parseKey();
        break;
    default:
        object = parser.parse();
        break;
}
```

## fastjson\src\main\java\com\alibaba\fastjson\JSONWriter.java
### Line: 105
```
switch(context.state) {
    case PropertyKey:
        newState = PropertyValue;
        break;
    case StartArray:
        newState = ArrayValue;
        break;
    case ArrayValue:
        break;
    case StartObject:
        newState = PropertyKey;
        break;
    default:
        break;
}
```

## fastjson\src\main\java\com\alibaba\fastjson\JSONWriter.java
### Line: 155
```
switch(state) {
    case PropertyKey:
        newState = PropertyValue;
        break;
    case StartObject:
    case PropertyValue:
        newState = PropertyKey;
        break;
    case StartArray:
        newState = ArrayValue;
        break;
    case ArrayValue:
        break;
    default:
        break;
}
```

## FileDownloader\demo\src\main\java\com\liulishuo\filedownloader\demo\NotificationMinSetActivity.java
### Line: 128
```
switch(status) {
    case FileDownloadStatus.pending:
        desc += " pending";
        break;
    case FileDownloadStatus.started:
        desc += " started";
        break;
    case FileDownloadStatus.progress:
        desc += " progress";
        break;
    case FileDownloadStatus.retry:
        desc += " retry";
        break;
    case FileDownloadStatus.error:
        desc += " error";
        break;
    case FileDownloadStatus.paused:
        desc += " paused";
        break;
    case FileDownloadStatus.completed:
        desc += " completed";
        break;
    case FileDownloadStatus.warn:
        desc += " warn";
        break;
}
```

## FileDownloader\demo\src\main\java\com\liulishuo\filedownloader\demo\NotificationSampleActivity.java
### Line: 200
```
switch(status) {
    case FileDownloadStatus.pending:
        desc += " pending";
        break;
    case FileDownloadStatus.started:
        desc += " started";
        break;
    case FileDownloadStatus.progress:
        desc += " progress";
        break;
    case FileDownloadStatus.retry:
        desc += " retry";
        break;
    case FileDownloadStatus.error:
        desc += " error";
        break;
    case FileDownloadStatus.paused:
        desc += " paused";
        break;
    case FileDownloadStatus.completed:
        desc += " completed";
        break;
    case FileDownloadStatus.warn:
        desc += " warn";
        break;
}
```

## glide\library\src\main\java\com\bumptech\glide\load\resource\bitmap\TransformationUtils.java
### Line: 283
```
switch(exifOrientation) {
    case ExifInterface.ORIENTATION_TRANSPOSE:
    case ExifInterface.ORIENTATION_ROTATE_90:
        degreesToRotate = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
    case ExifInterface.ORIENTATION_FLIP_VERTICAL:
        degreesToRotate = 180;
        break;
    case ExifInterface.ORIENTATION_TRANSVERSE:
    case ExifInterface.ORIENTATION_ROTATE_270:
        degreesToRotate = 270;
        break;
    default:
        degreesToRotate = 0;
        break;
}
```

## glide\library\src\main\java\com\bumptech\glide\RequestBuilder.java
### Line: 694
```
// View's scale type.
switch(view.getScaleType()) {
    case CENTER_CROP:
        requestOptions = requestOptions.clone().optionalCenterCrop();
        break;
    case CENTER_INSIDE:
        requestOptions = requestOptions.clone().optionalCenterInside();
        break;
    case FIT_CENTER:
    case FIT_START:
    case FIT_END:
        requestOptions = requestOptions.clone().optionalFitCenter();
        break;
    case FIT_XY:
        requestOptions = requestOptions.clone().optionalCenterInside();
        break;
    case CENTER:
    case MATRIX:
    default:
}
```

## glide\library\src\main\java\com\bumptech\glide\util\Util.java
### Line: 106
```
switch(config) {
    case ALPHA_8:
        bytesPerPixel = 1;
        break;
    case RGB_565:
    case ARGB_4444:
        bytesPerPixel = 2;
        break;
    case RGBA_F16:
        bytesPerPixel = 8;
        break;
    case ARGB_8888:
    default:
        bytesPerPixel = 4;
        break;
}
```

## graal\compiler\src\jdk.tools.jaotc\src\jdk\tools\jaotc\amd64\AMD64InstructionDecoder.java
### Line: 441
```
switch(0xFF & code[ip]) {
    // pshufd r, r/a, #8
    case 0x70:
    // ps[rl|ra|ll]w r, #8
    case 0x71:
    // ps[rl|ra|ll]d r, #8
    case 0x72:
    // ps[rl|ra|ll]q r, #8
    case 0x73:
    // cmp[ps|pd|ss|sd] r, r, r/a, #8
    case 0xC2:
    // pinsrw r, r, r/a, #8
    case 0xC4:
    // pextrw r/a, r, #8
    case 0xC5:
    case // shufp[s|d] r, r, r/a, #8
    0xC6:
        // the imm8
        tailSize = 1;
        break;
    default:
        // no imm8
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.asm.amd64\src\org\graalvm\compiler\asm\amd64\AMD64Assembler.java
### Line: 734
```
switch(op) {
    case 0x0A:
    case 0x0B:
        nds = dst;
        break;
    default:
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.asm.amd64\src\org\graalvm\compiler\asm\amd64\AMD64Assembler.java
### Line: 756
```
switch(op) {
    case 0x0A:
    case 0x0B:
        nds = dst;
        break;
    default:
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.asm.sparc\src\org\graalvm\compiler\asm\sparc\SPARCAssembler.java
### Line: 1772
```
switch(constant.getJavaKind()) {
    case Double:
        bits = Double.doubleToRawLongBits(constant.asDouble());
        break;
    case Float:
        bits = Float.floatToRawIntBits(constant.asFloat());
        break;
    case Object:
        return constant.isNull();
    default:
        bits = constant.asLong();
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.asm.sparc\src\org\graalvm\compiler\asm\sparc\SPARCAssembler.java
### Line: 1519
```
switch(opcode) {
    case Sllx:
    case Srlx:
    case Srax:
        immediateSpec = BitSpec.shcnt64;
        break;
    case Sll:
    case Srl:
    case Sra:
        immediateSpec = BitSpec.shcnt32;
        break;
    default:
        immediateSpec = BitSpec.simm13;
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.asm.sparc\src\org\graalvm\compiler\asm\sparc\SPARCAssembler.java
### Line: 1541
```
switch(op3) {
    case Sllx:
    case Srlx:
    case Srax:
        tmp = BitSpec.x.setBits(tmp, 1);
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.hotspot\src\org\graalvm\compiler\hotspot\GraalHotSpotVMConfigBase.java
### Line: 112
```
switch(arch) {
    case "x86_64":
        arch = "amd64";
        break;
    case "sparcv9":
        arch = "sparc";
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.hotspot.test\src\org\graalvm\compiler\hotspot\test\HotSpotMethodSubstitutionTest.java
### Line: 197
```
switch(i) {
    case 1:
        c = GraalDirectives.opaque(Number.class);
        break;
    default:
        c = GraalDirectives.opaque(Integer.class);
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.hotspot.test\src\org\graalvm\compiler\hotspot\test\HotSpotMethodSubstitutionTest.java
### Line: 210
```
switch(i) {
    case 1:
        c = GraalDirectives.opaque(new Object());
        break;
    default:
        c = GraalDirectives.opaque("TEST");
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.jtt\src\org\graalvm\compiler\jtt\hotpath\HP_control02.java
### Line: 39
```
switch(i) {
    case 30:
        sum += 30;
        break;
    case 31:
        sum += 31;
        break;
    case 32:
        sum += 32;
        break;
    case 33:
        sum += 33;
        break;
    case 34:
        sum += 34;
        break;
    case 35:
        sum += 35;
        break;
    case 36:
        sum += 36;
        break;
    case 37:
        sum += 37;
        break;
    case 38:
        sum += 38;
        break;
    case 39:
        sum += 39;
        break;
    case 40:
        sum += 40;
        break;
    case 41:
        sum += 41;
        break;
    case 42:
        sum += 42;
        break;
    default:
        sum += 1;
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.jtt\src\org\graalvm\compiler\jtt\optimize\Switch02.java
### Line: 71
```
switch(result) {
    case 1:
        result = 321;
        break;
    default:
        result = 2391;
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.jtt\src\org\graalvm\compiler\jtt\optimize\Switch02.java
### Line: 124
```
switch(result) {
    case 1:
        result = 321;
        break;
    default:
        result = 2391;
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.jtt\src\org\graalvm\compiler\jtt\optimize\Switch02.java
### Line: 177
```
switch(result) {
    case 1:
        result = 321;
        break;
    default:
        result = 2391;
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.replacements\src\org\graalvm\compiler\replacements\BoxingSnippets.java
### Line: 159
```
switch(box.getBoxingKind()) {
    case Boolean:
        sourceConstant = JavaConstant.forBoolean(sourceConstant.asLong() != 0L);
        break;
    case Byte:
        sourceConstant = JavaConstant.forByte((byte) sourceConstant.asLong());
        break;
    case Char:
        sourceConstant = JavaConstant.forChar((char) sourceConstant.asLong());
        break;
    case Short:
        sourceConstant = JavaConstant.forShort((short) sourceConstant.asLong());
        break;
}
```

## graal\compiler\src\org.graalvm.compiler.replacements.amd64\src\org\graalvm\compiler\replacements\amd64\AMD64ConvertSnippets.java
### Line: 171
```
switch(convert.getFloatConvert()) {
    case F2I:
        key = f2i;
        break;
    case F2L:
        key = f2l;
        break;
    case D2I:
        key = d2i;
        break;
    case D2L:
        key = d2l;
        break;
    default:
        return;
}
```

## graal\regex\src\com.oracle.truffle.regex\src\com\oracle\truffle\regex\tregex\parser\flavors\PythonFlavorProcessor.java
### Line: 408
```
switch(mode) {
    case Str:
        position = inPattern.offsetByCodePoints(position, len);
        break;
    case Bytes:
        position += len;
        break;
}
```

## graal\regex\src\com.oracle.truffle.regex\src\com\oracle\truffle\regex\tregex\parser\RegexParser.java
### Line: 729
```
switch(poppedElem) {
    case LookAheadAssertion:
        curTermState = CurTermState.LookAheadAssertion;
        break;
    case LookBehindAssertion:
        curTermState = CurTermState.LookBehindAssertion;
        break;
    case Group:
        curTermState = CurTermState.Other;
        break;
}
```

## graal\substratevm\src\com.oracle.svm.core\src\com\oracle\svm\core\SubstrateUtil.java
### Line: 106
```
switch(arch) {
    case "x86_64":
        arch = "amd64";
        break;
    case "sparcv9":
        arch = "sparc";
        break;
}
```

## graal\substratevm\src\com.oracle.svm.hosted\src\com\oracle\svm\hosted\image\NativeBootImageViaCC.java
### Line: 193
```
switch(ObjectFile.getNativeFormat()) {
    case MACH_O:
        inv = new DarwinCCLinkerInvocation();
        break;
    case PECOFF:
        inv = new WindowsCCLinkerInvocation();
        break;
    case ELF:
    default:
        inv = new BinutilsCCLinkerInvocation();
        break;
}
```

## graal\substratevm\src\com.oracle.svm.hosted\src\com\oracle\svm\hosted\substitute\ComputedValueField.java
### Line: 189
```
switch(kind) {
    case FieldOffset:
        constantValue = asConstant(hMetaAccess.lookupJavaField(targetField).getLocation());
        break;
}
```

## graal\sulong\projects\com.oracle.truffle.llvm.parser\src\com\oracle\truffle\llvm\parser\metadata\debuginfo\DITypeExtractor.java
### Line: 127
```
switch(mdType.getEncoding()) {
    case DW_ATE_ADDRESS:
        kind = LLVMSourceBasicType.Kind.ADDRESS;
        break;
    case DW_ATE_BOOLEAN:
        kind = LLVMSourceBasicType.Kind.BOOLEAN;
        break;
    case DW_ATE_FLOAT:
        kind = LLVMSourceBasicType.Kind.FLOATING;
        break;
    case DW_ATE_SIGNED:
        kind = LLVMSourceBasicType.Kind.SIGNED;
        break;
    case DW_ATE_SIGNED_CHAR:
        kind = LLVMSourceBasicType.Kind.SIGNED_CHAR;
        break;
    case DW_ATE_UNSIGNED:
        kind = LLVMSourceBasicType.Kind.UNSIGNED;
        break;
    case DW_ATE_UNSIGNED_CHAR:
        kind = LLVMSourceBasicType.Kind.UNSIGNED_CHAR;
        break;
    default:
        kind = LLVMSourceBasicType.Kind.UNKNOWN;
        break;
}
```

## graal\sulong\projects\com.oracle.truffle.llvm.runtime\src\com\oracle\truffle\llvm\runtime\debug\value\LLVMDebugObject.java
### Line: 264
```
switch(((LLVMSourceBasicType) baseType).getKind()) {
    case UNSIGNED_CHAR:
        o = appendString(o, false);
        break;
    case SIGNED_CHAR:
        o = appendString(o, true);
        break;
}
```

## graal\sulong\projects\com.oracle.truffle.llvm.runtime\src\com\oracle\truffle\llvm\runtime\debug\value\LLVMDebugTypeConstants.java
### Line: 63
```
switch(size) {
    case BYTE_SIZE:
        typeName = BYTE_NAME;
        break;
    case SHORT_SIZE:
        typeName = SHORT_NAME;
        break;
    case LONG_SIZE:
        typeName = LONG_NAME;
        break;
    default:
        typeName = INTEGER_NAME;
        break;
}
```

## graal\tools\src\com.oracle.truffle.tools.profiler\src\com\oracle\truffle\tools\profiler\StackTraceEntry.java
### Line: 277
```
switch(state) {
    case STATE_UNKNOWN:
        s = "";
        break;
    case STATE_COMPILATION_ROOT:
        s = ", Interpreted";
        break;
    case STATE_COMPILED:
        s = ", Compiled";
        break;
    case STATE_INTERPRETED:
        s = ", Interpreted";
        break;
}
```

## graal\truffle\src\com.oracle.truffle.api\src\com\oracle\truffle\api\nodes\NodeUtil.java
### Line: 936
```
switch(node.getCost()) {
    case NONE:
        cost = "G";
        break;
    case MONOMORPHIC:
        cost = "M";
        break;
    case POLYMORPHIC:
        cost = "P";
        break;
    case MEGAMORPHIC:
        cost = "G";
        break;
    default:
        cost = "?";
        break;
}
```

## graal\truffle\src\com.oracle.truffle.dsl.processor\src\com\oracle\truffle\dsl\processor\java\model\CodeTreeBuilder.java
### Line: 133
```
switch(tree.getCodeKind()) {
    case COMMA_GROUP:
    case GROUP:
    case INDENT:
        currentElement = tree;
        break;
}
```

## greenDAO\DaoGenerator\src\org\greenrobot\greendao\generator\ToOne.java
### Line: 113
```
switch(propertyType) {
    case Byte:
    case Short:
    case Int:
    case Long:
    case Boolean:
    case Float:
        useEquals = true;
        break;
    default:
        useEquals = false;
        break;
}
```

## GSYVideoPlayer\app\src\main\java\com\example\gsyvideoplayer\DetailFilterActivity.java
### Line: 407
```
switch(type) {
    case 0:
        effect = new AutoFixEffect(deep);
        break;
    case 1:
        effect = new PixelationEffect();
        break;
    case 2:
        effect = new BlackAndWhiteEffect();
        break;
    case 3:
        effect = new ContrastEffect(deep);
        break;
    case 4:
        effect = new CrossProcessEffect();
        break;
    case 5:
        effect = new DocumentaryEffect();
        break;
    case 6:
        effect = new DuotoneEffect(Color.BLUE, Color.YELLOW);
        break;
    case 7:
        effect = new FillLightEffect(deep);
        break;
    case 8:
        effect = new GammaEffect(deep);
        break;
    case 9:
        effect = new GrainEffect(deep);
        break;
    case 10:
        effect = new GrainEffect(deep);
        break;
    case 11:
        effect = new HueEffect(deep);
        break;
    case 12:
        effect = new InvertColorsEffect();
        break;
    case 13:
        effect = new LamoishEffect();
        break;
    case 14:
        effect = new PosterizeEffect();
        break;
    case 15:
        effect = new BarrelBlurEffect();
        break;
    case 16:
        effect = new SaturationEffect(deep);
        break;
    case 17:
        effect = new SepiaEffect();
        break;
    case 18:
        effect = new SharpnessEffect(deep);
        break;
    case 19:
        effect = new TemperatureEffect(deep);
        break;
    case 20:
        effect = new TintEffect(Color.GREEN);
        break;
    case 21:
        effect = new VignetteEffect(deep);
        break;
    case 22:
        effect = new NoEffect();
        break;
    case 23:
        effect = new OverlayEffect();
        break;
    case 24:
        effect = new SampleBlurEffect(4.0f);
        break;
    case 25:
        effect = new GaussianBlurEffect(6.0f, GaussianBlurEffect.TYPEXY);
        break;
    case 26:
        effect = new BrightnessEffect(deep);
        break;
}
```

## GSYVideoPlayer\gsyVideoPlayer-java\src\main\java\com\shuyu\gsyvideoplayer\render\effect\GaussianBlurEffect.java
### Line: 28
```
switch(blurType) {
    case TYPEX:
        blurTypeString = "vec2(1.0,0.0)";
        break;
    case TYPEY:
        blurTypeString = "vec2(0.0,1.0)";
        break;
    case TYPEXY:
        blurTypeString = "vec2(1.0,1.0)";
        break;
}
```

## hadoop\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\crypto\key\kms\ValueQueue.java
### Line: 366
```
switch(policy) {
    case ATLEAST_ONE:
        numToFill = (ekvs.size() < 1) ? 1 : 0;
        break;
    case LOW_WATERMARK:
        numToFill = Math.min(num, (int) (lowWatermark * numValues)) - ekvs.size();
        break;
    case ALL:
        numToFill = num - ekvs.size();
        break;
}
```

## hadoop\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\fs\FileSystem.java
### Line: 4024
```
switch(distance) {
    case 0:
        bytesRead = getData().getBytesReadLocalHost();
        break;
    case 1:
    case 2:
        bytesRead = getData().getBytesReadDistanceOfOneOrTwo();
        break;
    case 3:
    case 4:
        bytesRead = getData().getBytesReadDistanceOfThreeOrFour();
        break;
    default:
        bytesRead = getData().getBytesReadDistanceOfFiveOrLarger();
        break;
}
```

## hadoop\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\fs\shell\Test.java
### Line: 80
```
switch(flag) {
    case 'e':
        test = true;
        break;
    case 'd':
        test = item.stat.isDirectory();
        break;
    case 'f':
        test = item.stat.isFile();
        break;
    case 's':
        test = (item.stat.getLen() > 0);
        break;
    case 'z':
        test = (item.stat.getLen() == 0);
        break;
    case 'w':
        test = testAccess(item, FsAction.WRITE);
        break;
    case 'r':
        test = testAccess(item, FsAction.READ);
        break;
    default:
        break;
}
```

## hadoop\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\ha\protocolPB\HAServiceProtocolServerSideTranslatorPB.java
### Line: 154
```
switch(s.getState()) {
    case ACTIVE:
        retState = HAServiceStateProto.ACTIVE;
        break;
    case STANDBY:
        retState = HAServiceStateProto.STANDBY;
        break;
    case OBSERVER:
        retState = HAServiceStateProto.OBSERVER;
        break;
    case INITIALIZING:
    default:
        retState = HAServiceStateProto.INITIALIZING;
        break;
}
```

## hadoop\hadoop-common-project\hadoop-common\src\main\java\org\apache\hadoop\util\ComparableVersion.java
### Line: 185
```
// a1 = alpha-1, b1 = beta-1, m1 = milestone-1
switch(value.charAt(0)) {
    case 'a':
        value = "alpha";
        break;
    case 'b':
        value = "beta";
        break;
    case 'm':
        value = "milestone";
        break;
    default:
        break;
}
```

## hadoop\hadoop-hdds\common\src\main\java\org\apache\hadoop\hdds\security\x509\certificate\authority\DefaultCAServer.java
### Line: 381
```
switch(status) {
    case SUCCESS:
        consumer = (arg) -> LOG.info("CertificateServer validation is " + "successful");
        break;
    case MISSING_KEYS:
        consumer = (arg) -> {
            LOG.error("We have found the Certificate for this CertificateServer, " + "but keys used by this CertificateServer is missing. This is a " + "non-recoverable error. Please restart the system after locating " + "the Keys used by the CertificateServer.");
            LOG.error("Exiting due to unrecoverable CertificateServer error.");
            throw new IllegalStateException("Missing Keys, cannot continue.");
        };
        break;
    case MISSING_CERTIFICATE:
        consumer = (arg) -> {
            LOG.error("We found the keys, but the root certificate for this " + "CertificateServer is missing. Please restart SCM after locating " + "the " + "Certificates.");
            LOG.error("Exiting due to unrecoverable CertificateServer error.");
            throw new IllegalStateException("Missing Root Certs, cannot continue.");
        };
        break;
    case INITIALIZE:
        consumer = (arg) -> {
            try {
                generateSelfSignedCA(arg);
            } catch (NoSuchProviderException | NoSuchAlgorithmException | IOException e) {
                LOG.error("Unable to initialize CertificateServer.", e);
            }
            VerificationStatus newStatus = verifySelfSignedCA(arg);
            if (newStatus != VerificationStatus.SUCCESS) {
                LOG.error("Unable to initialize CertificateServer, failed in " + "verification.");
            }
        };
        break;
    default:
        /* Make CheckStyle happy */
        break;
}
```

## hadoop\hadoop-hdfs-project\hadoop-hdfs\src\main\java\org\apache\hadoop\hdfs\protocolPB\ClientNamenodeProtocolServerSideTranslatorPB.java
### Line: 1933
```
switch(state) {
    case ACTIVE:
        retState = HAServiceProtocolProtos.HAServiceStateProto.ACTIVE;
        break;
    case STANDBY:
        retState = HAServiceProtocolProtos.HAServiceStateProto.STANDBY;
        break;
    case OBSERVER:
        retState = HAServiceProtocolProtos.HAServiceStateProto.OBSERVER;
        break;
    case INITIALIZING:
    default:
        retState = HAServiceProtocolProtos.HAServiceStateProto.INITIALIZING;
        break;
}
```

## hadoop\hadoop-hdfs-project\hadoop-hdfs\src\main\java\org\apache\hadoop\hdfs\protocolPB\PBHelper.java
### Line: 741
```
switch(proto.getStatus()) {
    case RECEIVING:
        status = BlockStatus.RECEIVING_BLOCK;
        break;
    case RECEIVED:
        status = BlockStatus.RECEIVED_BLOCK;
        break;
    case DELETED:
        status = BlockStatus.DELETED_BLOCK;
        break;
}
```

## hadoop\hadoop-hdfs-project\hadoop-hdfs\src\main\java\org\apache\hadoop\hdfs\server\diskbalancer\command\HelpCommand.java
### Line: 67
```
switch(helpCommand) {
    case DiskBalancerCLI.PLAN:
        command = new PlanCommand(getConf());
        break;
    case DiskBalancerCLI.EXECUTE:
        command = new ExecuteCommand(getConf());
        break;
    case DiskBalancerCLI.QUERY:
        command = new QueryCommand(getConf());
        break;
    case DiskBalancerCLI.CANCEL:
        command = new CancelCommand(getConf());
        break;
    case DiskBalancerCLI.REPORT:
        command = new ReportCommand(getConf());
        break;
    default:
        command = this;
        break;
}
```

## hadoop\hadoop-hdfs-project\hadoop-hdfs\src\main\java\org\apache\hadoop\hdfs\server\namenode\FSDirectory.java
### Line: 1831
```
switch(dirOp) {
    case READ_LINK:
    case WRITE_LINK:
    case CREATE_LINK:
        resolveLink = false;
        break;
    default:
        resolveLink = true;
        break;
}
```

## hadoop\hadoop-hdfs-project\hadoop-hdfs\src\test\java\org\apache\hadoop\hdfs\server\namenode\snapshot\TestRandomOpsWithSnapshots.java
### Line: 157
```
switch(type) {
    case FileSystem:
        randomNum = generator.nextInt(TOTAL_WEIGHT_FILESYSTEM);
        break;
    case Snapshot:
        randomNum = generator.nextInt(TOTAL_WEIGHT_SNAPSHOT);
        break;
    default:
        break;
}
```

## hadoop\hadoop-mapreduce-project\hadoop-mapreduce-client\hadoop-mapreduce-client-jobclient\src\test\java\org\apache\hadoop\fs\slive\OperationFactory.java
### Line: 56
```
switch(type) {
    case READ:
        op = new ReadOp(this.config, rnd);
        break;
    case LS:
        op = new ListOp(this.config, rnd);
        break;
    case MKDIR:
        op = new MkdirOp(this.config, rnd);
        break;
    case APPEND:
        op = new AppendOp(this.config, rnd);
        break;
    case RENAME:
        op = new RenameOp(this.config, rnd);
        break;
    case DELETE:
        op = new DeleteOp(this.config, rnd);
        break;
    case CREATE:
        op = new CreateOp(this.config, rnd);
        break;
    case TRUNCATE:
        op = new TruncateOp(this.config, rnd);
        break;
}
```

## hadoop\hadoop-mapreduce-project\hadoop-mapreduce-client\hadoop-mapreduce-client-jobclient\src\test\java\org\apache\hadoop\fs\slive\PathFinder.java
### Line: 69
```
switch(type) {
    case FILE:
        name = FILE_PREFIX + new Integer(curId % limitPerDir).toString();
        break;
    case DIRECTORY:
        name = DIR_PREFIX + new Integer(curId % limitPerDir).toString();
        break;
}
```

## hadoop\hadoop-mapreduce-project\hadoop-mapreduce-client\hadoop-mapreduce-client-jobclient\src\test\java\org\apache\hadoop\fs\TestDFSIO.java
### Line: 712
```
switch(testType) {
    case TEST_TYPE_READ:
        ioer = new ReadMapper();
        break;
    case TEST_TYPE_WRITE:
        ioer = new WriteMapper();
        break;
    case TEST_TYPE_APPEND:
        ioer = new AppendMapper();
        break;
    case TEST_TYPE_READ_RANDOM:
    case TEST_TYPE_READ_BACKWARD:
    case TEST_TYPE_READ_SKIP:
        ioer = new RandomReadMapper();
        break;
    case TEST_TYPE_TRUNCATE:
        ioer = new TruncateMapper();
        break;
    default:
        return;
}
```

## hadoop\hadoop-mapreduce-project\hadoop-mapreduce-client\hadoop-mapreduce-client-jobclient\src\test\java\org\apache\hadoop\mapreduce\TestValueIterReset.java
### Line: 102
```
switch(key.get()) {
    case 0:
        errors += test0(key, mitr);
        break;
    case 1:
        errors += test1(key, mitr);
        break;
    case 2:
        errors += test2(key, mitr);
        break;
    case 3:
        errors += test3(key, mitr);
        break;
    default:
        break;
}
```

## hadoop\hadoop-mapreduce-project\hadoop-mapreduce-examples\src\main\java\org\apache\hadoop\examples\terasort\TeraGen.java
### Line: 262
```
switch(tail) {
    case 't':
        base *= 1000 * 1000 * 1000 * 1000;
        break;
    case 'b':
        base *= 1000 * 1000 * 1000;
        break;
    case 'm':
        base *= 1000 * 1000;
        break;
    case 'k':
        base *= 1000;
        break;
    default:
}
```

## hadoop\hadoop-ozone\ozone-manager\src\main\java\org\apache\hadoop\ozone\om\ratis\OzoneManagerStateMachine.java
### Line: 191
```
switch(omRequest.getCmdType()) {
    case CreateVolume:
    case SetVolumeProperty:
    case DeleteVolume:
    case CreateBucket:
    case SetBucketProperty:
    case DeleteBucket:
        newOmRequest = handler.handleStartTransaction(omRequest);
        break;
    case AllocateBlock:
        return handleAllocateBlock(raftClientRequest, omRequest);
    case CreateKey:
        return handleCreateKeyRequest(raftClientRequest, omRequest);
    case InitiateMultiPartUpload:
        return handleInitiateMultipartUpload(raftClientRequest, omRequest);
    default:
        return TransactionContext.newBuilder().setClientRequest(raftClientRequest).setStateMachine(this).setServerRole(RaftProtos.RaftPeerRole.LEADER).setLogData(raftClientRequest.getMessage().getContent()).build();
}
```

## hadoop\hadoop-tools\hadoop-azure\src\main\java\org\apache\hadoop\fs\azure\BlobOperationDescriptor.java
### Line: 146
```
switch(compValue) {
    case "list":
        operationType = OperationType.ListBlobs;
        break;
    case "metadata":
        operationType = OperationType.GetMetadata;
        break;
    case "blocklist":
        operationType = OperationType.GetBlockList;
        break;
    case "pagelist":
        operationType = OperationType.GetPageList;
        break;
    default:
        break;
}
```

## hadoop\hadoop-tools\hadoop-azure\src\main\java\org\apache\hadoop\fs\azure\SecureWasbRemoteCallHelper.java
### Line: 153
```
switch(httpMethod) {
    case HttpPut.METHOD_NAME:
        httpUriRequest = new HttpPut(uriBuilder.build());
        break;
    case HttpPost.METHOD_NAME:
        httpUriRequest = new HttpPost(uriBuilder.build());
        break;
    default:
        httpUriRequest = new HttpGet(uriBuilder.build());
        break;
}
```

## hadoop\hadoop-tools\hadoop-azure\src\main\java\org\apache\hadoop\fs\azure\WasbRemoteCallHelper.java
### Line: 244
```
switch(httpMethod) {
    case HttpPut.METHOD_NAME:
        httpUriRequest = new HttpPut(uriBuilder.build());
        break;
    case HttpPost.METHOD_NAME:
        httpUriRequest = new HttpPost(uriBuilder.build());
        break;
    default:
        httpUriRequest = new HttpGet(uriBuilder.build());
        break;
}
```

## hadoop\hadoop-tools\hadoop-azure\src\test\java\org\apache\hadoop\fs\azure\TestBlobOperationDescriptor.java
### Line: 236
```
switch(operationType) {
    case AppendBlock:
    case PutBlock:
    case PutPage:
        lastContentLengthReceived = BlobOperationDescriptor.getContentLengthIfKnown(conn, operationType);
        break;
    case GetBlob:
        lastContentLengthReceived = BlobOperationDescriptor.getContentLengthIfKnown(conn, operationType);
        break;
    default:
        lastContentLengthReceived = 0;
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-applications\hadoop-yarn-services\hadoop-yarn-services-core\src\main\java\org\apache\hadoop\yarn\service\component\Component.java
### Line: 812
```
switch(yarnServiceConstraint.getType()) {
    case AFFINITY:
        constraint = PlacementConstraints.targetIn(yarnServiceConstraint.getScope().getValue(), targetExpressions.toArray(new TargetExpression[0])).build();
        break;
    case ANTI_AFFINITY:
        constraint = PlacementConstraints.targetNotIn(yarnServiceConstraint.getScope().getValue(), targetExpressions.toArray(new TargetExpression[0])).build();
        break;
    case AFFINITY_WITH_CARDINALITY:
        constraint = PlacementConstraints.targetCardinality(yarnServiceConstraint.getScope().name().toLowerCase(), yarnServiceConstraint.getMinCardinality() == null ? 0 : yarnServiceConstraint.getMinCardinality().intValue(), yarnServiceConstraint.getMaxCardinality() == null ? Integer.MAX_VALUE : yarnServiceConstraint.getMaxCardinality().intValue(), targetExpressions.toArray(new TargetExpression[0])).build();
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-common\src\main\java\org\apache\hadoop\yarn\server\webapp\ContainerBlock.java
### Line: 161
```
switch(resourceName) {
    case ResourceInformation.MEMORY_URI:
        translatedResourceName = "Memory";
        break;
    case ResourceInformation.VCORES_URI:
        translatedResourceName = "VCores";
        break;
    default:
        translatedResourceName = resourceName;
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-nodemanager\src\main\java\org\apache\hadoop\yarn\server\nodemanager\containermanager\launcher\ContainerLaunch.java
### Line: 882
```
switch(command) {
    case OUTPUT_THREAD_DUMP:
        // TODO for windows support.
        signal = Shell.WINDOWS ? Signal.NULL : Signal.QUIT;
        break;
    case GRACEFUL_SHUTDOWN:
        signal = Signal.TERM;
        break;
    case FORCEFUL_SHUTDOWN:
        signal = Signal.KILL;
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\rmapp\attempt\RMAppAttemptImpl.java
### Line: 668
```
switch(stateToBeStored) {
    case KILLED:
    case FAILED:
        proxiedTrackingUrl = originalTrackingUrl;
        break;
    default:
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\rmapp\attempt\RMAppAttemptImpl.java
### Line: 683
```
switch(stateToBeStored) {
    case KILLED:
    case FAILED:
        proxiedTrackingUrl = originalTrackingUrl;
        break;
    default:
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-resourcemanager\src\main\java\org\apache\hadoop\yarn\server\resourcemanager\scheduler\constraint\PlacementConstraintsUtil.java
### Line: 201
```
switch(opCode) {
    case EQ:
        retCode = requestAttribute.getAttributeValue().equals(nodeAttribute.getAttributeValue());
        break;
    case NE:
        retCode = !(requestAttribute.getAttributeValue().equals(nodeAttribute.getAttributeValue()));
        break;
    default:
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-router\src\main\java\org\apache\hadoop\yarn\server\router\webapp\RouterWebServiceUtil.java
### Line: 195
```
switch(method) {
    case DELETE:
        response = builder.delete(ClientResponse.class);
        break;
    case GET:
        response = builder.get(ClientResponse.class);
        break;
    case POST:
        response = builder.post(ClientResponse.class);
        break;
    case PUT:
        response = builder.put(ClientResponse.class);
        break;
    default:
        break;
}
```

## hadoop\hadoop-yarn-project\hadoop-yarn\hadoop-yarn-server\hadoop-yarn-server-router\src\test\java\org\apache\hadoop\yarn\server\router\webapp\TestRouterWebServicesREST.java
### Line: 310
```
switch(method) {
    case DELETE:
        response = builder.delete(ClientResponse.class);
        break;
    case POST:
        response = builder.post(ClientResponse.class);
        break;
    case PUT:
        response = builder.put(ClientResponse.class);
        break;
    default:
        break;
}
```

## HanLP\src\main\java\com\hankcs\hanlp\collection\MDAG\MDAG.java
### Line: 142
```
switch(this) {
    case PREFIX_SEARCH_CONDITION:
        satisfiesSearchCondition = (str1.startsWith(str2));
        break;
    case SUBSTRING_SEARCH_CONDITION:
        satisfiesSearchCondition = (str1.contains(str2));
        break;
    case SUFFIX_SEARCH_CONDITION:
        satisfiesSearchCondition = (str1.endsWith(str2));
        break;
    default:
        satisfiesSearchCondition = true;
        break;
}
```

## HanLP\src\main\java\com\hankcs\hanlp\corpus\synonym\Synonym.java
### Line: 89
```
switch(idString.charAt(idString.length() - 1)) {
    case '=':
        type = Type.EQUAL;
        break;
    case '#':
        type = Type.LIKE;
        break;
    default:
        type = Type.SINGLE;
        break;
}
```

## HanLP\src\main\java\com\hankcs\hanlp\model\crf\LogLinearModel.java
### Line: 133
```
switch(tagSet.type) {
    case CWS:
        tagSet = new CWSTagSet(tagSet.idOf("B"), tagSet.idOf("M"), tagSet.idOf("E"), tagSet.idOf("S"));
        break;
    case NER:
        tagSet = new NERTagSet(tagSet.idOf("O"), tagSet.tags());
        break;
}
```

## HanLP\src\main\java\com\hankcs\hanlp\model\perceptron\feature\FeatureMap.java
### Line: 100
```
switch(type) {
    case CWS:
        tagSet = new CWSTagSet();
        break;
    case POS:
        tagSet = new POSTagSet();
        break;
    case NER:
        tagSet = new NERTagSet();
        break;
    case CLASSIFICATION:
        tagSet = new TagSet(TaskType.CLASSIFICATION);
        break;
}
```

## HanLP\src\main\java\com\hankcs\hanlp\model\perceptron\Main.java
### Line: 82
```
switch(option.task) {
    case CWS:
        trainer = new CWSTrainer();
        break;
    case POS:
        trainer = new POSTrainer();
        break;
    case NER:
        trainer = new NERTrainer();
        break;
}
```

## incubator-dubbo\dubbo-configcenter\dubbo-configcenter-zookeeper\src\main\java\org\apache\dubbo\configcenter\support\zookeeper\CacheListener.java
### Line: 74
```
switch(type) {
    case NODE_ADDED:
        changeType = ConfigChangeType.ADDED;
        break;
    case NODE_REMOVED:
        changeType = ConfigChangeType.DELETED;
        break;
    case NODE_UPDATED:
        changeType = ConfigChangeType.MODIFIED;
        break;
    default:
        return;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\enums\TestSwitchOverEnum2.java
### Line: 24
```
switch(c) {
    case ONE:
        result = 1;
        break;
    case TWO:
        result = 2;
        break;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\enums\TestSwitchOverEnum2.java
### Line: 32
```
switch(a) {
    case CAT:
        result += 10;
        break;
    case DOG:
        result += 20;
        break;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\switches\TestSwitch3.java
### Line: 18
```
switch(a) {
    case 1:
        i = 1;
        return;
    case 2:
    case 3:
        i = 2;
        return;
    default:
        i = 4;
        break;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\switches\TestSwitchBreak.java
### Line: 20
```
switch(a % 4) {
    case 1:
        s += "1";
        break;
    case 3:
    case 4:
        s += "4";
        break;
    case 5:
        s += "+";
        break loop;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\switches\TestSwitchNoDefault.java
### Line: 15
```
switch(a) {
    case 1:
        s = "1";
        break;
    case 2:
        s = "2";
        break;
    case 3:
        s = "3";
        break;
    case 4:
        s = "4";
        break;
}
```

## jadx\jadx-core\src\test\java\jadx\tests\integration\switches\TestSwitchReturnFromCase.java
### Line: 21
```
switch(a % 4) {
    case 1:
        s = "1";
        break;
    case 2:
        s = "2";
        break;
    case 3:
    case 4:
        s = "4";
        break;
    case 5:
        return;
}
```

## jadx\jadx-samples\src\main\java\jadx\samples\TestEnum.java
### Line: 118
```
switch(color) {
    case NORTH:
        d = "N";
        break;
    case SOUTH:
        d = "S";
        break;
    default:
        d = "<>";
        break;
}
```

## jenkins\core\src\main\java\hudson\model\RunParameterDefinition.java
### Line: 178
```
// use getFilter() so we dont have to worry about null filter value.
switch(getFilter()) {
    case COMPLETED:
        lastBuild = project.getLastCompletedBuild();
        break;
    case SUCCESSFUL:
        lastBuild = project.getLastSuccessfulBuild();
        break;
    case STABLE:
        lastBuild = project.getLastStableBuild();
        break;
    default:
        lastBuild = project.getLastBuild();
        break;
}
```

## jenkins\core\src\main\java\hudson\util\LineEndingConversion.java
### Line: 42
```
switch(type) {
    case CR:
    case Mac:
        // Convert line endings to CR
        input = input.replace("\n", "\r");
        break;
    case CRLF:
    case Windows:
        // Convert line endings to Windows CR/LF
        input = input.replace("\n", "\r\n");
        break;
    default:
    case LF:
    case Unix:
        // Conversion already completed
        return input;
    case LFCR:
        // Convert line endings to LF/CR
        input = input.replace("\n", "\n\r");
        break;
}
```

## kafka\clients\src\main\java\org\apache\kafka\common\requests\DescribeConfigsResponse.java
### Line: 257
```
switch(resourceType) {
    case BROKER:
        configSource = ConfigSource.STATIC_BROKER_CONFIG;
        break;
    case TOPIC:
        configSource = ConfigSource.TOPIC_CONFIG;
        break;
    default:
        configSource = ConfigSource.UNKNOWN_CONFIG;
        break;
}
```

## kafka\clients\src\main\java\org\apache\kafka\common\security\oauthbearer\internals\unsecured\OAuthBearerUnsecuredLoginCallbackHandler.java
### Line: 281
```
switch(unescapedDelimiterChar) {
    case "\\":
    case ".":
    case "[":
    case "(":
    case "{":
    case "|":
    case "^":
    case "$":
        delimiter = "\\" + unescapedDelimiterChar;
        break;
    default:
        delimiter = unescapedDelimiterChar;
        break;
}
```

## kafka\connect\runtime\src\main\java\org\apache\kafka\connect\runtime\StateTracker.java
### Line: 151
```
switch(ratioState) {
    case UNASSIGNED:
        durationDesired += unassignedTotalTimeMs;
        break;
    case RUNNING:
        durationDesired += runningTotalTimeMs;
        break;
    case PAUSED:
        durationDesired += pausedTotalTimeMs;
        break;
    case FAILED:
        durationDesired += failedTotalTimeMs;
        break;
    case DESTROYED:
        durationDesired += destroyedTotalTimeMs;
        break;
}
```

## kafka\tools\src\main\java\org\apache\kafka\trogdor\workload\ConnectionStressWorker.java
### Line: 140
```
switch(spec.action()) {
    case CONNECT:
        success = attemptConnection(conf, updater);
        break;
    case FETCH_METADATA:
        success = attemptMetadataFetch(props);
        break;
}
```

## lottie-android\lottie\src\main\java\com\airbnb\lottie\model\layer\CompositionLayer.java
### Line: 62
```
switch(lm.getMatteType()) {
    case ADD:
    case INVERT:
        mattedLayer = layer;
        break;
}
```

## lottie-react-native\src\android\src\main\java\com\airbnb\android\react\lottie\LottieAnimationViewManager.java
### Line: 174
```
switch(name) {
    case "none":
        strategy = LottieAnimationView.CacheStrategy.None;
        break;
    case "weak":
        strategy = LottieAnimationView.CacheStrategy.Weak;
        break;
    case "strong":
        strategy = LottieAnimationView.CacheStrategy.Strong;
        break;
}
```

## Luban\example\src\main\java\top\zibin\luban\example\PathUtils.java
### Line: 167
```
switch(type) {
    case "image":
        contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        break;
    case "video":
        contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        break;
    case "audio":
        contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        break;
}
```

## MPAndroidChart\MPChartExample\src\main\java\com\xxmassdeveloper\mpchartexample\custom\DayAxisValueFormatter.java
### Line: 42
```
switch(dayOfMonth) {
    case 1:
        appendix = "st";
        break;
    case 2:
        appendix = "nd";
        break;
    case 3:
        appendix = "rd";
        break;
    case 21:
        appendix = "st";
        break;
    case 22:
        appendix = "nd";
        break;
    case 23:
        appendix = "rd";
        break;
    case 31:
        appendix = "st";
        break;
}
```

## MPAndroidChart\MPChartExample\src\main\java\com\xxmassdeveloper\mpchartexample\fragments\SimpleChartDemo.java
### Line: 67
```
switch(pos) {
    case 0:
        f = SineCosineFragment.newInstance();
        break;
    case 1:
        f = ComplexityFragment.newInstance();
        break;
    case 2:
        f = BarChartFrag.newInstance();
        break;
    case 3:
        f = ScatterChartFrag.newInstance();
        break;
    case 4:
        f = PieChartFrag.newInstance();
        break;
}
```

## MPAndroidChart\MPChartExample\src\main\java\com\xxmassdeveloper\mpchartexample\notimportant\MainActivity.java
### Line: 138
```
switch(pos) {
    case 1:
        i = new Intent(this, LineChartActivity1.class);
        break;
    case 2:
        i = new Intent(this, MultiLineChartActivity.class);
        break;
    case 3:
        i = new Intent(this, LineChartActivity2.class);
        break;
    case 4:
        i = new Intent(this, InvertedLineChartActivity.class);
        break;
    case 5:
        i = new Intent(this, CubicLineChartActivity.class);
        break;
    case 6:
        i = new Intent(this, LineChartActivityColored.class);
        break;
    case 7:
        i = new Intent(this, PerformanceLineChart.class);
        break;
    case 8:
        i = new Intent(this, FilledLineActivity.class);
        break;
    case 10:
        i = new Intent(this, BarChartActivity.class);
        break;
    case 11:
        i = new Intent(this, AnotherBarActivity.class);
        break;
    case 12:
        i = new Intent(this, BarChartActivityMultiDataset.class);
        break;
    case 13:
        i = new Intent(this, HorizontalBarChartActivity.class);
        break;
    case 14:
        i = new Intent(this, StackedBarActivity.class);
        break;
    case 15:
        i = new Intent(this, BarChartPositiveNegative.class);
        break;
    case 16:
        i = new Intent(this, StackedBarActivityNegative.class);
        break;
    case 17:
        i = new Intent(this, BarChartActivitySinus.class);
        break;
    case 19:
        i = new Intent(this, PieChartActivity.class);
        break;
    case 20:
        i = new Intent(this, PiePolylineChartActivity.class);
        break;
    case 21:
        i = new Intent(this, HalfPieChartActivity.class);
        break;
    case 23:
        i = new Intent(this, CombinedChartActivity.class);
        break;
    case 24:
        i = new Intent(this, ScatterChartActivity.class);
        break;
    case 25:
        i = new Intent(this, BubbleChartActivity.class);
        break;
    case 26:
        i = new Intent(this, CandleStickChartActivity.class);
        break;
    case 27:
        i = new Intent(this, RadarChartActivity.class);
        break;
    case 29:
        i = new Intent(this, ListViewMultiChartActivity.class);
        break;
    case 30:
        i = new Intent(this, SimpleChartDemo.class);
        break;
    case 31:
        i = new Intent(this, ScrollViewActivity.class);
        break;
    case 32:
        i = new Intent(this, ListViewBarChartActivity.class);
        break;
    case 34:
        i = new Intent(this, DynamicalAddingActivity.class);
        break;
    case 35:
        i = new Intent(this, RealtimeLineChartActivity.class);
        break;
    case 36:
        i = new Intent(this, LineChartTime.class);
        break;
}
```

## MPAndroidChart\MPChartLib\src\main\java\com\github\mikephil\charting\charts\BarLineChartBase.java
### Line: 1596
```
switch(which) {
    case PAINT_GRID_BACKGROUND:
        mGridBackgroundPaint = p;
        break;
}
```

## MPAndroidChart\MPChartLib\src\main\java\com\github\mikephil\charting\renderer\LegendRenderer.java
### Line: 318
```
switch(verticalAlignment) {
    case TOP:
        posY = yoffset;
        break;
    case BOTTOM:
        posY = mViewPortHandler.getChartHeight() - yoffset - mLegend.mNeededHeight;
        break;
    case CENTER:
        posY = (mViewPortHandler.getChartHeight() - mLegend.mNeededHeight) / 2.f + yoffset;
        break;
}
```

## netty\codec\src\main\java\io\netty\handler\codec\base64\Base64.java
### Line: 169
```
switch(numSigBytes) {
    case 1:
        inBuff = toInt(src.getByte(srcOffset));
        break;
    case 2:
        inBuff = toIntBE(src.getShort(srcOffset));
        break;
    default:
        inBuff = numSigBytes <= 0 ? 0 : toIntBE(src.getMedium(srcOffset));
        break;
}
```

## netty\codec\src\main\java\io\netty\handler\codec\base64\Base64.java
### Line: 183
```
switch(numSigBytes) {
    case 1:
        inBuff = toInt(src.getByte(srcOffset));
        break;
    case 2:
        inBuff = toIntLE(src.getShort(srcOffset));
        break;
    default:
        inBuff = numSigBytes <= 0 ? 0 : toIntLE(src.getMedium(srcOffset));
        break;
}
```

## netty\codec\src\main\java\io\netty\handler\codec\compression\JdkZlibEncoder.java
### Line: 248
```
switch(wrapper) {
    case GZIP:
        sizeEstimate += gzipHeader.length;
        break;
    case ZLIB:
        // first two magic bytes
        sizeEstimate += 2;
        break;
    default:
}
```

## netty\codec\src\main\java\io\netty\handler\codec\compression\Snappy.java
### Line: 295
```
switch(tag & 0x03) {
    case LITERAL:
        state = State.READING_LITERAL;
        break;
    case COPY_1_BYTE_OFFSET:
    case COPY_2_BYTE_OFFSET:
    case COPY_4_BYTE_OFFSET:
        state = State.READING_COPY;
        break;
}
```

## netty\codec-dns\src\main\java\io\netty\handler\codec\dns\DnsMessageUtil.java
### Line: 42
```
switch(dnsClass &= 0xFFFF) {
    case DnsRecord.CLASS_IN:
        name = "IN";
        break;
    case DnsRecord.CLASS_CSNET:
        name = "CSNET";
        break;
    case DnsRecord.CLASS_CHAOS:
        name = "CHAOS";
        break;
    case DnsRecord.CLASS_HESIOD:
        name = "HESIOD";
        break;
    case DnsRecord.CLASS_NONE:
        name = "NONE";
        break;
    case DnsRecord.CLASS_ANY:
        name = "ANY";
        break;
    default:
        name = null;
        break;
}
```

## netty\codec-http2\src\main\java\io\netty\handler\codec\http2\DefaultHttp2ConnectionDecoder.java
### Line: 208
```
switch(stream.state()) {
    case OPEN:
    case HALF_CLOSED_LOCAL:
        break;
    case HALF_CLOSED_REMOTE:
    case CLOSED:
        error = streamError(stream.id(), STREAM_CLOSED, "Stream %d in unexpected state: %s", stream.id(), stream.state());
        break;
    default:
        error = streamError(stream.id(), PROTOCOL_ERROR, "Stream %d in unexpected state: %s", stream.id(), stream.state());
        break;
}
```

## netty\common\src\main\java\io\netty\util\internal\PlatformDependent.java
### Line: 1048
```
switch(m.group(2).charAt(0)) {
    case 'k':
    case 'K':
        maxDirectMemory *= 1024;
        break;
    case 'm':
    case 'M':
        maxDirectMemory *= 1024 * 1024;
        break;
    case 'g':
    case 'G':
        maxDirectMemory *= 1024 * 1024 * 1024;
        break;
}
```

## netty\microbench\src\main\java\io\netty\microbench\http2\NoPriorityByteDistributionBenchmark.java
### Line: 124
```
// Create the flow controller
switch(algorithm) {
    case WFQ:
        distributor = new WeightedFairQueueByteDistributor(connection, 0);
        break;
    case UNIFORM:
        distributor = new UniformStreamByteDistributor(connection);
        break;
}
```

## netty\transport-udt\src\main\java\io\netty\channel\udt\nio\NioUdtByteConnectorChannel.java
### Line: 64
```
switch(channelUDT.socketUDT().status()) {
    case INIT:
    case OPENED:
        config = new DefaultUdtChannelConfig(this, channelUDT, true);
        break;
    default:
        config = new DefaultUdtChannelConfig(this, channelUDT, false);
        break;
}
```

## netty\transport-udt\src\main\java\io\netty\channel\udt\nio\NioUdtMessageConnectorChannel.java
### Line: 69
```
switch(channelUDT.socketUDT().status()) {
    case INIT:
    case OPENED:
        config = new DefaultUdtChannelConfig(this, channelUDT, true);
        break;
    default:
        config = new DefaultUdtChannelConfig(this, channelUDT, false);
        break;
}
```

## PermissionsDispatcher\sample\src\main\java\permissions\dispatcher\sample\camera\CameraPreview.java
### Line: 117
```
switch(rotation) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## PhotoView\photoview\src\main\java\com\github\chrisbanes\photoview\PhotoViewAttacher.java
### Line: 658
```
switch(mScaleType) {
    case FIT_START:
        deltaY = -rect.top;
        break;
    case FIT_END:
        deltaY = viewHeight - height - rect.top;
        break;
    default:
        deltaY = (viewHeight - height) / 2 - rect.top;
        break;
}
```

## PhotoView\photoview\src\main\java\com\github\chrisbanes\photoview\PhotoViewAttacher.java
### Line: 681
```
switch(mScaleType) {
    case FIT_START:
        deltaX = -rect.left;
        break;
    case FIT_END:
        deltaX = viewWidth - width - rect.left;
        break;
    default:
        deltaX = (viewWidth - width) / 2 - rect.left;
        break;
}
```

## pinpoint\agent-it\src\test\java\com\navercorp\pinpoint\plugin\hystrix\commands\SayHelloCommand.java
### Line: 73
```
switch(executionOption) {
    case EXCEPTION:
        message = helloRepository.hello(name, expectedException);
        break;
    case TIMEOUT:
        message = helloRepository.hello(name, delayMs);
        break;
    case NORMAL:
    case SHORT_CIRCUIT:
    default:
        message = helloRepository.hello(name);
        break;
}
```

## pinpoint\agent-it\src\test\java\com\navercorp\pinpoint\plugin\hystrix\commands\SayHelloObservableCommand.java
### Line: 73
```
switch(executionOption) {
    case EXCEPTION:
        message = helloObservableRepository.hello(name, expectedException);
        break;
    case TIMEOUT:
        message = helloObservableRepository.hello(name, delayMs);
        break;
    case NORMAL:
    case SHORT_CIRCUIT:
    default:
        message = helloObservableRepository.hello(name);
        break;
}
```

## platform_frameworks_base\cmds\content\src\com\android\commands\content\Content.java
### Line: 642
```
switch(type) {
    case Cursor.FIELD_TYPE_FLOAT:
        columnValue = String.valueOf(cursor.getFloat(columnIndex));
        break;
    case Cursor.FIELD_TYPE_INTEGER:
        columnValue = String.valueOf(cursor.getLong(columnIndex));
        break;
    case Cursor.FIELD_TYPE_STRING:
        columnValue = cursor.getString(columnIndex);
        break;
    case Cursor.FIELD_TYPE_BLOB:
        columnValue = "BLOB";
        break;
    case Cursor.FIELD_TYPE_NULL:
        columnValue = "NULL";
        break;
}
```

## platform_frameworks_base\core\java\android\animation\LayoutTransition.java
### Line: 348
```
switch(transitionType) {
    case APPEARING:
        mTransitionTypes |= FLAG_APPEARING;
        break;
    case DISAPPEARING:
        mTransitionTypes |= FLAG_DISAPPEARING;
        break;
    case CHANGE_APPEARING:
        mTransitionTypes |= FLAG_CHANGE_APPEARING;
        break;
    case CHANGE_DISAPPEARING:
        mTransitionTypes |= FLAG_CHANGE_DISAPPEARING;
        break;
    case CHANGING:
        mTransitionTypes |= FLAG_CHANGING;
        break;
}
```

## platform_frameworks_base\core\java\android\animation\LayoutTransition.java
### Line: 375
```
switch(transitionType) {
    case APPEARING:
        mTransitionTypes &= ~FLAG_APPEARING;
        break;
    case DISAPPEARING:
        mTransitionTypes &= ~FLAG_DISAPPEARING;
        break;
    case CHANGE_APPEARING:
        mTransitionTypes &= ~FLAG_CHANGE_APPEARING;
        break;
    case CHANGE_DISAPPEARING:
        mTransitionTypes &= ~FLAG_CHANGE_DISAPPEARING;
        break;
    case CHANGING:
        mTransitionTypes &= ~FLAG_CHANGING;
        break;
}
```

## platform_frameworks_base\core\java\android\app\BackStackRecord.java
### Line: 306
```
switch(op.cmd) {
    case OP_NULL:
        cmdStr = "NULL";
        break;
    case OP_ADD:
        cmdStr = "ADD";
        break;
    case OP_REPLACE:
        cmdStr = "REPLACE";
        break;
    case OP_REMOVE:
        cmdStr = "REMOVE";
        break;
    case OP_HIDE:
        cmdStr = "HIDE";
        break;
    case OP_SHOW:
        cmdStr = "SHOW";
        break;
    case OP_DETACH:
        cmdStr = "DETACH";
        break;
    case OP_ATTACH:
        cmdStr = "ATTACH";
        break;
    case OP_SET_PRIMARY_NAV:
        cmdStr = "SET_PRIMARY_NAV";
        break;
    case OP_UNSET_PRIMARY_NAV:
        cmdStr = "UNSET_PRIMARY_NAV";
        break;
    default:
        cmdStr = "cmd=" + op.cmd;
        break;
}
```

## platform_frameworks_base\core\java\android\app\FragmentManager.java
### Line: 3478
```
switch(transit) {
    case FragmentTransaction.TRANSIT_FRAGMENT_OPEN:
        rev = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
        break;
    case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
        rev = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        break;
    case FragmentTransaction.TRANSIT_FRAGMENT_FADE:
        rev = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        break;
}
```

## platform_frameworks_base\core\java\android\app\FragmentManager.java
### Line: 3495
```
switch(transit) {
    case FragmentTransaction.TRANSIT_FRAGMENT_OPEN:
        animAttr = enter ? com.android.internal.R.styleable.FragmentAnimation_fragmentOpenEnterAnimation : com.android.internal.R.styleable.FragmentAnimation_fragmentOpenExitAnimation;
        break;
    case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
        animAttr = enter ? com.android.internal.R.styleable.FragmentAnimation_fragmentCloseEnterAnimation : com.android.internal.R.styleable.FragmentAnimation_fragmentCloseExitAnimation;
        break;
    case FragmentTransaction.TRANSIT_FRAGMENT_FADE:
        animAttr = enter ? com.android.internal.R.styleable.FragmentAnimation_fragmentFadeEnterAnimation : com.android.internal.R.styleable.FragmentAnimation_fragmentFadeExitAnimation;
        break;
}
```

## platform_frameworks_base\core\java\android\app\MediaRouteButton.java
### Line: 291
```
switch(widthMode) {
    case MeasureSpec.EXACTLY:
        measuredWidth = widthSize;
        break;
    case MeasureSpec.AT_MOST:
        measuredWidth = Math.min(widthSize, width);
        break;
    default:
    case MeasureSpec.UNSPECIFIED:
        measuredWidth = width;
        break;
}
```

## platform_frameworks_base\core\java\android\app\MediaRouteButton.java
### Line: 305
```
switch(heightMode) {
    case MeasureSpec.EXACTLY:
        measuredHeight = heightSize;
        break;
    case MeasureSpec.AT_MOST:
        measuredHeight = Math.min(heightSize, height);
        break;
    default:
    case MeasureSpec.UNSPECIFIED:
        measuredHeight = height;
        break;
}
```

## platform_frameworks_base\core\java\android\app\servertransaction\TransactionExecutorHelper.java
### Line: 175
```
switch(prevState) {
    // TODO(lifecycler): Extend to support all possible states.
    case ON_PAUSE:
        lifecycleItem = PauseActivityItem.obtain();
        break;
    case ON_STOP:
        lifecycleItem = StopActivityItem.obtain(r.isVisibleFromServer(), 0);
        break;
    default:
        lifecycleItem = ResumeActivityItem.obtain(false);
        break;
}
```

## platform_frameworks_base\core\java\android\content\pm\PermissionInfo.java
### Line: 314
```
switch(level & PROTECTION_MASK_BASE) {
    case PermissionInfo.PROTECTION_DANGEROUS:
        protLevel = "dangerous";
        break;
    case PermissionInfo.PROTECTION_NORMAL:
        protLevel = "normal";
        break;
    case PermissionInfo.PROTECTION_SIGNATURE:
        protLevel = "signature";
        break;
    case PermissionInfo.PROTECTION_SIGNATURE_OR_SYSTEM:
        protLevel = "signatureOrSystem";
        break;
}
```

## platform_frameworks_base\core\java\android\database\CursorJoiner.java
### Line: 169
```
switch(compareStrings(mValues)) {
    case -1:
        mCompareResult = Result.LEFT;
        break;
    case 0:
        mCompareResult = Result.BOTH;
        break;
    case 1:
        mCompareResult = Result.RIGHT;
        break;
}
```

## platform_frameworks_base\core\java\android\hardware\camera2\legacy\SurfaceTextureRenderer.java
### Line: 312
```
switch(flipType) {
    case FLIP_TYPE_HORIZONTAL:
        triangleVertices = mHorizontalFlipTriangleVertices;
        break;
    case FLIP_TYPE_VERTICAL:
        triangleVertices = mVerticalFlipTriangleVertices;
        break;
    case FLIP_TYPE_BOTH:
        triangleVertices = mBothFlipTriangleVertices;
        break;
    default:
        triangleVertices = mRegularTriangleVertices;
        break;
}
```

## platform_frameworks_base\core\java\android\hardware\LegacySensorManager.java
### Line: 74
```
switch(i.getType()) {
    case Sensor.TYPE_ACCELEROMETER:
        result |= SensorManager.SENSOR_ACCELEROMETER;
        break;
    case Sensor.TYPE_MAGNETIC_FIELD:
        result |= SensorManager.SENSOR_MAGNETIC_FIELD;
        break;
    case Sensor.TYPE_ORIENTATION:
        result |= SensorManager.SENSOR_ORIENTATION | SensorManager.SENSOR_ORIENTATION_RAW;
        break;
}
```

## platform_frameworks_base\core\java\android\hardware\Sensor.java
### Line: 1137
```
switch(mType) {
    case TYPE_ACCELEROMETER:
        mStringType = STRING_TYPE_ACCELEROMETER;
        return true;
    case TYPE_AMBIENT_TEMPERATURE:
        mStringType = STRING_TYPE_AMBIENT_TEMPERATURE;
        return true;
    case TYPE_GAME_ROTATION_VECTOR:
        mStringType = STRING_TYPE_GAME_ROTATION_VECTOR;
        return true;
    case TYPE_GEOMAGNETIC_ROTATION_VECTOR:
        mStringType = STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR;
        return true;
    case TYPE_GLANCE_GESTURE:
        mStringType = STRING_TYPE_GLANCE_GESTURE;
        return true;
    case TYPE_GRAVITY:
        mStringType = STRING_TYPE_GRAVITY;
        return true;
    case TYPE_GYROSCOPE:
        mStringType = STRING_TYPE_GYROSCOPE;
        return true;
    case TYPE_GYROSCOPE_UNCALIBRATED:
        mStringType = STRING_TYPE_GYROSCOPE_UNCALIBRATED;
        return true;
    case TYPE_HEART_RATE:
        mStringType = STRING_TYPE_HEART_RATE;
        return true;
    case TYPE_LIGHT:
        mStringType = STRING_TYPE_LIGHT;
        return true;
    case TYPE_LINEAR_ACCELERATION:
        mStringType = STRING_TYPE_LINEAR_ACCELERATION;
        return true;
    case TYPE_MAGNETIC_FIELD:
        mStringType = STRING_TYPE_MAGNETIC_FIELD;
        return true;
    case TYPE_MAGNETIC_FIELD_UNCALIBRATED:
        mStringType = STRING_TYPE_MAGNETIC_FIELD_UNCALIBRATED;
        return true;
    case TYPE_PICK_UP_GESTURE:
        mStringType = STRING_TYPE_PICK_UP_GESTURE;
        return true;
    case TYPE_PRESSURE:
        mStringType = STRING_TYPE_PRESSURE;
        return true;
    case TYPE_PROXIMITY:
        mStringType = STRING_TYPE_PROXIMITY;
        return true;
    case TYPE_RELATIVE_HUMIDITY:
        mStringType = STRING_TYPE_RELATIVE_HUMIDITY;
        return true;
    case TYPE_ROTATION_VECTOR:
        mStringType = STRING_TYPE_ROTATION_VECTOR;
        return true;
    case TYPE_SIGNIFICANT_MOTION:
        mStringType = STRING_TYPE_SIGNIFICANT_MOTION;
        return true;
    case TYPE_STEP_COUNTER:
        mStringType = STRING_TYPE_STEP_COUNTER;
        return true;
    case TYPE_STEP_DETECTOR:
        mStringType = STRING_TYPE_STEP_DETECTOR;
        return true;
    case TYPE_TILT_DETECTOR:
        mStringType = SENSOR_STRING_TYPE_TILT_DETECTOR;
        return true;
    case TYPE_WAKE_GESTURE:
        mStringType = STRING_TYPE_WAKE_GESTURE;
        return true;
    case TYPE_ORIENTATION:
        mStringType = STRING_TYPE_ORIENTATION;
        return true;
    case TYPE_TEMPERATURE:
        mStringType = STRING_TYPE_TEMPERATURE;
        return true;
    case TYPE_DEVICE_ORIENTATION:
        mStringType = STRING_TYPE_DEVICE_ORIENTATION;
        return true;
    case TYPE_DYNAMIC_SENSOR_META:
        mStringType = STRING_TYPE_DYNAMIC_SENSOR_META;
        return true;
    case TYPE_LOW_LATENCY_OFFBODY_DETECT:
        mStringType = STRING_TYPE_LOW_LATENCY_OFFBODY_DETECT;
        return true;
    case TYPE_ACCELEROMETER_UNCALIBRATED:
        mStringType = STRING_TYPE_ACCELEROMETER_UNCALIBRATED;
        return true;
    default:
        return false;
}
```

## platform_frameworks_base\core\java\android\hardware\SensorManager.java
### Line: 1890
```
switch(rate) {
    case SENSOR_DELAY_FASTEST:
        delay = 0;
        break;
    case SENSOR_DELAY_GAME:
        delay = 20000;
        break;
    case SENSOR_DELAY_UI:
        delay = 66667;
        break;
    case SENSOR_DELAY_NORMAL:
        delay = 200000;
        break;
    default:
        delay = rate;
        break;
}
```

## platform_frameworks_base\core\java\android\os\BatteryStats.java
### Line: 3474
```
switch(controllerName) {
    case CELLULAR_CONTROLLER_NAME:
        powerLevel = new String[] { "   less than 0dBm: ", "   0dBm to 8dBm: ", "   8dBm to 15dBm: ", "   15dBm to 20dBm: ", "   above 20dBm: " };
        break;
    default:
        powerLevel = new String[] { "[0]", "[1]", "[2]", "[3]", "[4]" };
        break;
}
```

## platform_frameworks_base\core\java\android\os\BatteryStats.java
### Line: 1133
```
switch(c) {
    case 'f':
        out |= (((long) Display.STATE_OFF - 1) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'o':
        out |= (((long) Display.STATE_ON - 1) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'd':
        out |= (((long) Display.STATE_DOZE - 1) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'z':
        out |= (((long) Display.STATE_DOZE_SUSPEND - 1) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'p':
        out |= (((long) STEP_LEVEL_MODE_POWER_SAVE) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'i':
        out |= (((long) STEP_LEVEL_MODE_DEVICE_IDLE) << STEP_LEVEL_INITIAL_MODE_SHIFT);
        break;
    case 'F':
        out |= (((long) Display.STATE_OFF - 1) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
    case 'O':
        out |= (((long) Display.STATE_ON - 1) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
    case 'D':
        out |= (((long) Display.STATE_DOZE - 1) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
    case 'Z':
        out |= (((long) Display.STATE_DOZE_SUSPEND - 1) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
    case 'P':
        out |= (((long) STEP_LEVEL_MODE_POWER_SAVE) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
    case 'I':
        out |= (((long) STEP_LEVEL_MODE_DEVICE_IDLE) << STEP_LEVEL_MODIFIED_MODE_SHIFT);
        break;
}
```

## platform_frameworks_base\core\java\android\os\BatteryStats.java
### Line: 6610
```
switch((int) (initMode & STEP_LEVEL_MODE_SCREEN_STATE) + 1) {
    case Display.STATE_OFF:
        ds = SystemProto.BatteryLevelStep.DS_OFF;
        break;
    case Display.STATE_ON:
        ds = SystemProto.BatteryLevelStep.DS_ON;
        break;
    case Display.STATE_DOZE:
        ds = SystemProto.BatteryLevelStep.DS_DOZE;
        break;
    case Display.STATE_DOZE_SUSPEND:
        ds = SystemProto.BatteryLevelStep.DS_DOZE_SUSPEND;
        break;
    default:
        ds = SystemProto.BatteryLevelStep.DS_ERROR;
        break;
}
```

## platform_frameworks_base\core\java\android\os\ParcelFileDescriptor.java
### Line: 301
```
switch(mode & MODE_READ_WRITE) {
    case 0:
    case MODE_READ_ONLY:
        flags = O_RDONLY;
        break;
    case MODE_WRITE_ONLY:
        flags = O_WRONLY;
        break;
    case MODE_READ_WRITE:
        flags = O_RDWR;
        break;
}
```

## platform_frameworks_base\core\java\android\os\PatternMatcher.java
### Line: 118
```
switch(mType) {
    case PATTERN_LITERAL:
        type = "LITERAL: ";
        break;
    case PATTERN_PREFIX:
        type = "PREFIX: ";
        break;
    case PATTERN_SIMPLE_GLOB:
        type = "GLOB: ";
        break;
    case PATTERN_ADVANCED_GLOB:
        type = "ADVANCED: ";
        break;
}
```

## platform_frameworks_base\core\java\android\preference\PreferenceManager.java
### Line: 510
```
switch(mStorage) {
    case STORAGE_DEVICE_PROTECTED:
        storageContext = mContext.createDeviceProtectedStorageContext();
        break;
    case STORAGE_CREDENTIAL_PROTECTED:
        storageContext = mContext.createCredentialProtectedStorageContext();
        break;
    default:
        storageContext = mContext;
        break;
}
```

## platform_frameworks_base\core\java\android\speech\tts\TextToSpeechService.java
### Line: 322
```
switch(localeStatus) {
    case TextToSpeech.LANG_AVAILABLE:
        iso3Locale = new Locale(lang);
        break;
    case TextToSpeech.LANG_COUNTRY_AVAILABLE:
        iso3Locale = new Locale(lang, country);
        break;
    case TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE:
        iso3Locale = new Locale(lang, country, variant);
        break;
    default:
        return null;
}
```

## platform_frameworks_base\core\java\android\text\AndroidBidi.java
### Line: 77
```
switch(dir) {
    case Layout.DIR_REQUEST_LTR:
        paraLevel = Bidi.LTR;
        break;
    case Layout.DIR_REQUEST_RTL:
        paraLevel = Bidi.RTL;
        break;
    case Layout.DIR_REQUEST_DEFAULT_LTR:
        paraLevel = Bidi.LEVEL_DEFAULT_LTR;
        break;
    case Layout.DIR_REQUEST_DEFAULT_RTL:
        paraLevel = Bidi.LEVEL_DEFAULT_RTL;
        break;
    default:
        paraLevel = Bidi.LTR;
        break;
}
```

## platform_frameworks_base\core\java\android\text\format\DateUtils.java
### Line: 203
```
switch(abbrev) {
    case LENGTH_LONG:
        names = d.longWeekdayNames;
        break;
    case LENGTH_MEDIUM:
        names = d.shortWeekdayNames;
        break;
    // TODO
    case LENGTH_SHORT:
        names = d.shortWeekdayNames;
        break;
    // TODO
    case LENGTH_SHORTER:
        names = d.shortWeekdayNames;
        break;
    case LENGTH_SHORTEST:
        names = d.tinyWeekdayNames;
        break;
    default:
        names = d.shortWeekdayNames;
        break;
}
```

## platform_frameworks_base\core\java\android\text\format\DateUtils.java
### Line: 241
```
switch(abbrev) {
    case LENGTH_LONG:
        names = d.longMonthNames;
        break;
    case LENGTH_MEDIUM:
        names = d.shortMonthNames;
        break;
    case LENGTH_SHORT:
        names = d.shortMonthNames;
        break;
    case LENGTH_SHORTER:
        names = d.shortMonthNames;
        break;
    case LENGTH_SHORTEST:
        names = d.tinyMonthNames;
        break;
    default:
        names = d.shortMonthNames;
        break;
}
```

## platform_frameworks_base\core\java\android\text\method\BaseKeyListener.java
### Line: 457
```
switch(caps) {
    case CHARACTERS:
        contentType |= InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS;
        break;
    case WORDS:
        contentType |= InputType.TYPE_TEXT_FLAG_CAP_WORDS;
        break;
    case SENTENCES:
        contentType |= InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
        break;
}
```

## platform_frameworks_base\core\java\android\text\method\BaseKeyListener.java
### Line: 477
```
switch(keyCode) {
    case KeyEvent.KEYCODE_DEL:
        handled = backspace(view, content, keyCode, event);
        break;
    case KeyEvent.KEYCODE_FORWARD_DEL:
        handled = forwardDelete(view, content, keyCode, event);
        break;
    default:
        handled = false;
        break;
}
```

## platform_frameworks_base\core\java\android\text\style\TextAppearanceSpan.java
### Line: 87
```
switch(tf) {
    case 1:
        mFamilyName = "sans";
        break;
    case 2:
        mFamilyName = "serif";
        break;
    case 3:
        mFamilyName = "monospace";
        break;
    default:
        mFamilyName = null;
        break;
}
```

## platform_frameworks_base\core\java\android\transition\SidePropagation.java
### Line: 134
```
switch(side) {
    case Gravity.LEFT:
        distance = right - viewX + Math.abs(epicenterY - viewY);
        break;
    case Gravity.TOP:
        distance = bottom - viewY + Math.abs(epicenterX - viewX);
        break;
    case Gravity.RIGHT:
        distance = viewX - left + Math.abs(epicenterY - viewY);
        break;
    case Gravity.BOTTOM:
        distance = viewY - top + Math.abs(epicenterX - viewX);
        break;
}
```

## platform_frameworks_base\core\java\android\util\Base64.java
### Line: 522
```
switch(len % 3) {
    case 0:
        break;
    case 1:
        output_len += 2;
        break;
    case 2:
        output_len += 3;
        break;
}
```

## platform_frameworks_base\core\java\android\view\FocusFinder.java
### Line: 717
```
switch(direction) {
    case View.FOCUS_LEFT:
        distance = x - touchableBounds.right + 1;
        break;
    case View.FOCUS_RIGHT:
        distance = touchableBounds.left;
        break;
    case View.FOCUS_UP:
        distance = y - touchableBounds.bottom + 1;
        break;
    case View.FOCUS_DOWN:
        distance = touchableBounds.top;
        break;
}
```

## platform_frameworks_base\core\java\android\view\inputmethod\EditorInfo.java
### Line: 491
```
switch(inputType & (TYPE_MASK_CLASS | TYPE_MASK_VARIATION)) {
    case TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS:
        inputType = TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_EMAIL_ADDRESS | (inputType & TYPE_MASK_FLAGS);
        break;
    case TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_WEB_PASSWORD:
        inputType = TYPE_CLASS_TEXT | TYPE_TEXT_VARIATION_PASSWORD | (inputType & TYPE_MASK_FLAGS);
        break;
    case TYPE_CLASS_NUMBER | TYPE_NUMBER_VARIATION_NORMAL:
    case TYPE_CLASS_NUMBER | TYPE_NUMBER_VARIATION_PASSWORD:
        inputType = TYPE_CLASS_NUMBER | (inputType & TYPE_MASK_FLAGS);
        break;
}
```

## platform_frameworks_base\core\java\android\view\inputmethod\InputMethodManager.java
### Line: 1392
```
switch(res.result) {
    case InputBindResult.ResultCode.ERROR_NOT_IME_TARGET_WINDOW:
        mRestartOnNextWindowFocus = true;
        break;
}
```

## platform_frameworks_base\core\java\android\view\ThreadedRenderer.java
### Line: 653
```
switch(args[i]) {
    case "framestats":
        flags |= FLAG_DUMP_FRAMESTATS;
        break;
    case "reset":
        flags |= FLAG_DUMP_RESET;
        break;
    case // magic option passed when dumping a bugreport.
    "-a":
        flags = FLAG_DUMP_ALL;
        break;
}
```

## platform_frameworks_base\core\java\android\view\View.java
### Line: 23499
```
switch(specMode) {
    case MeasureSpec.UNSPECIFIED:
        result = size;
        break;
    case MeasureSpec.AT_MOST:
    case MeasureSpec.EXACTLY:
        result = specSize;
        break;
}
```

## platform_frameworks_base\core\java\android\view\View.java
### Line: 19506
```
// Keep the DRAWING_CACHE_QUALITY_LOW flag just in case
switch(mViewFlags & DRAWING_CACHE_QUALITY_MASK) {
    case DRAWING_CACHE_QUALITY_AUTO:
    case DRAWING_CACHE_QUALITY_LOW:
    case DRAWING_CACHE_QUALITY_HIGH:
    default:
        quality = Bitmap.Config.ARGB_8888;
        break;
}
```

## platform_frameworks_base\core\java\android\view\View.java
### Line: 5843
```
switch(id & 0xff000000) {
    case 0x7f000000:
        pkgname = "app";
        break;
    case 0x01000000:
        pkgname = "android";
        break;
    default:
        pkgname = r.getResourcePackageName(id);
        break;
}
```

## platform_frameworks_base\core\java\android\view\ViewRootImpl.java
### Line: 2966
```
switch(rootDimension) {
    case ViewGroup.LayoutParams.MATCH_PARENT:
        // Window can't resize. Force root view to be windowSize.
        measureSpec = MeasureSpec.makeMeasureSpec(windowSize, MeasureSpec.EXACTLY);
        break;
    case ViewGroup.LayoutParams.WRAP_CONTENT:
        // Window can resize. Set max size for root view.
        measureSpec = MeasureSpec.makeMeasureSpec(windowSize, MeasureSpec.AT_MOST);
        break;
    default:
        // Window wants to be an exact size. Force root view to be that size.
        measureSpec = MeasureSpec.makeMeasureSpec(rootDimension, MeasureSpec.EXACTLY);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\AbsListView.java
### Line: 5891
```
switch(action) {
    case KeyEvent.ACTION_DOWN:
        handled = mTextFilter.onKeyDown(keyCode, forwardEvent);
        break;
    case KeyEvent.ACTION_UP:
        handled = mTextFilter.onKeyUp(keyCode, forwardEvent);
        break;
    case KeyEvent.ACTION_MULTIPLE:
        handled = mTextFilter.onKeyMultiple(keyCode, count, event);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\CheckedTextView.java
### Line: 392
```
switch(verticalGravity) {
    case Gravity.BOTTOM:
        y = getHeight() - height;
        break;
    case Gravity.CENTER_VERTICAL:
        y = (getHeight() - height) / 2;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\DatePicker.java
### Line: 176
```
switch(mMode) {
    case MODE_CALENDAR:
        mDelegate = createCalendarUIDelegate(context, attrs, defStyleAttr, defStyleRes);
        break;
    case MODE_SPINNER:
    default:
        mDelegate = createSpinnerUIDelegate(context, attrs, defStyleAttr, defStyleRes);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\Editor.java
### Line: 671
```
switch(layoutDirection) {
    default:
    case View.LAYOUT_DIRECTION_LTR:
        height = (dr != null ? dr.mDrawableHeightRight : 0);
        break;
    case View.LAYOUT_DIRECTION_RTL:
        height = (dr != null ? dr.mDrawableHeightLeft : 0);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\Editor.java
### Line: 4770
```
switch(mHorizontalGravity) {
    case Gravity.LEFT:
        left = 0;
        break;
    default:
    case Gravity.CENTER:
        left = (width - drawWidth) / 2;
        break;
    case Gravity.RIGHT:
        left = width - drawWidth;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\FastScroller.java
### Line: 1216
```
switch(mOverlayPosition) {
    case OVERLAY_AT_THUMB:
        previewPos = thumbMiddle;
        break;
    case OVERLAY_ABOVE_THUMB:
        previewPos = thumbMiddle - previewHalfHeight;
        break;
    case OVERLAY_FLOATING:
    default:
        previewPos = 0;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\GridView.java
### Line: 1560
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.LEFT:
        childLeft = childrenLeft;
        break;
    case Gravity.CENTER_HORIZONTAL:
        childLeft = childrenLeft + ((mColumnWidth - w) / 2);
        break;
    case Gravity.RIGHT:
        childLeft = childrenLeft + mColumnWidth - w;
        break;
    default:
        childLeft = childrenLeft;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\ImageView.java
### Line: 1197
```
switch(specMode) {
    case MeasureSpec.UNSPECIFIED:
        /* Parent says we can be as big as we want. Just don't be larger
                   than max size imposed on ourselves.
                */
        result = Math.min(desiredSize, maxSize);
        break;
    case MeasureSpec.AT_MOST:
        // Parent says we can be as big as we want, up to specSize.
        // Don't be larger than specSize, and don't be larger than
        // the max size imposed on ourselves.
        result = Math.min(Math.min(desiredSize, specSize), maxSize);
        break;
    case MeasureSpec.EXACTLY:
        // No choice. Do what we are told.
        result = specSize;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\LinearLayout.java
### Line: 1610
```
switch(majorGravity) {
    case Gravity.BOTTOM:
        // mTotalLength contains the padding already
        childTop = mPaddingTop + bottom - top - mTotalLength;
        break;
    // mTotalLength contains the padding already
    case Gravity.CENTER_VERTICAL:
        childTop = mPaddingTop + (bottom - top - mTotalLength) / 2;
        break;
    case Gravity.TOP:
    default:
        childTop = mPaddingTop;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\LinearLayout.java
### Line: 1722
```
switch(Gravity.getAbsoluteGravity(majorGravity, layoutDirection)) {
    case Gravity.RIGHT:
        // mTotalLength contains the padding already
        childLeft = mPaddingLeft + right - left - mTotalLength;
        break;
    case Gravity.CENTER_HORIZONTAL:
        // mTotalLength contains the padding already
        childLeft = mPaddingLeft + (right - left - mTotalLength) / 2;
        break;
    case Gravity.LEFT:
    default:
        childLeft = mPaddingLeft;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\LinearLayout.java
### Line: 614
```
switch(majorGravity) {
    case Gravity.BOTTOM:
        childTop = mBottom - mTop - mPaddingBottom - mTotalLength;
        break;
    case Gravity.CENTER_VERTICAL:
        childTop += ((mBottom - mTop - mPaddingTop - mPaddingBottom) - mTotalLength) / 2;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\LinearLayout.java
### Line: 1644
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.CENTER_HORIZONTAL:
        childLeft = paddingLeft + ((childSpace - childWidth) / 2) + lp.leftMargin - lp.rightMargin;
        break;
    case Gravity.RIGHT:
        childLeft = childRight - childWidth - lp.rightMargin;
        break;
    case Gravity.LEFT:
    default:
        childLeft = paddingLeft + lp.leftMargin;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\ListPopupWindow.java
### Line: 1247
```
switch(mDropDownWidth) {
    case ViewGroup.LayoutParams.WRAP_CONTENT:
        childWidthSpec = MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), MeasureSpec.AT_MOST);
        break;
    case ViewGroup.LayoutParams.MATCH_PARENT:
        childWidthSpec = MeasureSpec.makeMeasureSpec(mContext.getResources().getDisplayMetrics().widthPixels - (mTempRect.left + mTempRect.right), MeasureSpec.EXACTLY);
        break;
    default:
        childWidthSpec = MeasureSpec.makeMeasureSpec(mDropDownWidth, MeasureSpec.EXACTLY);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\SearchView.java
### Line: 823
```
switch(heightMode) {
    case MeasureSpec.AT_MOST:
        height = Math.min(getPreferredHeight(), height);
        break;
    case MeasureSpec.UNSPECIFIED:
        height = getPreferredHeight();
        break;
}
```

## platform_frameworks_base\core\java\android\widget\Space.java
### Line: 80
```
switch(specMode) {
    case MeasureSpec.UNSPECIFIED:
        result = size;
        break;
    case MeasureSpec.AT_MOST:
        result = Math.min(size, specSize);
        break;
    case MeasureSpec.EXACTLY:
        result = specSize;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\Spinner.java
### Line: 669
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.CENTER_HORIZONTAL:
        selectedOffset = childrenLeft + (childrenWidth / 2) - (width / 2);
        break;
    case Gravity.RIGHT:
        selectedOffset = childrenLeft + childrenWidth - width;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\Switch.java
### Line: 365
```
switch(typefaceIndex) {
    case SANS:
        tf = Typeface.SANS_SERIF;
        break;
    case SERIF:
        tf = Typeface.SERIF;
        break;
    case MONOSPACE:
        tf = Typeface.MONOSPACE;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TabHost.java
### Line: 334
```
switch(mTabWidget.getOrientation()) {
    case LinearLayout.VERTICAL:
        location = (mTabContent.getLeft() < mTabWidget.getLeft()) ? TABWIDGET_LOCATION_RIGHT : TABWIDGET_LOCATION_LEFT;
        break;
    case LinearLayout.HORIZONTAL:
    default:
        location = (mTabContent.getTop() < mTabWidget.getTop()) ? TABWIDGET_LOCATION_BOTTOM : TABWIDGET_LOCATION_TOP;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TextView.java
### Line: 9093
```
switch(layout.getParagraphAlignment(line)) {
    case ALIGN_LEFT:
        grav = 1;
        break;
    case ALIGN_RIGHT:
        grav = -1;
        break;
    case ALIGN_NORMAL:
        grav = layout.getParagraphDirection(line);
        break;
    case ALIGN_OPPOSITE:
        grav = -layout.getParagraphDirection(line);
        break;
    case ALIGN_CENTER:
    default:
        grav = 0;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TextView.java
### Line: 8183
```
switch(mGravity & Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK) {
    case Gravity.START:
        alignment = Layout.Alignment.ALIGN_NORMAL;
        break;
    case Gravity.END:
        alignment = Layout.Alignment.ALIGN_OPPOSITE;
        break;
    case Gravity.LEFT:
        alignment = Layout.Alignment.ALIGN_LEFT;
        break;
    case Gravity.RIGHT:
        alignment = Layout.Alignment.ALIGN_RIGHT;
        break;
    case Gravity.CENTER_HORIZONTAL:
        alignment = Layout.Alignment.ALIGN_CENTER;
        break;
    default:
        alignment = Layout.Alignment.ALIGN_NORMAL;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TextView.java
### Line: 6190
```
switch(type & EditorInfo.TYPE_MASK_VARIATION) {
    case EditorInfo.TYPE_DATETIME_VARIATION_DATE:
        input = DateKeyListener.getInstance(locale);
        break;
    case EditorInfo.TYPE_DATETIME_VARIATION_TIME:
        input = TimeKeyListener.getInstance(locale);
        break;
    default:
        input = DateTimeKeyListener.getInstance(locale);
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TextView.java
### Line: 1468
```
switch(buffertype) {
    case 0:
        bufferType = BufferType.NORMAL;
        break;
    case 1:
        bufferType = BufferType.SPANNABLE;
        break;
    case 2:
        bufferType = BufferType.EDITABLE;
        break;
}
```

## platform_frameworks_base\core\java\android\widget\TimePicker.java
### Line: 141
```
switch(mMode) {
    case MODE_CLOCK:
        mDelegate = new TimePickerClockDelegate(this, context, attrs, defStyleAttr, defStyleRes);
        break;
    case MODE_SPINNER:
    default:
        mDelegate = new TimePickerSpinnerDelegate(this, context, attrs, defStyleAttr, defStyleRes);
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\os\ZygoteConnection.java
### Line: 342
```
switch(accessMethod) {
    case HiddenApiUsageLogger.ACCESS_METHOD_NONE:
        accessMethodMetric = MetricsEvent.ACCESS_METHOD_NONE;
        break;
    case HiddenApiUsageLogger.ACCESS_METHOD_REFLECTION:
        accessMethodMetric = MetricsEvent.ACCESS_METHOD_REFLECTION;
        break;
    case HiddenApiUsageLogger.ACCESS_METHOD_JNI:
        accessMethodMetric = MetricsEvent.ACCESS_METHOD_JNI;
        break;
    case HiddenApiUsageLogger.ACCESS_METHOD_LINKING:
        accessMethodMetric = MetricsEvent.ACCESS_METHOD_LINKING;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\view\BaseSurfaceHolder.java
### Line: 138
```
switch(type) {
    case SURFACE_TYPE_HARDWARE:
    case SURFACE_TYPE_GPU:
        // these are deprecated, treat as "NORMAL"
        type = SURFACE_TYPE_NORMAL;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\ActionBarView.java
### Line: 1520
```
switch(widthMode) {
    case MeasureSpec.AT_MOST:
        width = Math.min(width, widthSize);
        break;
    case MeasureSpec.EXACTLY:
        width = widthSize;
        break;
    case MeasureSpec.UNSPECIFIED:
    default:
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\ActionBarView.java
### Line: 1531
```
switch(heightMode) {
    case MeasureSpec.AT_MOST:
        height = Math.min(height, heightSize);
        break;
    case MeasureSpec.EXACTLY:
        height = heightSize;
        break;
    case MeasureSpec.UNSPECIFIED:
    default:
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\ActionBarView.java
### Line: 1211
```
switch(Gravity.getAbsoluteGravity(hgravity, layoutDirection)) {
    case Gravity.CENTER_HORIZONTAL:
        xpos = ((mRight - mLeft) - navWidth) / 2;
        break;
    case Gravity.LEFT:
        xpos = isLayoutRtl ? menuStart : x;
        break;
    case Gravity.RIGHT:
        xpos = isLayoutRtl ? x - navWidth : menuStart - navWidth;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\AdapterHelper.java
### Line: 268
```
switch(op.cmd) {
    case UpdateOp.UPDATE:
        continuous = updatedPos == tmpStart + 1;
        break;
    case UpdateOp.REMOVE:
        continuous = updatedPos == tmpStart;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\AlertDialogLayout.java
### Line: 291
```
switch(majorGravity) {
    case Gravity.BOTTOM:
        // totalLength contains the padding already
        childTop = mPaddingTop + bottom - top - totalLength;
        break;
    // totalLength contains the padding already
    case Gravity.CENTER_VERTICAL:
        childTop = mPaddingTop + (bottom - top - totalLength) / 2;
        break;
    case Gravity.TOP:
    default:
        childTop = mPaddingTop;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\AlertDialogLayout.java
### Line: 330
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.CENTER_HORIZONTAL:
        childLeft = paddingLeft + ((childSpace - childWidth) / 2) + lp.leftMargin - lp.rightMargin;
        break;
    case Gravity.RIGHT:
        childLeft = childRight - childWidth - lp.rightMargin;
        break;
    case Gravity.LEFT:
    default:
        childLeft = paddingLeft + lp.leftMargin;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\MessagingLinearLayout.java
### Line: 73
```
switch(MeasureSpec.getMode(heightMeasureSpec)) {
    case MeasureSpec.UNSPECIFIED:
        targetHeight = Integer.MAX_VALUE;
        break;
}
```

## platform_frameworks_base\core\java\com\android\internal\widget\MessagingLinearLayout.java
### Line: 58
```
switch(attr) {
    case R.styleable.MessagingLinearLayout_spacing:
        mSpacing = a.getDimensionPixelSize(i, 0);
        break;
}
```

## platform_frameworks_base\core\tests\coretests\src\android\text\TextUtilsTest.java
### Line: 298
```
switch(j) {
    case 0:
        kind = TextUtils.TruncateAt.START;
        break;
    case 1:
        kind = TextUtils.TruncateAt.END;
        break;
    case 2:
        kind = TextUtils.TruncateAt.MIDDLE;
        break;
}
```

## platform_frameworks_base\core\tests\coretests\src\android\widget\espresso\CustomViewActions.java
### Line: 90
```
switch(hRef) {
    case LEFT:
        x = xy[0] + hDelta;
        break;
    case RIGHT:
        x = xy[0] + w + hDelta;
        break;
    case CENTER:
        x = xy[0] + w / 2 + hDelta;
        break;
}
```

## platform_frameworks_base\core\tests\coretests\src\android\widget\espresso\CustomViewActions.java
### Line: 102
```
switch(vRef) {
    case TOP:
        y = xy[1] + vDelta;
        break;
    case BOTTOM:
        y = xy[1] + h + vDelta;
        break;
    case CENTER:
        y = xy[1] + h / 2 + vDelta;
        break;
}
```

## platform_frameworks_base\drm\java\android\drm\DrmInfoRequest.java
### Line: 152
```
switch(infoType) {
    case TYPE_REGISTRATION_INFO:
    case TYPE_UNREGISTRATION_INFO:
    case TYPE_RIGHTS_ACQUISITION_INFO:
    case TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO:
        isValid = true;
        break;
}
```

## platform_frameworks_base\drm\java\android\drm\DrmManagerClient.java
### Line: 806
```
switch(infoType) {
    case DrmInfoRequest.TYPE_REGISTRATION_INFO:
    case DrmInfoRequest.TYPE_UNREGISTRATION_INFO:
    case DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_INFO:
        eventType = DrmEvent.TYPE_DRM_INFO_PROCESSED;
        break;
}
```

## platform_frameworks_base\drm\java\android\drm\DrmManagerClient.java
### Line: 819
```
switch(infoType) {
    case DrmInfoRequest.TYPE_REGISTRATION_INFO:
    case DrmInfoRequest.TYPE_UNREGISTRATION_INFO:
    case DrmInfoRequest.TYPE_RIGHTS_ACQUISITION_INFO:
        error = DrmErrorEvent.TYPE_PROCESS_DRM_INFO_FAILED;
        break;
}
```

## platform_frameworks_base\graphics\java\android\graphics\Bitmap.java
### Line: 859
```
switch(config) {
    case RGB_565:
        newConfig = Config.RGB_565;
        break;
    case ALPHA_8:
        newConfig = Config.ALPHA_8;
        break;
    case RGBA_F16:
        newConfig = Config.RGBA_F16;
        break;
    // noinspection deprecation
    case ARGB_4444:
    case ARGB_8888:
    default:
        newConfig = Config.ARGB_8888;
        break;
}
```

## platform_frameworks_base\location\lib\java\com\android\location\provider\ActivityRecognitionEvent.java
### Line: 49
```
switch(mEventType) {
    case ActivityRecognitionProvider.EVENT_TYPE_ENTER:
        eventString = "Enter";
        break;
    case ActivityRecognitionProvider.EVENT_TYPE_EXIT:
        eventString = "Exit";
        break;
    case ActivityRecognitionProvider.EVENT_TYPE_FLUSH_COMPLETE:
        eventString = "FlushComplete";
        break;
    default:
        eventString = "<Invalid>";
        break;
}
```

## platform_frameworks_base\media\java\android\media\AudioPort.java
### Line: 221
```
switch(mRole) {
    case ROLE_NONE:
        role = "NONE";
        break;
    case ROLE_SOURCE:
        role = "SOURCE";
        break;
    case ROLE_SINK:
        role = "SINK";
        break;
}
```

## platform_frameworks_base\media\java\android\media\ClosedCaptionRenderer.java
### Line: 1125
```
// replace the non-ASCII ones
switch(data) {
    case 0x2A:
        c = '\u00E1';
        break;
    case 0x5C:
        c = '\u00E9';
        break;
    case 0x5E:
        c = '\u00ED';
        break;
    case 0x5F:
        c = '\u00F3';
        break;
    case 0x60:
        c = '\u00FA';
        break;
    case 0x7B:
        c = '\u00E7';
        break;
    case 0x7C:
        c = '\u00F7';
        break;
    case 0x7D:
        c = '\u00D1';
        break;
    case 0x7E:
        c = '\u00F1';
        break;
    // Full block
    case 0x7F:
        c = '\u2588';
        break;
    default:
        c = (char) data;
        break;
}
```

## platform_frameworks_base\media\java\android\media\ExifInterface.java
### Line: 2634
```
// all rotation angles in CW
switch(Integer.parseInt(rotation)) {
    case 90:
        orientation = ExifInterface.ORIENTATION_ROTATE_90;
        break;
    case 180:
        orientation = ExifInterface.ORIENTATION_ROTATE_180;
        break;
    case 270:
        orientation = ExifInterface.ORIENTATION_ROTATE_270;
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaCasStateException.java
### Line: 50
```
switch(err) {
    case Status.ERROR_CAS_UNKNOWN:
        diagnosticInfo = "General CAS error";
        break;
    case Status.ERROR_CAS_NO_LICENSE:
        diagnosticInfo = "No license";
        break;
    case Status.ERROR_CAS_LICENSE_EXPIRED:
        diagnosticInfo = "License expired";
        break;
    case Status.ERROR_CAS_SESSION_NOT_OPENED:
        diagnosticInfo = "Session not opened";
        break;
    case Status.ERROR_CAS_CANNOT_HANDLE:
        diagnosticInfo = "Unsupported scheme or data format";
        break;
    case Status.ERROR_CAS_INVALID_STATE:
        diagnosticInfo = "Invalid CAS state";
        break;
    case Status.ERROR_CAS_INSUFFICIENT_OUTPUT_PROTECTION:
        diagnosticInfo = "Insufficient output protection";
        break;
    case Status.ERROR_CAS_TAMPER_DETECTED:
        diagnosticInfo = "Tamper detected";
        break;
    case Status.ERROR_CAS_DECRYPT_UNIT_NOT_INITIALIZED:
        diagnosticInfo = "Not initialized";
        break;
    case Status.ERROR_CAS_DECRYPT:
        diagnosticInfo = "Decrypt error";
        break;
    default:
        diagnosticInfo = "Unknown CAS state exception";
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaMetadata.java
### Line: 697
```
switch(METADATA_KEYS_TYPE.valueAt(i)) {
    case METADATA_TYPE_TEXT:
        hashCode = 31 * hashCode + Objects.hash(getString(key));
        break;
    case METADATA_TYPE_LONG:
        hashCode = 31 * hashCode + Long.hashCode(getLong(key));
        break;
    default:
        // Ignore ratings and bitmaps when comparing
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaPlayer2Impl.java
### Line: 319
```
switch(mediaplayer2State) {
    case MEDIAPLAYER2_STATE_IDLE:
        playerState = PLAYER_STATE_IDLE;
        break;
    case MEDIAPLAYER2_STATE_PREPARED:
    case MEDIAPLAYER2_STATE_PAUSED:
        playerState = PLAYER_STATE_PAUSED;
        break;
    case MEDIAPLAYER2_STATE_PLAYING:
        playerState = PLAYER_STATE_PLAYING;
        break;
    case MEDIAPLAYER2_STATE_ERROR:
    default:
        playerState = PLAYER_STATE_ERROR;
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaRouter.java
### Line: 1759
```
switch(statusCode) {
    case STATUS_SCANNING:
        resId = com.android.internal.R.string.media_route_status_scanning;
        break;
    case STATUS_CONNECTING:
        resId = com.android.internal.R.string.media_route_status_connecting;
        break;
    case STATUS_AVAILABLE:
        resId = com.android.internal.R.string.media_route_status_available;
        break;
    case STATUS_NOT_AVAILABLE:
        resId = com.android.internal.R.string.media_route_status_not_available;
        break;
    case STATUS_IN_USE:
        resId = com.android.internal.R.string.media_route_status_in_use;
        break;
    case STATUS_CONNECTED:
    case STATUS_NONE:
    default:
        resId = 0;
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaRouter.java
### Line: 1740
```
switch(statusCode) {
    // to eventually proceed to CONNECTED.
    case STATUS_AVAILABLE:
    case STATUS_SCANNING:
        statusCode = STATUS_CONNECTING;
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaRouter.java
### Line: 2369
```
switch(mVolumeHandling) {
    case RemoteControlClient.PLAYBACK_VOLUME_VARIABLE:
        volumeControl = VolumeProvider.VOLUME_CONTROL_ABSOLUTE;
        break;
    case RemoteControlClient.PLAYBACK_VOLUME_FIXED:
    default:
        break;
}
```

## platform_frameworks_base\media\java\android\media\MediaScanner.java
### Line: 1042
```
switch(orientation) {
    case ExifInterface.ORIENTATION_ROTATE_90:
        degree = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
        degree = 180;
        break;
    case ExifInterface.ORIENTATION_ROTATE_270:
        degree = 270;
        break;
    default:
        degree = 0;
        break;
}
```

## platform_frameworks_base\media\java\android\media\session\MediaController.java
### Line: 181
```
switch(keyEvent.getKeyCode()) {
    case KeyEvent.KEYCODE_VOLUME_UP:
        direction = AudioManager.ADJUST_RAISE;
        break;
    case KeyEvent.KEYCODE_VOLUME_DOWN:
        direction = AudioManager.ADJUST_LOWER;
        break;
    case KeyEvent.KEYCODE_VOLUME_MUTE:
        direction = AudioManager.ADJUST_TOGGLE_MUTE;
        break;
}
```

## platform_frameworks_base\media\java\android\media\WebVttRenderer.java
### Line: 1411
```
switch(absAlignment) {
    case TextTrackCue.ALIGNMENT_LEFT:
        xPosition = cue.mTextPosition;
        break;
    case TextTrackCue.ALIGNMENT_RIGHT:
        xPosition = cue.mTextPosition - size;
        break;
    case TextTrackCue.ALIGNMENT_MIDDLE:
    default:
        xPosition = cue.mTextPosition - size / 2;
        break;
}
```

## platform_frameworks_base\media\mca\filterfw\java\android\filterfw\core\SimpleFrame.java
### Line: 51
```
switch(baseType) {
    case FrameFormat.TYPE_BYTE:
        mObject = new byte[count];
        break;
    case FrameFormat.TYPE_INT16:
        mObject = new short[count];
        break;
    case FrameFormat.TYPE_INT32:
        mObject = new int[count];
        break;
    case FrameFormat.TYPE_FLOAT:
        mObject = new float[count];
        break;
    case FrameFormat.TYPE_DOUBLE:
        mObject = new double[count];
        break;
    default:
        mObject = null;
        break;
}
```

## platform_frameworks_base\media\mca\filterpacks\java\android\filterpacks\imageproc\ImageCombineFilter.java
### Line: 108
```
switch(target) {
    case FrameFormat.TARGET_NATIVE:
        mProgram = getNativeProgram(context);
        break;
    case FrameFormat.TARGET_GPU:
        mProgram = getShaderProgram(context);
        break;
    default:
        mProgram = null;
        break;
}
```

## platform_frameworks_base\media\mca\filterpacks\java\android\filterpacks\imageproc\SimpleImageFilter.java
### Line: 86
```
switch(target) {
    case FrameFormat.TARGET_NATIVE:
        mProgram = getNativeProgram(context);
        break;
    case FrameFormat.TARGET_GPU:
        mProgram = getShaderProgram(context);
        break;
    default:
        mProgram = null;
        break;
}
```

## platform_frameworks_base\media\tests\MediaFrameworkTest\src\com\android\mediaframeworktest\helpers\StaticMetadata.java
### Line: 362
```
switch(mode) {
    case CameraMetadata.CONTROL_AF_MODE_AUTO:
    case CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_PICTURE:
    case CameraMetadata.CONTROL_AF_MODE_CONTINUOUS_VIDEO:
    case CameraMetadata.CONTROL_AF_MODE_MACRO:
        hasFocuser = true;
        break loop;
}
```

## platform_frameworks_base\media\tests\MediaFrameworkTest\src\com\android\mediaframeworktest\stress\Camera2ReprocessCaptureTest.java
### Line: 1124
```
switch(image.getFormat()) {
    case ImageFormat.JPEG:
        filename += ".jpg";
        break;
    case ImageFormat.NV16:
    case ImageFormat.NV21:
    case ImageFormat.YUV_420_888:
        filename += ".yuv";
        break;
    default:
        filename += "." + image.getFormat();
        break;
}
```

## platform_frameworks_base\media\tests\NativeMidiDemo\java\com\example\android\nativemididemo\TouchableScrollView.java
### Line: 21
```
switch(event.getAction()) {
    case MotionEvent.ACTION_DOWN:
        isTouched = true;
        break;
    case MotionEvent.ACTION_CANCEL:
    case MotionEvent.ACTION_UP:
        isTouched = false;
        break;
}
```

## platform_frameworks_base\packages\CarrierDefaultApp\src\com\android\carrierdefaultapp\ProvisionObserver.java
### Line: 95
```
switch(intent.getAction()) {
    case TelephonyIntents.ACTION_CARRIER_SIGNAL_REDIRECTED:
        jobId = PROVISION_OBSERVER_REEVALUATION_JOB_ID;
        break;
    default:
        return false;
}
```

## platform_frameworks_base\packages\SettingsLib\src\com\android\settingslib\bluetooth\A2dpProfile.java
### Line: 252
```
switch(codecType) {
    case BluetoothCodecConfig.SOURCE_CODEC_TYPE_SBC:
        index = 1;
        break;
    case BluetoothCodecConfig.SOURCE_CODEC_TYPE_AAC:
        index = 2;
        break;
    case BluetoothCodecConfig.SOURCE_CODEC_TYPE_APTX:
        index = 3;
        break;
    case BluetoothCodecConfig.SOURCE_CODEC_TYPE_APTX_HD:
        index = 4;
        break;
    case BluetoothCodecConfig.SOURCE_CODEC_TYPE_LDAC:
        index = 5;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\keyguard\CarrierText.java
### Line: 326
```
switch(status) {
    case Normal:
        carrierText = text;
        break;
    case SimNotReady:
        // Null is reserved for denoting missing, in this case we have nothing to display.
        // nothing to display yet.
        carrierText = "";
        break;
    case NetworkLocked:
        carrierText = makeCarrierStringOnEmergencyCapable(mContext.getText(R.string.keyguard_network_locked_message), text);
        break;
    case SimMissing:
        carrierText = null;
        break;
    case SimPermDisabled:
        carrierText = makeCarrierStringOnEmergencyCapable(getContext().getText(R.string.keyguard_permanent_disabled_sim_message_short), text);
        break;
    case SimMissingLocked:
        carrierText = null;
        break;
    case SimLocked:
        carrierText = makeCarrierStringOnEmergencyCapable(getContext().getText(R.string.keyguard_sim_locked_message), text);
        break;
    case SimPukLocked:
        carrierText = makeCarrierStringOnEmergencyCapable(getContext().getText(R.string.keyguard_sim_puk_locked_message), text);
        break;
    case SimIoError:
        carrierText = makeCarrierStringOnEmergencyCapable(getContext().getText(R.string.keyguard_sim_error_message_short), text);
        break;
    case SimUnknown:
        carrierText = null;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\keyguard\CarrierText.java
### Line: 448
```
switch(status) {
    case NetworkLocked:
        carrierHelpTextId = R.string.keyguard_instructions_when_pattern_disabled;
        break;
    case SimMissing:
        carrierHelpTextId = R.string.keyguard_missing_sim_instructions_long;
        break;
    case SimPermDisabled:
        carrierHelpTextId = R.string.keyguard_permanent_disabled_sim_instructions;
        break;
    case SimMissingLocked:
        carrierHelpTextId = R.string.keyguard_missing_sim_instructions;
        break;
    case Normal:
    case SimLocked:
    case SimPukLocked:
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\keyguard\KeyguardSecurityContainer.java
### Line: 191
```
switch(mSecurityModel.getSecurityMode(userId)) {
    case Pattern:
        messageId = R.string.kg_too_many_failed_pattern_attempts_dialog_message;
        break;
    case PIN:
        messageId = R.string.kg_too_many_failed_pin_attempts_dialog_message;
        break;
    case Password:
        messageId = R.string.kg_too_many_failed_password_attempts_dialog_message;
        break;
    // These don't have timeout dialogs.
    case Invalid:
    case None:
    case SimPin:
    case SimPuk:
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\keyguard\KeyguardSecurityContainer.java
### Line: 219
```
switch(userType) {
    case USER_TYPE_PRIMARY:
        message = mContext.getString(R.string.kg_failed_attempts_almost_at_wipe, attempts, remaining);
        break;
    case USER_TYPE_SECONDARY_USER:
        message = mContext.getString(R.string.kg_failed_attempts_almost_at_erase_user, attempts, remaining);
        break;
    case USER_TYPE_WORK_PROFILE:
        message = mContext.getString(R.string.kg_failed_attempts_almost_at_erase_profile, attempts, remaining);
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\keyguard\KeyguardSecurityContainer.java
### Line: 238
```
switch(userType) {
    case USER_TYPE_PRIMARY:
        message = mContext.getString(R.string.kg_failed_attempts_now_wiping, attempts);
        break;
    case USER_TYPE_SECONDARY_USER:
        message = mContext.getString(R.string.kg_failed_attempts_now_erasing_user, attempts);
        break;
    case USER_TYPE_WORK_PROFILE:
        message = mContext.getString(R.string.kg_failed_attempts_now_erasing_profile, attempts);
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\egg\MLand.java
### Line: 457
```
switch(mScene) {
    case SCENE_ZRH:
        s = new Mountain(getContext());
        break;
    case SCENE_TX:
        s = new Cactus(getContext());
        break;
    case SCENE_CITY:
    default:
        s = new Building(getContext());
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\HardwareUiLayout.java
### Line: 260
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.CENTER_HORIZONTAL:
        retGravity |= Gravity.CENTER_VERTICAL;
        break;
    case Gravity.RIGHT:
        retGravity |= Gravity.BOTTOM;
        break;
    case Gravity.LEFT:
    default:
        retGravity |= Gravity.TOP;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\HardwareUiLayout.java
### Line: 273
```
switch(verticalGravity) {
    case Gravity.CENTER_VERTICAL:
        retGravity |= Gravity.CENTER_HORIZONTAL;
        break;
    case Gravity.BOTTOM:
        retGravity |= Gravity.LEFT;
        break;
    case Gravity.TOP:
    default:
        retGravity |= Gravity.RIGHT;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\HardwareUiLayout.java
### Line: 313
```
switch(absoluteGravity & Gravity.HORIZONTAL_GRAVITY_MASK) {
    case Gravity.CENTER_HORIZONTAL:
        retGravity |= Gravity.CENTER_VERTICAL;
        break;
    case Gravity.RIGHT:
        retGravity |= Gravity.TOP;
        break;
    case Gravity.LEFT:
    default:
        retGravity |= Gravity.BOTTOM;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\HardwareUiLayout.java
### Line: 326
```
switch(verticalGravity) {
    case Gravity.CENTER_VERTICAL:
        retGravity |= Gravity.CENTER_HORIZONTAL;
        break;
    case Gravity.BOTTOM:
        retGravity |= Gravity.RIGHT;
        break;
    case Gravity.TOP:
    default:
        retGravity |= Gravity.LEFT;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\ResizingSpace.java
### Line: 83
```
switch(specMode) {
    case MeasureSpec.UNSPECIFIED:
        result = size;
        break;
    case MeasureSpec.AT_MOST:
        result = Math.min(size, specSize);
        break;
    case MeasureSpec.EXACTLY:
        result = specSize;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\statusbar\KeyguardIndicationController.java
### Line: 398
```
switch(mChargingSpeed) {
    case KeyguardUpdateMonitor.BatteryStatus.CHARGING_FAST:
        chargingId = hasChargingTime ? R.string.keyguard_indication_charging_time_fast : R.string.keyguard_plugged_in_charging_fast;
        break;
    case KeyguardUpdateMonitor.BatteryStatus.CHARGING_SLOWLY:
        chargingId = hasChargingTime ? R.string.keyguard_indication_charging_time_slowly : R.string.keyguard_plugged_in_charging_slowly;
        break;
    default:
        chargingId = hasChargingTime ? R.string.keyguard_indication_charging_time : R.string.keyguard_plugged_in;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\statusbar\phone\NavigationBarGestureHelper.java
### Line: 294
```
switch(key) {
    case KEY_DOCK_WINDOW_GESTURE:
        mDockWindowEnabled = newValue != null && (Integer.parseInt(newValue) != 0);
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\usb\StorageNotification.java
### Line: 293
```
switch(vol.getState()) {
    case VolumeInfo.STATE_UNMOUNTED:
        notif = onVolumeUnmounted(vol);
        break;
    case VolumeInfo.STATE_CHECKING:
        notif = onVolumeChecking(vol);
        break;
    case VolumeInfo.STATE_MOUNTED:
    case VolumeInfo.STATE_MOUNTED_READ_ONLY:
        notif = onVolumeMounted(vol);
        break;
    case VolumeInfo.STATE_FORMATTING:
        notif = onVolumeFormatting(vol);
        break;
    case VolumeInfo.STATE_EJECTING:
        notif = onVolumeEjecting(vol);
        break;
    case VolumeInfo.STATE_UNMOUNTABLE:
        notif = onVolumeUnmountable(vol);
        break;
    case VolumeInfo.STATE_REMOVED:
        notif = onVolumeRemoved(vol);
        break;
    case VolumeInfo.STATE_BAD_REMOVAL:
        notif = onVolumeBadRemoval(vol);
        break;
    default:
        notif = null;
        break;
}
```

## platform_frameworks_base\packages\SystemUI\src\com\android\systemui\volume\ZenModePanel.java
### Line: 751
```
switch(zen) {
    case Global.ZEN_MODE_IMPORTANT_INTERRUPTIONS:
        modeText = mContext.getString(R.string.interruption_level_priority);
        break;
    case Global.ZEN_MODE_NO_INTERRUPTIONS:
        modeText = mContext.getString(R.string.interruption_level_none);
        break;
    case Global.ZEN_MODE_ALARMS:
        modeText = mContext.getString(R.string.interruption_level_alarms);
        break;
    default:
        return;
}
```

## platform_frameworks_base\packages\WallpaperCropper\src\com\android\gallery3d\glrenderer\GLES20Canvas.java
### Line: 885
```
switch(status) {
    case GLES20.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT:
        msg = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
        break;
    case GLES20.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS:
        msg = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
        break;
    case GLES20.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT:
        msg = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
        break;
    case GLES20.GL_FRAMEBUFFER_UNSUPPORTED:
        msg = "GL_FRAMEBUFFER_UNSUPPORTED";
        break;
}
```

## platform_frameworks_base\rs\java\android\renderscript\Element.java
### Line: 1249
```
switch(dk) {
    case PIXEL_LA:
        size = 2;
        break;
    case PIXEL_RGB:
        size = 3;
        break;
    case PIXEL_RGBA:
        size = 4;
        break;
    case PIXEL_DEPTH:
        size = 2;
        break;
}
```

## platform_frameworks_base\rs\java\android\renderscript\ProgramFragmentFixedFunction.java
### Line: 191
```
switch(mSlots[i].format) {
    case ALPHA:
        mShader += "  col.a = texture2D(UNI_Tex0, t0).a;\n";
        break;
    case LUMINANCE_ALPHA:
        mShader += "  col.rgba = texture2D(UNI_Tex0, t0).rgba;\n";
        break;
    case RGB:
        mShader += "  col.rgb = texture2D(UNI_Tex0, t0).rgb;\n";
        break;
    case RGBA:
        mShader += "  col.rgba = texture2D(UNI_Tex0, t0).rgba;\n";
        break;
}
```

## platform_frameworks_base\rs\java\android\renderscript\ProgramFragmentFixedFunction.java
### Line: 207
```
switch(mSlots[i].format) {
    case ALPHA:
        mShader += "  col.a *= texture2D(UNI_Tex0, t0).a;\n";
        break;
    case LUMINANCE_ALPHA:
        mShader += "  col.rgba *= texture2D(UNI_Tex0, t0).rgba;\n";
        break;
    case RGB:
        mShader += "  col.rgb *= texture2D(UNI_Tex0, t0).rgb;\n";
        break;
    case RGBA:
        mShader += "  col.rgba *= texture2D(UNI_Tex0, t0).rgba;\n";
        break;
}
```

## platform_frameworks_base\services\accessibility\java\com\android\server\accessibility\FingerprintGestureDispatcher.java
### Line: 145
```
switch(fingerprintKeyCode) {
    case KeyEvent.KEYCODE_SYSTEM_NAVIGATION_UP:
        idForFingerprintGestureManager = FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_UP;
        break;
    case KeyEvent.KEYCODE_SYSTEM_NAVIGATION_DOWN:
        idForFingerprintGestureManager = FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_DOWN;
        break;
    case KeyEvent.KEYCODE_SYSTEM_NAVIGATION_RIGHT:
        idForFingerprintGestureManager = FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_RIGHT;
        break;
    case KeyEvent.KEYCODE_SYSTEM_NAVIGATION_LEFT:
        idForFingerprintGestureManager = FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_LEFT;
        break;
    default:
        return false;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 21238
```
switch(UserHandle.getAppId(callingUid)) {
    case ROOT_UID:
    case SYSTEM_UID:
    case PHONE_UID:
    case BLUETOOTH_UID:
    case NFC_UID:
    case SE_UID:
    case NETWORK_STACK_UID:
        isCallerSystem = true;
        break;
    default:
        isCallerSystem = (callerApp != null) && callerApp.persistent;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 18134
```
switch(r.setSchedGroup) {
    case ProcessList.SCHED_GROUP_BACKGROUND:
        schedGroup = ProcessOomProto.SCHED_GROUP_BACKGROUND;
        break;
    case ProcessList.SCHED_GROUP_DEFAULT:
        schedGroup = ProcessOomProto.SCHED_GROUP_DEFAULT;
        break;
    case ProcessList.SCHED_GROUP_TOP_APP:
        schedGroup = ProcessOomProto.SCHED_GROUP_TOP_APP;
        break;
    case ProcessList.SCHED_GROUP_TOP_APP_BOUND:
        schedGroup = ProcessOomProto.SCHED_GROUP_TOP_APP_BOUND;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 18230
```
switch(r.setSchedGroup) {
    case ProcessList.SCHED_GROUP_BACKGROUND:
        schedGroup = 'B';
        break;
    case ProcessList.SCHED_GROUP_DEFAULT:
        schedGroup = 'F';
        break;
    case ProcessList.SCHED_GROUP_TOP_APP:
        schedGroup = 'T';
        break;
    case ProcessList.SCHED_GROUP_RESTRICTED:
        schedGroup = 'R';
        break;
    default:
        schedGroup = '?';
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 25183
```
switch(memFactor) {
    case ProcessStats.ADJ_MEM_FACTOR_CRITICAL:
        fgTrimLevel = ComponentCallbacks2.TRIM_MEMORY_RUNNING_CRITICAL;
        break;
    case ProcessStats.ADJ_MEM_FACTOR_LOW:
        fgTrimLevel = ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW;
        break;
    default:
        fgTrimLevel = ComponentCallbacks2.TRIM_MEMORY_RUNNING_MODERATE;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 24390
```
switch(app.curSchedGroup) {
    case ProcessList.SCHED_GROUP_BACKGROUND:
        processGroup = THREAD_GROUP_BG_NONINTERACTIVE;
        break;
    case ProcessList.SCHED_GROUP_TOP_APP:
    case ProcessList.SCHED_GROUP_TOP_APP_BOUND:
        processGroup = THREAD_GROUP_TOP_APP;
        break;
    case ProcessList.SCHED_GROUP_RESTRICTED:
        processGroup = THREAD_GROUP_RESTRICTED;
        break;
    default:
        processGroup = THREAD_GROUP_DEFAULT;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerService.java
### Line: 25233
```
switch(curLevel) {
    case ComponentCallbacks2.TRIM_MEMORY_COMPLETE:
        curLevel = ComponentCallbacks2.TRIM_MEMORY_MODERATE;
        break;
    case ComponentCallbacks2.TRIM_MEMORY_MODERATE:
        curLevel = ComponentCallbacks2.TRIM_MEMORY_BACKGROUND;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityManagerShellCommand.java
### Line: 1735
```
switch(res) {
    case ActivityManager.USER_OP_IS_CURRENT:
        txt = " (Can't stop current user)";
        break;
    case ActivityManager.USER_OP_UNKNOWN_USER:
        txt = " (Unknown user " + user + ")";
        break;
    case ActivityManager.USER_OP_ERROR_IS_SYSTEM:
        txt = " (System user cannot be stopped)";
        break;
    case ActivityManager.USER_OP_ERROR_RELATED_USERS_CANNOT_STOP:
        txt = " (Can't stop user " + user + " - one of its related users can't be stopped)";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ActivityStarter.java
### Line: 2350
```
switch(r.info.documentLaunchMode) {
    case ActivityInfo.DOCUMENT_LAUNCH_NONE:
        break;
    case ActivityInfo.DOCUMENT_LAUNCH_INTO_EXISTING:
        launchFlags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        break;
    case ActivityInfo.DOCUMENT_LAUNCH_ALWAYS:
        launchFlags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        break;
    case ActivityInfo.DOCUMENT_LAUNCH_NEVER:
        launchFlags &= ~FLAG_ACTIVITY_MULTIPLE_TASK;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\BroadcastRecord.java
### Line: 183
```
switch(state) {
    case APP_RECEIVE:
        stateStr = " (APP_RECEIVE)";
        break;
    case CALL_IN_RECEIVE:
        stateStr = " (CALL_IN_RECEIVE)";
        break;
    case CALL_DONE_RECEIVE:
        stateStr = " (CALL_DONE_RECEIVE)";
        break;
    case WAITING_SERVICES:
        stateStr = " (WAITING_SERVICES)";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\ProcessList.java
### Line: 362
```
switch(curProcState) {
    case ActivityManager.PROCESS_STATE_PERSISTENT:
        procState = "PER ";
        break;
    case ActivityManager.PROCESS_STATE_PERSISTENT_UI:
        procState = "PERU";
        break;
    case ActivityManager.PROCESS_STATE_TOP:
        procState = "TOP ";
        break;
    case ActivityManager.PROCESS_STATE_FOREGROUND_SERVICE:
        procState = "FGS ";
        break;
    case ActivityManager.PROCESS_STATE_BOUND_FOREGROUND_SERVICE:
        procState = "BFGS";
        break;
    case ActivityManager.PROCESS_STATE_IMPORTANT_FOREGROUND:
        procState = "IMPF";
        break;
    case ActivityManager.PROCESS_STATE_IMPORTANT_BACKGROUND:
        procState = "IMPB";
        break;
    case ActivityManager.PROCESS_STATE_TRANSIENT_BACKGROUND:
        procState = "TRNB";
        break;
    case ActivityManager.PROCESS_STATE_BACKUP:
        procState = "BKUP";
        break;
    case ActivityManager.PROCESS_STATE_SERVICE:
        procState = "SVC ";
        break;
    case ActivityManager.PROCESS_STATE_RECEIVER:
        procState = "RCVR";
        break;
    case ActivityManager.PROCESS_STATE_TOP_SLEEPING:
        procState = "TPSL";
        break;
    case ActivityManager.PROCESS_STATE_HEAVY_WEIGHT:
        procState = "HVY ";
        break;
    case ActivityManager.PROCESS_STATE_HOME:
        procState = "HOME";
        break;
    case ActivityManager.PROCESS_STATE_LAST_ACTIVITY:
        procState = "LAST";
        break;
    case ActivityManager.PROCESS_STATE_CACHED_ACTIVITY:
        procState = "CAC ";
        break;
    case ActivityManager.PROCESS_STATE_CACHED_ACTIVITY_CLIENT:
        procState = "CACC";
        break;
    case ActivityManager.PROCESS_STATE_CACHED_RECENT:
        procState = "CRE ";
        break;
    case ActivityManager.PROCESS_STATE_CACHED_EMPTY:
        procState = "CEM ";
        break;
    case ActivityManager.PROCESS_STATE_NONEXISTENT:
        procState = "NONE";
        break;
    default:
        procState = "??";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\am\TaskRecord.java
### Line: 1471
```
switch(r.lockTaskLaunchMode) {
    case LOCK_TASK_LAUNCH_MODE_DEFAULT:
        mLockTaskAuth = lockTaskController.isPackageWhitelisted(userId, pkg) ? LOCK_TASK_AUTH_WHITELISTED : LOCK_TASK_AUTH_PINNABLE;
        break;
    case LOCK_TASK_LAUNCH_MODE_NEVER:
        mLockTaskAuth = LOCK_TASK_AUTH_DONT_LOCK;
        break;
    case LOCK_TASK_LAUNCH_MODE_ALWAYS:
        mLockTaskAuth = LOCK_TASK_AUTH_LAUNCHABLE_PRIV;
        break;
    case LOCK_TASK_LAUNCH_MODE_IF_WHITELISTED:
        mLockTaskAuth = lockTaskController.isPackageWhitelisted(userId, pkg) ? LOCK_TASK_AUTH_LAUNCHABLE : LOCK_TASK_AUTH_PINNABLE;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\audio\AudioService.java
### Line: 3793
```
switch(btClass.getDeviceClass()) {
    case BluetoothClass.Device.AUDIO_VIDEO_WEARABLE_HEADSET:
    case BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE:
        outDeviceTypes = new int[] { AudioSystem.DEVICE_OUT_BLUETOOTH_SCO_HEADSET };
        break;
    case BluetoothClass.Device.AUDIO_VIDEO_CAR_AUDIO:
        outDeviceTypes = new int[] { AudioSystem.DEVICE_OUT_BLUETOOTH_SCO_CARKIT };
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\connectivity\Tethering.java
### Line: 649
```
switch(id) {
    case SystemMessage.NOTE_TETHER_USB:
        icon = com.android.internal.R.drawable.stat_sys_tether_usb;
        break;
    case SystemMessage.NOTE_TETHER_BLUETOOTH:
        icon = com.android.internal.R.drawable.stat_sys_tether_bluetooth;
        break;
    case SystemMessage.NOTE_TETHER_GENERAL:
    default:
        icon = com.android.internal.R.drawable.stat_sys_tether_general;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\connectivity\Vpn.java
### Line: 1781
```
switch(profile.type) {
    case VpnProfile.TYPE_L2TP_IPSEC_PSK:
        racoon = new String[] { iface, profile.server, "udppsk", profile.ipsecIdentifier, profile.ipsecSecret, "1701" };
        break;
    case VpnProfile.TYPE_L2TP_IPSEC_RSA:
        racoon = new String[] { iface, profile.server, "udprsa", privateKey, userCert, caCert, serverCert, "1701" };
        break;
    case VpnProfile.TYPE_IPSEC_XAUTH_PSK:
        racoon = new String[] { iface, profile.server, "xauthpsk", profile.ipsecIdentifier, profile.ipsecSecret, profile.username, profile.password, "", gateway };
        break;
    case VpnProfile.TYPE_IPSEC_XAUTH_RSA:
        racoon = new String[] { iface, profile.server, "xauthrsa", privateKey, userCert, caCert, serverCert, profile.username, profile.password, "", gateway };
        break;
    case VpnProfile.TYPE_IPSEC_HYBRID_RSA:
        racoon = new String[] { iface, profile.server, "hybridrsa", caCert, serverCert, profile.username, profile.password, "", gateway };
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\connectivity\Vpn.java
### Line: 1816
```
switch(profile.type) {
    case VpnProfile.TYPE_PPTP:
        mtpd = new String[] { iface, "pptp", profile.server, "1723", "name", profile.username, "password", profile.password, "linkname", "vpn", "refuse-eap", "nodefaultroute", "usepeerdns", "idle", "1800", "mtu", "1400", "mru", "1400", (profile.mppe ? "+mppe" : "nomppe") };
        break;
    case VpnProfile.TYPE_L2TP_IPSEC_PSK:
    case VpnProfile.TYPE_L2TP_IPSEC_RSA:
        mtpd = new String[] { iface, "l2tp", profile.server, "1701", profile.l2tpSecret, "name", profile.username, "password", profile.password, "linkname", "vpn", "refuse-eap", "nodefaultroute", "usepeerdns", "idle", "1800", "mtu", "1400", "mru", "1400" };
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\DeviceIdleController.java
### Line: 3291
```
switch(mEventCmds[i]) {
    case EVENT_NORMAL:
        label = "     normal";
        break;
    case EVENT_LIGHT_IDLE:
        label = " light-idle";
        break;
    case EVENT_LIGHT_MAINTENANCE:
        label = "light-maint";
        break;
    case EVENT_DEEP_IDLE:
        label = "  deep-idle";
        break;
    case EVENT_DEEP_MAINTENANCE:
        label = " deep-maint";
        break;
    default:
        label = "         ??";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\hdmi\HdmiCecController.java
### Line: 415
```
switch(strategy) {
    case Constants.POLL_STRATEGY_SYSTEM_AUDIO:
        pickPredicate = mSystemAudioAddressPredicate;
        break;
    case Constants.POLL_STRATEGY_REMOTES_DEVICES:
    default:
        // The default is POLL_STRATEGY_REMOTES_DEVICES.
        pickPredicate = mRemoteDeviceAddressPredicate;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\hdmi\HdmiControlService.java
### Line: 505
```
switch(initiatedBy) {
    case INITIATED_BY_BOOT_UP:
        reason = HdmiControlManager.CONTROL_STATE_CHANGED_REASON_START;
        break;
    case INITIATED_BY_ENABLE_CEC:
        reason = HdmiControlManager.CONTROL_STATE_CHANGED_REASON_SETTING;
        break;
    case INITIATED_BY_SCREEN_ON:
    case INITIATED_BY_WAKE_UP_MESSAGE:
        reason = HdmiControlManager.CONTROL_STATE_CHANGED_REASON_WAKEUP;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\InputMethodManagerService.java
### Line: 2304
```
switch(backDisposition) {
    case InputMethodService.BACK_DISPOSITION_WILL_DISMISS:
        dismissImeOnBackKeyPressed = true;
        break;
    case InputMethodService.BACK_DISPOSITION_WILL_NOT_DISMISS:
        dismissImeOnBackKeyPressed = false;
        break;
    default:
    case InputMethodService.BACK_DISPOSITION_DEFAULT:
        dismissImeOnBackKeyPressed = ((vis & InputMethodService.IME_VISIBLE) != 0);
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\IntentResolver.java
### Line: 805
```
switch(match) {
    case IntentFilter.NO_MATCH_ACTION:
        reason = "action";
        break;
    case IntentFilter.NO_MATCH_CATEGORY:
        reason = "category";
        break;
    case IntentFilter.NO_MATCH_DATA:
        reason = "data";
        break;
    case IntentFilter.NO_MATCH_TYPE:
        reason = "type";
        break;
    default:
        reason = "unknown reason";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\job\JobPackageTracker.java
### Line: 586
```
switch(cmd) {
    case EVENT_START_JOB:
        label = "  START";
        break;
    case EVENT_STOP_JOB:
        label = "   STOP";
        break;
    case EVENT_START_PERIODIC_JOB:
        label = "START-P";
        break;
    case EVENT_STOP_PERIODIC_JOB:
        label = " STOP-P";
        break;
    default:
        label = "     ??";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\job\JobSchedulerService.java
### Line: 2104
```
switch(memLevel) {
    case ProcessStats.ADJ_MEM_FACTOR_MODERATE:
        mMaxActiveJobs = mConstants.BG_MODERATE_JOB_COUNT;
        break;
    case ProcessStats.ADJ_MEM_FACTOR_LOW:
        mMaxActiveJobs = mConstants.BG_LOW_JOB_COUNT;
        break;
    case ProcessStats.ADJ_MEM_FACTOR_CRITICAL:
        mMaxActiveJobs = mConstants.BG_CRITICAL_JOB_COUNT;
        break;
    default:
        mMaxActiveJobs = mConstants.BG_NORMAL_JOB_COUNT;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\job\JobServiceContext.java
### Line: 816
```
switch(mVerb) {
    case VERB_EXECUTING:
        timeoutMillis = EXECUTING_TIMESLICE_MILLIS;
        break;
    case VERB_BINDING:
        timeoutMillis = OP_BIND_TIMEOUT_MILLIS;
        break;
    default:
        timeoutMillis = OP_TIMEOUT_MILLIS;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\location\GnssLocationProvider.java
### Line: 637
```
switch(result.gpsMode) {
    case PowerManager.LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF:
        // If we are in battery saver mode and the screen is off, disable GPS.
        disableGps |= result.batterySaverEnabled && !mPowerManager.isInteractive();
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\location\GnssLocationProvider.java
### Line: 1508
```
switch(mPositionMode) {
    case GPS_POSITION_MODE_STANDALONE:
        mode = "standalone";
        break;
    case GPS_POSITION_MODE_MS_ASSISTED:
        mode = "MS_ASSISTED";
        break;
    case GPS_POSITION_MODE_MS_BASED:
        mode = "MS_BASED";
        break;
    default:
        mode = "unknown";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\net\NetworkPolicyManagerService.java
### Line: 1332
```
switch(policy.template.getMatchRule()) {
    case MATCH_MOBILE:
        title = res.getText(R.string.data_usage_mobile_limit_title);
        break;
    case MATCH_WIFI:
        title = res.getText(R.string.data_usage_wifi_limit_title);
        break;
    default:
        return;
}
```

## platform_frameworks_base\services\core\java\com\android\server\net\NetworkPolicyManagerService.java
### Line: 1353
```
switch(policy.template.getMatchRule()) {
    case MATCH_MOBILE:
        title = res.getText(R.string.data_usage_mobile_limit_snoozed_title);
        break;
    case MATCH_WIFI:
        title = res.getText(R.string.data_usage_wifi_limit_snoozed_title);
        break;
    default:
        return;
}
```

## platform_frameworks_base\services\core\java\com\android\server\notification\NotificationRecord.java
### Line: 331
```
switch(n.priority) {
    case Notification.PRIORITY_MIN:
        requestedImportance = IMPORTANCE_MIN;
        break;
    case Notification.PRIORITY_LOW:
        requestedImportance = IMPORTANCE_LOW;
        break;
    case Notification.PRIORITY_DEFAULT:
        requestedImportance = IMPORTANCE_DEFAULT;
        break;
    case Notification.PRIORITY_HIGH:
    case Notification.PRIORITY_MAX:
        requestedImportance = IMPORTANCE_HIGH;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\om\OverlayManagerShellCommand.java
### Line: 128
```
switch(oi.state) {
    case OverlayInfo.STATE_ENABLED_STATIC:
    case OverlayInfo.STATE_ENABLED:
        status = "[x]";
        break;
    case OverlayInfo.STATE_DISABLED:
        status = "[ ]";
        break;
    default:
        status = "---";
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\policy\PhoneWindowManager.java
### Line: 8063
```
switch(effectId) {
    case HapticFeedbackConstants.CLOCK_TICK:
    case HapticFeedbackConstants.CONTEXT_CLICK:
        return VibrationEffect.get(VibrationEffect.EFFECT_TICK);
    case HapticFeedbackConstants.KEYBOARD_RELEASE:
    case HapticFeedbackConstants.TEXT_HANDLE_MOVE:
    case HapticFeedbackConstants.VIRTUAL_KEY_RELEASE:
    case HapticFeedbackConstants.ENTRY_BUMP:
    case HapticFeedbackConstants.DRAG_CROSSING:
    case HapticFeedbackConstants.GESTURE_END:
        return VibrationEffect.get(VibrationEffect.EFFECT_TICK, false);
    // == KEYBOARD_PRESS
    case HapticFeedbackConstants.KEYBOARD_TAP:
    case HapticFeedbackConstants.VIRTUAL_KEY:
    case HapticFeedbackConstants.EDGE_RELEASE:
    case HapticFeedbackConstants.CONFIRM:
    case HapticFeedbackConstants.GESTURE_START:
        return VibrationEffect.get(VibrationEffect.EFFECT_CLICK);
    case HapticFeedbackConstants.LONG_PRESS:
    case HapticFeedbackConstants.EDGE_SQUEEZE:
        return VibrationEffect.get(VibrationEffect.EFFECT_HEAVY_CLICK);
    case HapticFeedbackConstants.REJECT:
        return VibrationEffect.get(VibrationEffect.EFFECT_DOUBLE_CLICK);
    case HapticFeedbackConstants.CALENDAR_DATE:
        pattern = mCalendarDateVibePattern;
        break;
    case HapticFeedbackConstants.SAFE_MODE_ENABLED:
        pattern = mSafeModeEnabledVibePattern;
        break;
    default:
        return null;
}
```

## platform_frameworks_base\services\core\java\com\android\server\power\PowerManagerService.java
### Line: 4634
```
switch(screenState) {
    case Display.STATE_UNKNOWN:
    case Display.STATE_OFF:
    case Display.STATE_DOZE:
    case Display.STATE_DOZE_SUSPEND:
    case Display.STATE_ON_SUSPEND:
    case Display.STATE_ON:
    case Display.STATE_VR:
        break;
    default:
        screenState = Display.STATE_UNKNOWN;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\power\PowerManagerService.java
### Line: 1444
```
switch(wakeLock.mFlags & PowerManager.WAKE_LOCK_LEVEL_MASK) {
    case PowerManager.FULL_WAKE_LOCK:
    case PowerManager.SCREEN_BRIGHT_WAKE_LOCK:
    case PowerManager.SCREEN_DIM_WAKE_LOCK:
        numWakeLocksCleared += 1;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\StorageManagerService.java
### Line: 1013
```
switch(value) {
    case "force_on":
        flags |= DiskInfo.FLAG_ADOPTABLE;
        break;
    case "force_off":
        flags &= ~DiskInfo.FLAG_ADOPTABLE;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\tv\TvInputManagerService.java
### Line: 2916
```
switch(deviceInfo.getDevicePowerStatus()) {
    case HdmiControlManager.POWER_STATUS_ON:
        state = INPUT_STATE_CONNECTED;
        break;
    case HdmiControlManager.POWER_STATUS_STANDBY:
    case HdmiControlManager.POWER_STATUS_TRANSIENT_TO_ON:
    case HdmiControlManager.POWER_STATUS_TRANSIENT_TO_STANDBY:
        state = INPUT_STATE_CONNECTED_STANDBY;
        break;
    case HdmiControlManager.POWER_STATUS_UNKNOWN:
    default:
        state = null;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\WiredAccessoryManager.java
### Line: 130
```
switch(mSwitchValues & (SW_HEADPHONE_INSERT_BIT | SW_MICROPHONE_INSERT_BIT | SW_LINEOUT_INSERT_BIT)) {
    case 0:
        headset = 0;
        break;
    case SW_HEADPHONE_INSERT_BIT:
        headset = BIT_HEADSET_NO_MIC;
        break;
    case SW_LINEOUT_INSERT_BIT:
        headset = BIT_LINEOUT;
        break;
    case SW_HEADPHONE_INSERT_BIT | SW_MICROPHONE_INSERT_BIT:
        headset = BIT_HEADSET;
        break;
    case SW_MICROPHONE_INSERT_BIT:
        headset = BIT_HEADSET;
        break;
    default:
        headset = 0;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\wm\AppTransition.java
### Line: 704
```
switch(transit) {
    case TRANSIT_ACTIVITY_OPEN:
    case TRANSIT_ACTIVITY_CLOSE:
        duration = mConfigShortAnimTime;
        break;
    default:
        duration = DEFAULT_APP_TRANSITION_DURATION;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\wm\AppTransition.java
### Line: 935
```
switch(transit) {
    case TRANSIT_ACTIVITY_OPEN:
    case TRANSIT_ACTIVITY_CLOSE:
        duration = mConfigShortAnimTime;
        break;
    default:
        duration = DEFAULT_APP_TRANSITION_DURATION;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\wm\AppTransition.java
### Line: 883
```
switch(transit) {
    case TRANSIT_ACTIVITY_OPEN:
    case TRANSIT_ACTIVITY_CLOSE:
        duration = mConfigShortAnimTime;
        break;
    default:
        duration = DEFAULT_APP_TRANSITION_DURATION;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\wm\WindowStateAnimator.java
### Line: 1381
```
switch(transit) {
    case WindowManagerPolicy.TRANSIT_ENTER:
        attr = com.android.internal.R.styleable.WindowAnimation_windowEnterAnimation;
        break;
    case WindowManagerPolicy.TRANSIT_EXIT:
        attr = com.android.internal.R.styleable.WindowAnimation_windowExitAnimation;
        break;
    case WindowManagerPolicy.TRANSIT_SHOW:
        attr = com.android.internal.R.styleable.WindowAnimation_windowShowAnimation;
        break;
    case WindowManagerPolicy.TRANSIT_HIDE:
        attr = com.android.internal.R.styleable.WindowAnimation_windowHideAnimation;
        break;
}
```

## platform_frameworks_base\services\core\java\com\android\server\wm\WindowSurfacePlacer.java
### Line: 669
```
switch(transit) {
    case TRANSIT_ACTIVITY_OPEN:
    case TRANSIT_TASK_OPEN:
    case TRANSIT_TASK_TO_FRONT:
        transit = TRANSIT_WALLPAPER_INTRA_OPEN;
        break;
    case TRANSIT_ACTIVITY_CLOSE:
    case TRANSIT_TASK_CLOSE:
    case TRANSIT_TASK_TO_BACK:
        transit = TRANSIT_WALLPAPER_INTRA_CLOSE;
        break;
}
```

## platform_frameworks_base\services\voiceinteraction\java\com\android\server\soundtrigger\SoundTriggerHelper.java
### Line: 1369
```
switch(mModelType) {
    case SoundModel.TYPE_GENERIC_SOUND:
        type = "Generic";
        break;
    case SoundModel.TYPE_UNKNOWN:
        type = "Unknown";
        break;
    case SoundModel.TYPE_KEYPHRASE:
        type = "Keyphrase";
        break;
}
```

## platform_frameworks_base\telecomm\java\android\telecom\DisconnectCause.java
### Line: 266
```
switch(mDisconnectCode) {
    case UNKNOWN:
        code = "UNKNOWN";
        break;
    case ERROR:
        code = "ERROR";
        break;
    case LOCAL:
        code = "LOCAL";
        break;
    case REMOTE:
        code = "REMOTE";
        break;
    case CANCELED:
        code = "CANCELED";
        break;
    case MISSED:
        code = "MISSED";
        break;
    case REJECTED:
        code = "REJECTED";
        break;
    case BUSY:
        code = "BUSY";
        break;
    case RESTRICTED:
        code = "RESTRICTED";
        break;
    case OTHER:
        code = "OTHER";
        break;
    case CONNECTION_MANAGER_NOT_SUPPORTED:
        code = "CONNECTION_MANAGER_NOT_SUPPORTED";
        break;
    case CALL_PULLED:
        code = "CALL_PULLED";
        break;
    case ANSWERED_ELSEWHERE:
        code = "ANSWERED_ELSEWHERE";
        break;
    default:
        code = "invalid code: " + mDisconnectCode;
        break;
}
```

## platform_frameworks_base\telephony\java\android\telephony\ims\ImsCallProfile.java
### Line: 641
```
switch(callType) {
    case CALL_TYPE_VT_TX:
        videostate = VideoProfile.STATE_TX_ENABLED;
        break;
    case CALL_TYPE_VT_RX:
        videostate = VideoProfile.STATE_RX_ENABLED;
        break;
    case CALL_TYPE_VT:
        videostate = VideoProfile.STATE_BIDIRECTIONAL;
        break;
    case CALL_TYPE_VOICE:
        videostate = VideoProfile.STATE_AUDIO_ONLY;
        break;
    default:
        videostate = VideoProfile.STATE_AUDIO_ONLY;
        break;
}
```

## platform_frameworks_base\telephony\java\android\telephony\mbms\MbmsUtils.java
### Line: 56
```
switch(serviceAction) {
    case MbmsDownloadSession.MBMS_DOWNLOAD_SERVICE_ACTION:
        metaDataKey = MbmsDownloadSession.MBMS_DOWNLOAD_SERVICE_OVERRIDE_METADATA;
        break;
    case MbmsStreamingSession.MBMS_STREAMING_SERVICE_ACTION:
        metaDataKey = MbmsStreamingSession.MBMS_STREAMING_SERVICE_OVERRIDE_METADATA;
        break;
    case MbmsGroupCallSession.MBMS_GROUP_CALL_SERVICE_ACTION:
        metaDataKey = MbmsGroupCallSession.MBMS_GROUP_CALL_SERVICE_OVERRIDE_METADATA;
        break;
}
```

## platform_frameworks_base\telephony\java\com\android\internal\telephony\cdma\SmsMessage.java
### Line: 987
```
switch(dtmfDigit) {
    // 'D'
    case 0:
        asciiDigit = 68;
        break;
    // '1'
    case 1:
        asciiDigit = 49;
        break;
    // '2'
    case 2:
        asciiDigit = 50;
        break;
    // '3'
    case 3:
        asciiDigit = 51;
        break;
    // '4'
    case 4:
        asciiDigit = 52;
        break;
    // '5'
    case 5:
        asciiDigit = 53;
        break;
    // '6'
    case 6:
        asciiDigit = 54;
        break;
    // '7'
    case 7:
        asciiDigit = 55;
        break;
    // '8'
    case 8:
        asciiDigit = 56;
        break;
    // '9'
    case 9:
        asciiDigit = 57;
        break;
    // '0'
    case 10:
        asciiDigit = 48;
        break;
    // '*'
    case 11:
        asciiDigit = 42;
        break;
    // '#'
    case 12:
        asciiDigit = 35;
        break;
    // 'A'
    case 13:
        asciiDigit = 65;
        break;
    // 'B'
    case 14:
        asciiDigit = 66;
        break;
    // 'C'
    case 15:
        asciiDigit = 67;
        break;
    default:
        // Invalid DTMF code
        asciiDigit = 32;
        break;
}
```

## platform_frameworks_base\telephony\java\com\android\internal\telephony\gsm\GsmSmsCbMessage.java
### Line: 190
```
switch((dataCodingScheme & 0x0c) >> 2) {
    case 0x01:
        encoding = SmsConstants.ENCODING_8BIT;
        break;
    case 0x02:
        encoding = SmsConstants.ENCODING_16BIT;
        break;
    case 0x00:
    default:
        encoding = SmsConstants.ENCODING_7BIT;
        break;
}
```

## platform_frameworks_base\telephony\java\com\android\internal\telephony\gsm\SmsMessage.java
### Line: 1436
```
switch(mDataCodingScheme & 0x3) {
    case 0:
        messageClass = MessageClass.CLASS_0;
        break;
    case 1:
        messageClass = MessageClass.CLASS_1;
        break;
    case 2:
        messageClass = MessageClass.CLASS_2;
        break;
    case 3:
        messageClass = MessageClass.CLASS_3;
        break;
}
```

## platform_frameworks_base\telephony\java\com\android\internal\telephony\uicc\IccUtils.java
### Line: 576
```
switch(bits) {
    case 1:
        mask = 0x01;
        break;
    case 2:
        mask = 0x03;
        break;
    case 4:
        mask = 0x0F;
        break;
    case 8:
        mask = 0xFF;
        break;
}
```

## platform_frameworks_base\tests\Camera2Tests\SmartCamera\SimpleCamera\src\androidx\media\filterfw\BackingStore.java
### Line: 810
```
switch(frameType.getElementId()) {
    case FrameType.ELEMENT_RGBA8888:
        element = Element.RGBA_8888(mRenderScript);
        break;
    case FrameType.ELEMENT_FLOAT32:
        element = Element.F32(mRenderScript);
        break;
}
```

## platform_frameworks_base\tests\Camera2Tests\SmartCamera\SimpleCamera\src\androidx\media\filterfw\CameraStreamer.java
### Line: 636
```
switch(orientation) {
    case 0:
        mTargetCoords = new float[] { 1f, 0f, 0f, 0f, 1f, 1f, 0f, 1f };
        break;
    case 90:
        mTargetCoords = new float[] { 0f, 0f, 0f, 1f, 1f, 0f, 1f, 1f };
        break;
    case 180:
        mTargetCoords = new float[] { 0f, 1f, 1f, 1f, 0f, 0f, 1f, 0f };
        break;
    case 270:
        mTargetCoords = new float[] { 1f, 1f, 1f, 0f, 0f, 1f, 0f, 0f };
        break;
}
```

## platform_frameworks_base\tests\Camera2Tests\SmartCamera\SimpleCamera\src\androidx\media\filterfw\CameraStreamer.java
### Line: 651
```
switch(orientation) {
    case 0:
        mTargetCoords = new float[] { 0f, 0f, 1f, 0f, 0f, 1f, 1f, 1f };
        break;
    case 90:
        mTargetCoords = new float[] { 1f, 0f, 1f, 1f, 0f, 0f, 0f, 1f };
        break;
    case 180:
        mTargetCoords = new float[] { 1f, 1f, 0f, 1f, 1f, 0f, 0f, 0f };
        break;
    case 270:
        mTargetCoords = new float[] { 0f, 1f, 0f, 0f, 1f, 1f, 1f, 0f };
        break;
}
```

## platform_frameworks_base\tests\HwAccelerationTest\src\com\android\test\hwui\GetBitmapSurfaceViewActivity.java
### Line: 102
```
switch(rotation) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## platform_frameworks_base\tests\HwAccelerationTest\src\com\android\test\hwui\TextureViewActivity.java
### Line: 128
```
switch(rotation) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## platform_frameworks_base\tests\JankBench\app\src\main\java\com\android\benchmark\ui\automation\Interaction.java
### Line: 85
```
switch(mType) {
    case Type.FLING:
        mEvents = createInterpolatedEventList(mXPositions, mYPositions, mDuration);
        break;
    case Type.PINCH:
        break;
    case Type.TAP:
        mEvents = createInterpolatedEventList(mXPositions, mYPositions, mDuration);
        break;
}
```

## platform_frameworks_base\tests\LocationTracker\src\com\android\locationtracker\TrackerService.java
### Line: 414
```
switch(state) {
    case WifiManager.WIFI_STATE_DISABLED:
        stateString = "disabled";
        break;
    case WifiManager.WIFI_STATE_DISABLING:
        stateString = "disabling";
        break;
    case WifiManager.WIFI_STATE_ENABLED:
        stateString = "enabled";
        break;
    case WifiManager.WIFI_STATE_ENABLING:
        stateString = "enabling";
        break;
}
```

## platform_frameworks_base\tests\LockTaskTests\src\com\google\android\example\locktasktests\MainActivity.java
### Line: 57
```
switch(v.getId()) {
    case R.id.button_default:
        activity = LockDefaultActivity.class;
        break;
    case R.id.button_never:
        activity = LockTaskNeverActivity.class;
        break;
    case R.id.button_whitelist:
        activity = LockWhitelistedActivity.class;
        break;
    case R.id.button_always:
        activity = LockAtLaunchActivity.class;
        break;
}
```

## platform_frameworks_base\tests\net\java\com\android\server\connectivity\PermissionMonitorTest.java
### Line: 110
```
switch(partition) {
    case PARTITION_OEM:
        privateFlags = PRIVATE_FLAG_OEM;
        break;
    case PARTITION_PRODUCT:
        privateFlags = PRIVATE_FLAG_PRODUCT;
        break;
    case PARTITION_VENDOR:
        privateFlags = PRIVATE_FLAG_VENDOR;
        break;
}
```

## platform_frameworks_base\tests\OneMedia\src\com\android\onemedia\NotificationHelper.java
### Line: 161
```
switch(state) {
    case PlaybackState.STATE_PLAYING:
        status = "PLAYING: ";
        break;
    case PlaybackState.STATE_PAUSED:
        status = "PAUSED: ";
        break;
    case PlaybackState.STATE_STOPPED:
        status = "STOPPED: ";
        break;
    case PlaybackState.STATE_ERROR:
        status = "ERROR: ";
        break;
    case PlaybackState.STATE_BUFFERING:
        status = "BUFFERING: ";
        break;
    case PlaybackState.STATE_NONE:
    default:
        status = "";
        break;
}
```

## platform_frameworks_base\tests\SmokeTest\tests\src\com\android\smoketest\ProcessErrorsTest.java
### Line: 292
```
switch(entry.condition) {
    case ActivityManager.ProcessErrorStateInfo.CRASHED:
        condition = "a CRASH";
        break;
    case ActivityManager.ProcessErrorStateInfo.NOT_RESPONDING:
        condition = "an ANR";
        break;
    default:
        condition = "an unknown error";
        break;
}
```

## platform_frameworks_base\tests\StatusBar\src\com\android\statusbartest\NotificationBuilderTest.java
### Line: 410
```
// start delay
switch(getRadioChecked(R.id.group_delay)) {
    case R.id.delay_none:
        mStartDelay = 0;
        break;
    case R.id.delay_5:
        mStartDelay = 5000;
        break;
}
```

## platform_frameworks_base\tools\processors\unsupportedappusage\src\android\processor\unsupportedappusage\SignatureBuilder.java
### Line: 198
```
switch(element.getKind()) {
    case METHOD:
        signature = buildMethodSignature((ExecutableElement) element);
        break;
    case CONSTRUCTOR:
        signature = buildConstructorSignature((ExecutableElement) element);
        break;
    case FIELD:
        signature = buildFieldSignature((VariableElement) element);
        break;
    default:
        return null;
}
```

## PocketHub\app\src\main\java\com\github\pockethub\android\ui\issue\IssueDashboardPagerAdapter.java
### Line: 56
```
switch(position) {
    case 0:
        filter = FILTER_SUBSCRIBED;
        break;
    case 1:
        filter = FILTER_ASSIGNED;
        break;
    case 2:
        filter = FILTER_CREATED;
        break;
    case 3:
        filter = FILTER_MENTIONED;
        break;
    default:
        return null;
}
```

## PocketHub\app\src\main\java\com\github\pockethub\android\ui\user\HomePagerAdapter.java
### Line: 64
```
switch(position) {
    case 0:
        fragment = defaultUser ? new UserReceivedNewsFragment() : new OrganizationNewsFragment();
        break;
    case 1:
        fragment = new RepositoryListFragment();
        break;
    case 2:
        fragment = defaultUser ? new MyFollowersFragment() : new MembersFragment();
        break;
    case 3:
        fragment = new MyFollowingFragment();
        break;
}
```

## presto\presto-accumulo\src\test\java\com\facebook\presto\accumulo\AccumuloQueryRunner.java
### Line: 123
```
switch(target) {
    case "customer":
        sql = format("CREATE TABLE %s WITH (index_columns = 'mktsegment') AS SELECT * FROM %s", target, source);
        break;
    case "lineitem":
        sql = format("CREATE TABLE %s WITH (index_columns = 'quantity,discount,returnflag,shipdate,receiptdate,shipinstruct,shipmode') AS SELECT UUID() AS uuid, * FROM %s", target, source);
        break;
    case "orders":
        sql = format("CREATE TABLE %s WITH (index_columns = 'orderdate') AS SELECT * FROM %s", target, source);
        break;
    case "part":
        sql = format("CREATE TABLE %s WITH (index_columns = 'brand,type,size,container') AS SELECT * FROM %s", target, source);
        break;
    case "partsupp":
        sql = format("CREATE TABLE %s WITH (index_columns = 'partkey') AS SELECT UUID() AS uuid, * FROM %s", target, source);
        break;
    case "supplier":
        sql = format("CREATE TABLE %s WITH (index_columns = 'name') AS SELECT * FROM %s", target, source);
        break;
    default:
        sql = format("CREATE TABLE %s AS SELECT * FROM %s", target, source);
        break;
}
```

## presto\presto-main\src\main\java\com\facebook\presto\execution\buffer\LazyOutputBuffer.java
### Line: 159
```
switch(newOutputBuffers.getType()) {
    case PARTITIONED:
        delegate = new PartitionedOutputBuffer(taskInstanceId, state, newOutputBuffers, maxBufferSize, systemMemoryContextSupplier, executor);
        break;
    case BROADCAST:
        delegate = new BroadcastOutputBuffer(taskInstanceId, state, maxBufferSize, systemMemoryContextSupplier, executor);
        break;
    case ARBITRARY:
        delegate = new ArbitraryOutputBuffer(taskInstanceId, state, maxBufferSize, systemMemoryContextSupplier, executor);
        break;
}
```

## presto\presto-main\src\main\java\com\facebook\presto\operator\scalar\DateTimeFunctions.java
### Line: 615
```
switch(c) {
    case 'z':
    case 'Z':
        return true;
    case '\'':
        // '' (two apostrophes) in a pattern denote single apostrophe and here we interpret this as "start quote" + "end quote".
        // This has no impact on method's result value.
        quoted = true;
        break;
}
```

## retrofit\retrofit-converters\gson\src\test\java\retrofit2\converter\gson\GsonConverterFactoryTest.java
### Line: 92
```
switch(jsonReader.nextName()) {
    case "name":
        name = jsonReader.nextString();
        break;
}
```

## retrofit\retrofit-converters\jackson\src\test\java\retrofit2\converter\jackson\JacksonConverterFactoryTest.java
### Line: 93
```
switch(jp.getCurrentName()) {
    case "name":
        name = jp.getValueAsString();
        break;
}
```

## retrofit\retrofit-converters\moshi\src\test\java\retrofit2\converter\moshi\MoshiConverterFactoryTest.java
### Line: 96
```
switch(jsonReader.nextName()) {
    case "name":
        name = jsonReader.nextString();
        break;
}
```

## selenium\java\server\src\org\openqa\selenium\remote\server\handler\interactions\ClickInSession.java
### Line: 39
```
switch(button) {
    // TODO: Use proper enum values for this.
    case 0:
        leftMouseButton = true;
        break;
    case 2:
        leftMouseButton = false;
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\components\camera\CameraUtils.java
### Line: 70
```
switch(rotation) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\components\camera\QuickAttachmentDrawer.java
### Line: 217
```
switch(lp.width) {
    case LayoutParams.WRAP_CONTENT:
        childWidthSpec = MeasureSpec.makeMeasureSpec(widthSize, MeasureSpec.AT_MOST);
        break;
    case LayoutParams.MATCH_PARENT:
        childWidthSpec = MeasureSpec.makeMeasureSpec(widthSize, MeasureSpec.EXACTLY);
        break;
    default:
        childWidthSpec = MeasureSpec.makeMeasureSpec(lp.width, MeasureSpec.EXACTLY);
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\components\camera\QuickAttachmentDrawer.java
### Line: 230
```
switch(lp.height) {
    case LayoutParams.WRAP_CONTENT:
        childHeightSpec = MeasureSpec.makeMeasureSpec(layoutHeight, MeasureSpec.AT_MOST);
        break;
    case LayoutParams.MATCH_PARENT:
        childHeightSpec = MeasureSpec.makeMeasureSpec(layoutHeight, MeasureSpec.EXACTLY);
        break;
    default:
        childHeightSpec = MeasureSpec.makeMeasureSpec(lp.height, MeasureSpec.EXACTLY);
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\components\ImageDivet.java
### Line: 52
```
switch(position) {
    case 0:
        drawable = drawables.getDrawable(0);
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\jobmanager\util\Base64.java
### Line: 521
```
switch(len % 3) {
    case 0:
        break;
    case 1:
        output_len += 2;
        break;
    case 2:
        output_len += 3;
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\MuteDialog.java
### Line: 33
```
switch(which) {
    case 0:
        muteUntil = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(1);
        break;
    case 1:
        muteUntil = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(2);
        break;
    case 2:
        muteUntil = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1);
        break;
    case 3:
        muteUntil = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7);
        break;
    case 4:
        muteUntil = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(365);
        break;
    default:
        muteUntil = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(1);
        break;
}
```

## Signal-Android\src\org\thoughtcrime\securesms\preferences\widgets\LEDColorListPreference.java
### Line: 85
```
switch(value) {
    case "green":
        color = getContext().getResources().getColor(R.color.green_500);
        break;
    case "red":
        color = getContext().getResources().getColor(R.color.red_500);
        break;
    case "blue":
        color = getContext().getResources().getColor(R.color.blue_500);
        break;
    case "yellow":
        color = getContext().getResources().getColor(R.color.yellow_500);
        break;
    case "cyan":
        color = getContext().getResources().getColor(R.color.cyan_500);
        break;
    case "magenta":
        color = getContext().getResources().getColor(R.color.pink_500);
        break;
    case "white":
        color = getContext().getResources().getColor(R.color.white);
        break;
    default:
        color = getContext().getResources().getColor(R.color.transparent);
        break;
}
```

## SmartRefreshLayout\refresh-header\src\main\java\com\scwang\smartrefresh\header\internal\pathview\PathParser.java
### Line: 92
```
switch(cmd) {
    case 'z':
    case 'Z':
        break;
    case 'm':
    case 'M':
    case 'l':
    case 'L':
    case 't':
    case 'T':
        inc = 2;
        break;
    case 'h':
    case 'H':
    case 'v':
    case 'V':
        inc = 1;
        break;
    case 'c':
    case 'C':
        inc = 6;
        break;
    case 's':
    case 'S':
    case 'q':
    case 'Q':
        inc = 4;
        break;
    case 'a':
    case 'A':
        inc = 7;
        break;
}
```

## spring-framework\spring-core\src\main\java\org\springframework\asm\MethodWriter.java
### Line: 1884
```
switch(numLocalDelta) {
    case -3:
    case -2:
    case -1:
        type = Frame.CHOP_FRAME;
        break;
    case 0:
        type = offsetDelta < 64 ? Frame.SAME_FRAME : Frame.SAME_FRAME_EXTENDED;
        break;
    case 1:
    case 2:
    case 3:
        type = Frame.APPEND_FRAME;
        break;
    default:
        // Keep the FULL_FRAME type.
        break;
}
```

## spring-framework\spring-core\src\main\java\org\springframework\asm\MethodWriter.java
### Line: 1014
```
switch(opcode) {
    case Opcodes.GETSTATIC:
        size = relativeStackSize + (firstDescChar == 'D' || firstDescChar == 'J' ? 2 : 1);
        break;
    case Opcodes.PUTSTATIC:
        size = relativeStackSize + (firstDescChar == 'D' || firstDescChar == 'J' ? -2 : -1);
        break;
    case Opcodes.GETFIELD:
        size = relativeStackSize + (firstDescChar == 'D' || firstDescChar == 'J' ? 1 : 0);
        break;
    case Opcodes.PUTFIELD:
    default:
        size = relativeStackSize + (firstDescChar == 'D' || firstDescChar == 'J' ? -3 : -2);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\audio\Ac3Util.java
### Line: 258
```
switch(// strmtyp
data.readBits(2)) {
    case 0:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE0;
        break;
    case 1:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE1;
        break;
    case 2:
        streamType = SyncFrameInfo.STREAM_TYPE_TYPE2;
        break;
    default:
        streamType = SyncFrameInfo.STREAM_TYPE_UNDEFINED;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\extractor\mp3\VbriSeeker.java
### Line: 71
```
switch(entrySize) {
    case 1:
        segmentSize = frame.readUnsignedByte();
        break;
    case 2:
        segmentSize = frame.readUnsignedShort();
        break;
    case 3:
        segmentSize = frame.readUnsignedInt24();
        break;
    case 4:
        segmentSize = frame.readUnsignedIntToInt();
        break;
    default:
        return null;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\extractor\mp4\AtomParsers.java
### Line: 907
```
switch(layout) {
    case 0:
        stereoMode = C.STEREO_MODE_MONO;
        break;
    case 1:
        stereoMode = C.STEREO_MODE_TOP_BOTTOM;
        break;
    case 2:
        stereoMode = C.STEREO_MODE_LEFT_RIGHT;
        break;
    case 3:
        stereoMode = C.STEREO_MODE_STEREO_MESH;
        break;
    default:
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\extractor\ogg\OpusReader.java
### Line: 107
```
switch(toc & 0x3) {
    case 0:
        frames = 1;
        break;
    case 1:
    case 2:
        frames = 2;
        break;
    default:
        frames = packet[1] & 0x3F;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\extractor\ts\H262Reader.java
### Line: 228
```
switch(aspectRatioCode) {
    case 2:
        pixelWidthHeightRatio = (4 * height) / (float) (3 * width);
        break;
    case 3:
        pixelWidthHeightRatio = (16 * height) / (float) (9 * width);
        break;
    case 4:
        pixelWidthHeightRatio = (121 * height) / (float) (100 * width);
        break;
    default:
        // Do nothing.
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\metadata\scte35\SpliceInfoDecoder.java
### Line: 74
```
switch(spliceCommandType) {
    case TYPE_SPLICE_NULL:
        command = new SpliceNullCommand();
        break;
    case TYPE_SPLICE_SCHEDULE:
        command = SpliceScheduleCommand.parseFromSection(sectionData);
        break;
    case TYPE_SPLICE_INSERT:
        command = SpliceInsertCommand.parseFromSection(sectionData, ptsAdjustment, timestampAdjuster);
        break;
    case TYPE_TIME_SIGNAL:
        command = TimeSignalCommand.parseFromSection(sectionData, ptsAdjustment, timestampAdjuster);
        break;
    case TYPE_PRIVATE_COMMAND:
        command = PrivateCommand.parseFromSection(sectionData, spliceCommandLength, ptsAdjustment);
        break;
    default:
        // Do nothing.
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\text\subrip\SubripDecoder.java
### Line: 184
```
switch(alignmentTag) {
    case ALIGN_BOTTOM_LEFT:
    case ALIGN_MID_LEFT:
    case ALIGN_TOP_LEFT:
        positionAnchor = Cue.ANCHOR_TYPE_START;
        break;
    case ALIGN_BOTTOM_RIGHT:
    case ALIGN_MID_RIGHT:
    case ALIGN_TOP_RIGHT:
        positionAnchor = Cue.ANCHOR_TYPE_END;
        break;
    case ALIGN_BOTTOM_MID:
    case ALIGN_MID_MID:
    case ALIGN_TOP_MID:
    default:
        positionAnchor = Cue.ANCHOR_TYPE_MIDDLE;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\text\subrip\SubripDecoder.java
### Line: 205
```
switch(alignmentTag) {
    case ALIGN_BOTTOM_LEFT:
    case ALIGN_BOTTOM_MID:
    case ALIGN_BOTTOM_RIGHT:
        lineAnchor = Cue.ANCHOR_TYPE_END;
        break;
    case ALIGN_TOP_LEFT:
    case ALIGN_TOP_MID:
    case ALIGN_TOP_RIGHT:
        lineAnchor = Cue.ANCHOR_TYPE_START;
        break;
    case ALIGN_MID_LEFT:
    case ALIGN_MID_MID:
    case ALIGN_MID_RIGHT:
    default:
        lineAnchor = Cue.ANCHOR_TYPE_MIDDLE;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 696
```
switch(unit) {
    case "h":
        offsetSeconds *= 3600;
        break;
    case "m":
        offsetSeconds *= 60;
        break;
    case "s":
        // Do nothing.
        break;
    case "ms":
        offsetSeconds /= 1000;
        break;
    case "f":
        offsetSeconds /= frameAndTickRate.effectiveFrameRate;
        break;
    case "t":
        offsetSeconds /= frameAndTickRate.tickRate;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 487
```
switch(Util.toLowerInvariant(attributeValue)) {
    case TtmlNode.LEFT:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
        break;
    case TtmlNode.START:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
        break;
    case TtmlNode.RIGHT:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
        break;
    case TtmlNode.END:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
        break;
    case TtmlNode.CENTER:
        style = createIfNull(style).setTextAlign(Layout.Alignment.ALIGN_CENTER);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\text\ttml\TtmlDecoder.java
### Line: 506
```
switch(Util.toLowerInvariant(attributeValue)) {
    case TtmlNode.LINETHROUGH:
        style = createIfNull(style).setLinethrough(true);
        break;
    case TtmlNode.NO_LINETHROUGH:
        style = createIfNull(style).setLinethrough(false);
        break;
    case TtmlNode.UNDERLINE:
        style = createIfNull(style).setUnderline(true);
        break;
    case TtmlNode.NO_UNDERLINE:
        style = createIfNull(style).setUnderline(false);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\trackselection\MappingTrackSelector.java
### Line: 162
```
switch(rendererFormatSupport[i][j] & RendererCapabilities.FORMAT_SUPPORT_MASK) {
    case RendererCapabilities.FORMAT_HANDLED:
        return RENDERER_SUPPORT_PLAYABLE_TRACKS;
    case RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES:
        trackRendererSupport = RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS;
        break;
    default:
        trackRendererSupport = RENDERER_SUPPORT_UNSUPPORTED_TRACKS;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\video\MediaCodecVideoRenderer.java
### Line: 1335
```
// https://github.com/google/ExoPlayer/issues/5312.
switch(Util.DEVICE) {
    case "1601":
    case "1713":
    case "1714":
    case "A10-70F":
    case "A1601":
    case "A2016a40":
    case "A7000-a":
    case "A7000plus":
    case "A7010a48":
    case "A7020a48":
    case "AquaPowerM":
    case "ASUS_X00AD_2":
    case "Aura_Note_2":
    case "BLACK-1X":
    case "BRAVIA_ATV2":
    case "BRAVIA_ATV3_4K":
    case "C1":
    case "ComioS1":
    case "CP8676_I02":
    case "CPH1609":
    case "CPY83_I00":
    case "cv1":
    case "cv3":
    case "deb":
    case "E5643":
    case "ELUGA_A3_Pro":
    case "ELUGA_Note":
    case "ELUGA_Prim":
    case "ELUGA_Ray_X":
    case "EverStar_S":
    case "F3111":
    case "F3113":
    case "F3116":
    case "F3211":
    case "F3213":
    case "F3215":
    case "F3311":
    case "flo":
    case "fugu":
    case "GiONEE_CBL7513":
    case "GiONEE_GBL7319":
    case "GIONEE_GBL7360":
    case "GIONEE_SWW1609":
    case "GIONEE_SWW1627":
    case "GIONEE_SWW1631":
    case "GIONEE_WBL5708":
    case "GIONEE_WBL7365":
    case "GIONEE_WBL7519":
    case "griffin":
    case "htc_e56ml_dtul":
    case "hwALE-H":
    case "HWBLN-H":
    case "HWCAM-H":
    case "HWVNS-H":
    case "HWWAS-H":
    case "i9031":
    case "iball8735_9806":
    case "Infinix-X572":
    case "iris60":
    case "itel_S41":
    case "j2xlteins":
    case "JGZ":
    case "K50a40":
    case "kate":
    case "le_x6":
    case "LS-5017":
    case "M5c":
    case "manning":
    case "marino_f":
    case "MEIZU_M5":
    case "mh":
    case "mido":
    case "MX6":
    case "namath":
    case "nicklaus_f":
    case "NX541J":
    case "NX573J":
    case "OnePlus5T":
    case "p212":
    case "P681":
    case "P85":
    case "panell_d":
    case "panell_dl":
    case "panell_ds":
    case "panell_dt":
    case "PB2-670M":
    case "PGN528":
    case "PGN610":
    case "PGN611":
    case "Phantom6":
    case "Pixi4-7_3G":
    case "Pixi5-10_4G":
    case "PLE":
    case "PRO7S":
    case "Q350":
    case "Q4260":
    case "Q427":
    case "Q4310":
    case "Q5":
    case "QM16XE_U":
    case "QX1":
    case "santoni":
    case "Slate_Pro":
    case "SVP-DTV15":
    case "s905x018":
    case "taido_row":
    case "TB3-730F":
    case "TB3-730X":
    case "TB3-850F":
    case "TB3-850M":
    case "tcl_eu":
    case "V1":
    case "V23GB":
    case "V5":
    case "vernee_M5":
    case "watson":
    case "whyred":
    case "woods_f":
    case "woods_fn":
    case "X3_HK":
    case "XE2X":
    case "XT1663":
    case "Z12_PRO":
    case "Z80":
        deviceNeedsSetOutputSurfaceWorkaround = true;
        break;
    default:
        // Do nothing.
        break;
}
```

## Telegram\TMessagesProj\src\main\java\com\google\android\exoplayer2\video\MediaCodecVideoRenderer.java
### Line: 1466
```
switch(Util.MODEL) {
    case "AFTA":
    case "AFTN":
        deviceNeedsSetOutputSurfaceWorkaround = true;
        break;
    default:
        // Do nothing.
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\AndroidUtilities.java
### Line: 1697
```
switch(type) {
    case "image":
        contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        break;
    case "video":
        contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        break;
    case "audio":
        contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\Bitmaps.java
### Line: 281
```
switch(config) {
    case RGB_565:
        newConfig = Bitmap.Config.ARGB_8888;
        break;
    case ALPHA_8:
        newConfig = Bitmap.Config.ALPHA_8;
        break;
    case ARGB_4444:
    case ARGB_8888:
    default:
        newConfig = Bitmap.Config.ARGB_8888;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\camera\CameraSession.java
### Line: 463
```
switch(rotation) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\camera\CameraSession.java
### Line: 200
```
switch(temp) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\camera\CameraSession.java
### Line: 307
```
switch(temp) {
    case Surface.ROTATION_0:
        degrees = 0;
        break;
    case Surface.ROTATION_90:
        degrees = 90;
        break;
    case Surface.ROTATION_180:
        degrees = 180;
        break;
    case Surface.ROTATION_270:
        degrees = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\ChatObject.java
### Line: 111
```
switch(action) {
    case ACTION_PIN:
        value = chat.admin_rights.pin_messages;
        break;
    case ACTION_CHANGE_INFO:
        value = chat.admin_rights.change_info;
        break;
    case ACTION_INVITE:
        value = chat.admin_rights.invite_users;
        break;
    case ACTION_ADD_ADMINS:
        value = chat.admin_rights.add_admins;
        break;
    case ACTION_POST:
        value = chat.admin_rights.post_messages;
        break;
    case ACTION_EDIT_MESSAGES:
        value = chat.admin_rights.edit_messages;
        break;
    case ACTION_DELETE_MESSAGES:
        value = chat.admin_rights.delete_messages;
        break;
    case ACTION_BLOCK_USERS:
        value = chat.admin_rights.ban_users;
        break;
    default:
        value = false;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\FileLoader.java
### Line: 1060
```
switch(document.mime_type) {
    case "video/mp4":
        docExt = ".mp4";
        break;
    case "audio/ogg":
        docExt = ".ogg";
        break;
    default:
        docExt = "";
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\FileLoadOperation.java
### Line: 240
```
switch(documentLocation.mime_type) {
    case "video/mp4":
        ext = ".mp4";
        break;
    case "audio/ogg":
        ext = ".ogg";
        break;
    default:
        ext = "";
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\ImageLoader.java
### Line: 1133
```
switch(attribute) {
    case ExifInterface.ORIENTATION_ROTATE_90:
        orientation = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
        orientation = 180;
        break;
    case ExifInterface.ORIENTATION_ROTATE_270:
        orientation = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\SharedConfig.java
### Line: 234
```
switch(SharedConfig.badPasscodeTries) {
    case 3:
        passcodeRetryInMs = 5000;
        break;
    case 4:
        passcodeRetryInMs = 10000;
        break;
    case 5:
        passcodeRetryInMs = 15000;
        break;
    case 6:
        passcodeRetryInMs = 20000;
        break;
    case 7:
        passcodeRetryInMs = 25000;
        break;
    default:
        passcodeRetryInMs = 30000;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\support\widget\AdapterHelper.java
### Line: 268
```
switch(op.cmd) {
    case UpdateOp.UPDATE:
        continuous = updatedPos == tmpStart + 1;
        break;
    case UpdateOp.REMOVE:
        continuous = updatedPos == tmpStart;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\voip\VoIPBaseService.java
### Line: 924
```
switch(info.getSubtype()) {
    case TelephonyManager.NETWORK_TYPE_GPRS:
        type = VoIPController.NET_TYPE_GPRS;
        break;
    case TelephonyManager.NETWORK_TYPE_EDGE:
    case TelephonyManager.NETWORK_TYPE_1xRTT:
        type = VoIPController.NET_TYPE_EDGE;
        break;
    case TelephonyManager.NETWORK_TYPE_UMTS:
    case TelephonyManager.NETWORK_TYPE_EVDO_0:
        type = VoIPController.NET_TYPE_3G;
        break;
    case TelephonyManager.NETWORK_TYPE_HSDPA:
    case TelephonyManager.NETWORK_TYPE_HSPA:
    case TelephonyManager.NETWORK_TYPE_HSPAP:
    case TelephonyManager.NETWORK_TYPE_HSUPA:
    case TelephonyManager.NETWORK_TYPE_EVDO_A:
    case TelephonyManager.NETWORK_TYPE_EVDO_B:
        type = VoIPController.NET_TYPE_HSPA;
        break;
    case TelephonyManager.NETWORK_TYPE_LTE:
        type = VoIPController.NET_TYPE_LTE;
        break;
    default:
        type = VoIPController.NET_TYPE_OTHER_MOBILE;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\messenger\voip\VoIPBaseService.java
### Line: 348
```
switch(which) {
    case 0:
        audioRouteToSet = AUDIO_ROUTE_BLUETOOTH;
        break;
    case 1:
        audioRouteToSet = AUDIO_ROUTE_EARPIECE;
        break;
    case 2:
        audioRouteToSet = AUDIO_ROUTE_SPEAKER;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 142
```
switch(constructor) {
    case 0x1b0c841a:
        result = new TL_draftMessageEmpty();
        break;
    case 0xba4baec5:
        result = new TL_draftMessageEmpty_layer81();
        break;
    case 0xfd8e711f:
        result = new TL_draftMessage();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 248
```
switch(constructor) {
    case 0x37c1011c:
        result = new TL_chatPhotoEmpty();
        break;
    case 0x6153276a:
        result = new TL_chatPhoto();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 446
```
switch(constructor) {
    case 0xd612e8ef:
        result = new TL_notifyBroadcasts();
        break;
    case 0xc007cec3:
        result = new TL_notifyChats();
        break;
    case 0xb4c83b4c:
        result = new TL_notifyUsers();
        break;
    case 0x9fd40bd8:
        result = new TL_notifyPeer();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 518
```
switch(constructor) {
    case 0x560f8935:
        result = new TL_messages_sentEncryptedMessage();
        break;
    case 0x9493ff32:
        result = new TL_messages_sentEncryptedFile();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 758
```
switch(constructor) {
    case 0x3a556302:
        result = new TL_documentAttributeSticker_layer55();
        break;
    case 0x51448e5:
        result = new TL_documentAttributeAudio_old();
        break;
    case 0x6319d612:
        result = new TL_documentAttributeSticker();
        break;
    case 0x11b58939:
        result = new TL_documentAttributeAnimated();
        break;
    case 0x15590068:
        result = new TL_documentAttributeFilename();
        break;
    case 0xef02ce6:
        result = new TL_documentAttributeVideo();
        break;
    case 0x5910cccb:
        result = new TL_documentAttributeVideo_layer65();
        break;
    case 0xded218e0:
        result = new TL_documentAttributeAudio_layer45();
        break;
    case 0xfb0a5727:
        result = new TL_documentAttributeSticker_old();
        break;
    case 0x9801d2f7:
        result = new TL_documentAttributeHasStickers();
        break;
    case 0x994c9882:
        result = new TL_documentAttributeSticker_old2();
        break;
    case 0x6c37c15c:
        result = new TL_documentAttributeImageSize();
        break;
    case 0x9852f9c6:
        result = new TL_documentAttributeAudio();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 1494
```
switch(constructor) {
    case 0x7780bcb4:
        result = new TL_groupCallDiscarded();
        break;
    case 0xa8f1624:
        result = new TL_groupCall();
        break;
    case 0x6d0b1604:
        result = new TL_groupCallPrivate();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 1664
```
switch(constructor) {
    case 0xe56dbf05:
        result = new TL_dialogPeer();
        break;
    case 0xda429411:
        result = new TL_dialogPeerFeed();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 1785
```
switch(constructor) {
    case 0xc7345e6a:
        result = new TL_jsonBool();
        break;
    case 0x3f6d7b68:
        result = new TL_jsonNull();
        break;
    case 0xb71e767a:
        result = new TL_jsonString();
        break;
    case 0xf7444763:
        result = new TL_jsonArray();
        break;
    case 0x99c1d49d:
        result = new TL_jsonObject();
        break;
    case 0x2be0dfa4:
        result = new TL_jsonNumber();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 1941
```
switch(constructor) {
    case 0xe630b979:
        result = new TL_inputWallPaper();
        break;
    case 0x72091c80:
        result = new TL_inputWallPaperSlug();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 2003
```
switch(constructor) {
    case 0x8c718e87:
        result = new TL_messages_messages();
        break;
    case 0x99262e37:
        result = new TL_messages_channelMessages();
        break;
    case 0xa6c47aaa:
        result = new TL_messages_messagesSlice();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 2402
```
switch(constructor) {
    case 0x4a70994c:
        result = new TL_encryptedFile();
        break;
    case 0xc21f497e:
        result = new TL_encryptedFileEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 2458
```
switch(constructor) {
    case 0xbddde532:
        result = new TL_peerChannel();
        break;
    case 0x9db1bc6d:
        result = new TL_peerUser();
        break;
    case 0xbad0e5bb:
        result = new TL_peerChat();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 2612
```
switch(constructor) {
    case 0x66afa166:
        result = new TL_help_deepLinkInfoEmpty();
        break;
    case 0x6a4ee832:
        result = new TL_help_deepLinkInfo();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 2806
```
switch(constructor) {
    case 0x64199744:
        result = new TL_secureFileEmpty();
        break;
    case 0xe0277a62:
        result = new TL_secureFile();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3071
```
switch(constructor) {
    case 0xf49ca0:
        result = new TL_updates_difference();
        break;
    case 0xa8fb1981:
        result = new TL_updates_differenceSlice();
        break;
    case 0x4afe8f6d:
        result = new TL_updates_differenceTooLong();
        break;
    case 0x5d75a138:
        result = new TL_updates_differenceEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3367
```
switch(constructor) {
    case 0xbc2eab30:
        result = new TL_privacyKeyStatusTimestamp();
        break;
    case 0x39491cc8:
        result = new TL_privacyKeyPhoneP2P();
        break;
    case 0x500e6dfa:
        result = new TL_privacyKeyChatInvite();
        break;
    case 0x3d662b7b:
        result = new TL_privacyKeyPhoneCall();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3434
```
switch(constructor) {
    case 0x296f104:
        result = new TL_geoPoint();
        break;
    case 0x2049d70c:
        result = new TL_geoPoint_layer81();
        break;
    case 0x1117dd5f:
        result = new TL_geoPointEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3581
```
switch(constructor) {
    case 0xdb74f558:
        result = new TL_chatInvite();
        break;
    case 0x5a686d7c:
        result = new TL_chatInviteAlready();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3701
```
switch(constructor) {
    case 0x1da7158f:
        result = new TL_help_appUpdate();
        break;
    case 0xc45a6536:
        result = new TL_help_noAppUpdate();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3835
```
switch(constructor) {
    case 0x9e8fa6d3:
        result = new TL_messages_favedStickersNotModified();
        break;
    case 0xf37f2f16:
        result = new TL_messages_favedStickers();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 3985
```
switch(constructor) {
    case 0xdd6a8f48:
        result = new TL_sendMessageGamePlayAction();
        break;
    case 0xd52f73f7:
        result = new TL_sendMessageRecordAudioAction();
        break;
    case 0x92042ff7:
        result = new TL_sendMessageUploadVideoAction_old();
        break;
    case 0xe6ac8a6f:
        result = new TL_sendMessageUploadAudioAction_old();
        break;
    case 0xf351d7ab:
        result = new TL_sendMessageUploadAudioAction();
        break;
    case 0xd1d34a26:
        result = new TL_sendMessageUploadPhotoAction();
        break;
    case 0x8faee98e:
        result = new TL_sendMessageUploadDocumentAction_old();
        break;
    case 0xe9763aec:
        result = new TL_sendMessageUploadVideoAction();
        break;
    case 0xfd5ec8f5:
        result = new TL_sendMessageCancelAction();
        break;
    case 0x176f8ba1:
        result = new TL_sendMessageGeoLocationAction();
        break;
    case 0x628cbc6f:
        result = new TL_sendMessageChooseContactAction();
        break;
    case 0x88f27fbc:
        result = new TL_sendMessageRecordRoundAction();
        break;
    case 0x243e1c66:
        result = new TL_sendMessageUploadRoundAction();
        break;
    case 0x16bf744e:
        result = new TL_sendMessageTypingAction();
        break;
    case 0x990a3c1a:
        result = new TL_sendMessageUploadPhotoAction_old();
        break;
    case 0xaa0cd9e4:
        result = new TL_sendMessageUploadDocumentAction();
        break;
    case 0xa187d66f:
        result = new TL_sendMessageRecordVideoAction();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4244
```
switch(constructor) {
    case 0x3dbb5986:
        result = new TL_auth_sentCodeTypeApp();
        break;
    case 0x5353e5a7:
        result = new TL_auth_sentCodeTypeCall();
        break;
    case 0xab03c6d9:
        result = new TL_auth_sentCodeTypeFlashCall();
        break;
    case 0xc000bba2:
        result = new TL_auth_sentCodeTypeSms();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4329
```
switch(constructor) {
    case 0x38641628:
        result = new TL_messages_stickerSetInstallResultSuccess();
        break;
    case 0x35e410a8:
        result = new TL_messages_stickerSetInstallResultArchive();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4424
```
switch(constructor) {
    case 0xfcaafeb7:
        result = new TL_inputDialogPeer();
        break;
    case 0x2c38b8cf:
        result = new TL_inputDialogPeerFeed();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4484
```
switch(constructor) {
    case 0x9c750409:
        result = new TL_foundGifCached();
        break;
    case 0x162ecc1f:
        result = new TL_foundGif();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4550
```
switch(constructor) {
    case 0x4e5f810d:
        result = new TL_payments_paymentResult();
        break;
    case 0x6b56b921:
        result = new TL_payments_paymentVerficationNeeded();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 4760
```
switch(constructor) {
    case 0x4d5bbe0c:
        result = new TL_privacyValueAllowUsers();
        break;
    case 0x8b73e763:
        result = new TL_privacyValueDisallowAll();
        break;
    case 0xfffe1bac:
        result = new TL_privacyValueAllowContacts();
        break;
    case 0xf888fa1a:
        result = new TL_privacyValueDisallowContacts();
        break;
    case 0x65427b82:
        result = new TL_privacyValueAllowAll();
        break;
    case 0xc7f49b7:
        result = new TL_privacyValueDisallowUsers();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 5423
```
switch(constructor) {
    case 0x6c47ac9f:
        result = new TL_langPackStringPluralized();
        break;
    case 0xcad181f6:
        result = new TL_langPackString();
        break;
    case 0x2979eeb2:
        result = new TL_langPackStringDeleted();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 5597
```
switch(constructor) {
    case 0x11965f3a:
        result = new TL_botInlineResult();
        break;
    case 0x17db940b:
        result = new TL_botInlineMediaResult();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 5717
```
switch(constructor) {
    case 0x9acda4c0:
        result = new TL_peerNotifySettings_layer77();
        break;
    case 0xaf509d20:
        result = new TL_peerNotifySettings();
        break;
    case 0x8d5e11ee:
        result = new TL_peerNotifySettings_layer47();
        break;
    case 0x70a68512:
        result = new TL_peerNotifySettingsEmpty_layer77();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 5834
```
switch(constructor) {
    case 0x1c138d15:
        result = new TL_contacts_blocked();
        break;
    case 0x900802a1:
        result = new TL_contacts_blockedSlice();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6088
```
switch(constructor) {
    case 0xc0e24635:
        result = new TL_messages_dhConfigNotModified();
        break;
    case 0x2c221edd:
        result = new TL_messages_dhConfig();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6144
```
switch(constructor) {
    case 0xf3ae2eed:
        result = new TL_help_userInfoEmpty();
        break;
    case 0x1eb3758:
        result = new TL_help_userInfo();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6323
```
switch(constructor) {
    case 0xf3b7acc9:
        result = new TL_inputGeoPoint();
        break;
    case 0xe4c123d6:
        result = new TL_inputGeoPointEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6408
```
switch(constructor) {
    case 0x586988d8:
        result = new TL_audioEmpty_layer45();
        break;
    case 0xf9e35055:
        result = new TL_audio_layer45();
        break;
    case 0x427425e7:
        result = new TL_audio_old();
        break;
    case 0x555555F6:
        result = new TL_audioEncrypted();
        break;
    case 0xc7ac6496:
        result = new TL_audio_old2();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6563
```
switch(constructor) {
    case 0xbbf2dda0:
        result = new TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000();
        break;
    case 0x86471d92:
        result = new TL_securePasswordKdfAlgoSHA512();
        break;
    case 0x4a8537:
        result = new TL_securePasswordKdfAlgoUnknown();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6631
```
switch(constructor) {
    case 0xbb2e37ce:
        result = new TL_botInfoEmpty_layer48();
        break;
    case 0x98e81d3a:
        result = new TL_botInfo();
        break;
    case 0x9cf585d:
        result = new TL_botInfo_layer48();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6747
```
switch(constructor) {
    case 0xc331e80a:
        result = new TL_inputGameShortName();
        break;
    case 0x32c3e77:
        result = new TL_inputGameID();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6806
```
switch(constructor) {
    case 0x48a30254:
        result = new TL_replyInlineMarkup();
        break;
    case 0xa03e5b85:
        result = new TL_replyKeyboardHide();
        break;
    case 0xf4108aa0:
        result = new TL_replyKeyboardForceReply();
        break;
    case 0x3502758c:
        result = new TL_replyKeyboardMarkup();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 6945
```
switch(constructor) {
    case 0xb74ba9d2:
        result = new TL_contacts_contactsNotModified();
        break;
    case 0xeae87e42:
        result = new TL_contacts_contacts();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 7032
```
switch(constructor) {
    case 0x829d99da:
        result = new TL_secureRequiredType();
        break;
    case 0x27477b4:
        result = new TL_secureRequiredTypeOneOf();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 7115
```
switch(constructor) {
    case 0x4f96cb18:
        result = new TL_inputPrivacyKeyStatusTimestamp();
        break;
    case 0xbdfb0426:
        result = new TL_inputPrivacyKeyChatInvite();
        break;
    case 0xfabadc5f:
        result = new TL_inputPrivacyKeyPhoneCall();
        break;
    case 0xdb9e70d2:
        result = new TL_inputPrivacyKeyPhoneP2P();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 7182
```
switch(constructor) {
    case 0x8dca6aa5:
        result = new TL_photos_photos();
        break;
    case 0x15051f54:
        result = new TL_photos_photosSlice();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 7342
```
switch(constructor) {
    case 0x1c87a71a:
        result = new TL_channelFull();
        break;
    case 0x2e02a614:
        result = new TL_chatFull_layer87();
        break;
    case 0x17f45fcf:
        result = new TL_channelFull_layer71();
        break;
    case 0x76af5481:
        result = new TL_channelFull_layer72();
        break;
    case 0x97bee562:
        result = new TL_channelFull_layer52();
        break;
    case 0xc3d5512f:
        result = new TL_channelFull_layer67();
        break;
    case 0x9e341ddf:
        result = new TL_channelFull_layer48();
        break;
    case 0x22a235da:
        result = new TL_chatFull();
        break;
    case 0xedd2a791:
        result = new TL_chatFull_layer92();
        break;
    case 0xfab31aa3:
        result = new TL_channelFull_old();
        break;
    case 0x95cb5f57:
        result = new TL_channelFull_layer70();
        break;
    case 0xcbb62890:
        result = new TL_channelFull_layer89();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 8559
```
switch(constructor) {
    case 0x8dee6c44:
        result = new TL_pagePart_layer67();
        break;
    case 0x8e3f9ebe:
        result = new TL_pagePart_layer82();
        break;
    case 0xd7a19d69:
        result = new TL_pageFull_layer67();
        break;
    case 0x556ec7aa:
        result = new TL_pageFull_layer82();
        break;
    case 0xae891bec:
        result = new TL_page();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 9028
```
switch(constructor) {
    case 0xb98886cf:
        result = new TL_inputUserEmpty();
        break;
    case 0xf7c1b13f:
        result = new TL_inputUserSelf();
        break;
    case 0xd8292816:
        result = new TL_inputUser();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 9093
```
switch(constructor) {
    case 0xb16a6c29:
        result = new TL_keyboardButtonRequestPhone();
        break;
    case 0x50f41ccf:
        result = new TL_keyboardButtonGame();
        break;
    case 0x258aff05:
        result = new TL_keyboardButtonUrl();
        break;
    case 0x568a748:
        result = new TL_keyboardButtonSwitchInline();
        break;
    case 0xfc796b3f:
        result = new TL_keyboardButtonRequestGeoLocation();
        break;
    case 0xafd93fbb:
        result = new TL_keyboardButtonBuy();
        break;
    case 0x683a5e46:
        result = new TL_keyboardButtonCallback();
        break;
    case 0xa2fa4880:
        result = new TL_keyboardButton();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 9271
```
switch(constructor) {
    case 0x4366232e:
        result = new TL_botInlineMessageMediaVenue_layer77();
        break;
    case 0x8a86659c:
        result = new TL_botInlineMessageMediaVenue();
        break;
    case 0x3a8fd8b8:
        result = new TL_botInlineMessageMediaGeo_layer71();
        break;
    case 0x764cf810:
        result = new TL_botInlineMessageMediaAuto();
        break;
    case 0xa74b15b:
        result = new TL_botInlineMessageMediaAuto_layer74();
        break;
    case 0x35edb4d4:
        result = new TL_botInlineMessageMediaContact_layer81();
        break;
    case 0x18d1cdc2:
        result = new TL_botInlineMessageMediaContact();
        break;
    case 0x8c7f65e2:
        result = new TL_botInlineMessageText();
        break;
    case 0xb722de65:
        result = new TL_botInlineMessageMediaGeo();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 9639
```
switch(constructor) {
    case 0x997275b5:
        result = new TL_boolTrue();
        break;
    case 0xbc799737:
        result = new TL_boolFalse();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 9766
```
switch(constructor) {
    case 0x5f07b4bc:
        result = new TL_webPage();
        break;
    case 0xa31ea0b5:
        result = new TL_webPage_old();
        break;
    case 0xeb1477e8:
        result = new TL_webPageEmpty();
        break;
    case 0xd41a5167:
        result = new TL_webPageUrlPending();
        break;
    case 0xc586da1c:
        result = new TL_webPagePending();
        break;
    case 0x85849473:
        result = new TL_webPageNotModified();
        break;
    case 0xca820ed7:
        result = new TL_webPage_layer58();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 10137
```
switch(constructor) {
    case 0xf89d88e5:
        result = new TL_messages_featuredStickers();
        break;
    case 0x4ede3cf:
        result = new TL_messages_featuredStickersNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 10220
```
switch(constructor) {
    case 0x7a700873:
        result = new TL_secureValueErrorFile();
        break;
    case 0xbe3dfa:
        result = new TL_secureValueErrorFrontSide();
        break;
    case 0x666220e9:
        result = new TL_secureValueErrorFiles();
        break;
    case 0x868a2aa5:
        result = new TL_secureValueErrorReverseSide();
        break;
    case 0xa1144770:
        result = new TL_secureValueErrorTranslationFile();
        break;
    case 0x869d758f:
        result = new TL_secureValueError();
        break;
    case 0xe8a40bd9:
        result = new TL_secureValueErrorData();
        break;
    case 0x34636dd8:
        result = new TL_secureValueErrorTranslationFiles();
        break;
    case 0xe537ced6:
        result = new TL_secureValueErrorSelfie();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 10701
```
switch(constructor) {
    case 0x57adc690:
        result = new TL_phoneCallDiscardReasonHangup();
        break;
    case 0xfaf7e8c9:
        result = new TL_phoneCallDiscardReasonBusy();
        break;
    case 0xafe2b839:
        result = new TL_phoneCallDiscardReasonAllowGroupCall();
        break;
    case 0x85e42301:
        result = new TL_phoneCallDiscardReasonMissed();
        break;
    case 0xe095c1a0:
        result = new TL_phoneCallDiscardReasonDisconnect();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 10841
```
switch(constructor) {
    case 0x4a95e84e:
        result = new TL_inputNotifyChats();
        break;
    case 0xb8bc5b0c:
        result = new TL_inputNotifyPeer();
        break;
    case 0x193b4417:
        result = new TL_inputNotifyUsers();
        break;
    case 0xb1db7c7e:
        result = new TL_inputNotifyBroadcasts();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 10917
```
switch(constructor) {
    case 0xcbc7ee28:
        result = new TL_inputSecureFileLocation();
        break;
    case 0xf5235d55:
        result = new TL_inputEncryptedFileLocation();
        break;
    case 0x196683d9:
        result = new TL_inputDocumentFileLocation();
        break;
    case 0xdfdaabe1:
        result = new TL_inputFileLocation();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 11065
```
switch(constructor) {
    case 0x28ecf961:
        result = new TL_help_termsOfServiceUpdate();
        break;
    case 0xe3309f7f:
        result = new TL_help_termsOfServiceUpdateEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 11140
```
switch(constructor) {
    case 0x6d003d3f:
        result = new TL_phoneCallAccepted();
        break;
    case 0xe6f9ddf3:
        result = new TL_phoneCall();
        break;
    case 0x83761ce4:
        result = new TL_phoneCallRequested();
        break;
    case 0xffe6ab67:
        result = new TL_phoneCall_layer86();
        break;
    case 0x1b8f4ad1:
        result = new TL_phoneCallWaiting();
        break;
    case 0x50ca4de1:
        result = new TL_phoneCallDiscarded();
        break;
    case 0x5366c915:
        result = new TL_phoneCallEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 11443
```
switch(constructor) {
    case 0xcab35e18:
        result = new TL_userContact_old2();
        break;
    case 0xf2fb8319:
        result = new TL_userContact_old();
        break;
    case 0x2e13f4c3:
        result = new TL_user();
        break;
    case 0x720535ec:
        result = new TL_userSelf_old();
        break;
    case 0x1c60e608:
        result = new TL_userSelf_old3();
        break;
    case 0xd6016d7a:
        result = new TL_userDeleted_old2();
        break;
    case 0x200250ba:
        result = new TL_userEmpty();
        break;
    case 0x22e8ceb0:
        result = new TL_userRequest_old();
        break;
    case 0x5214c89d:
        result = new TL_userForeign_old();
        break;
    case 0x75cf7a8:
        result = new TL_userForeign_old2();
        break;
    case 0xd9ccc4ef:
        result = new TL_userRequest_old2();
        break;
    case 0xb29ad7cc:
        result = new TL_userDeleted_old();
        break;
    case 0xd10d979a:
        result = new TL_user_layer65();
        break;
    case 0x22e49072:
        result = new TL_user_old();
        break;
    case 0x7007b451:
        result = new TL_userSelf_old2();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 12083
```
switch(constructor) {
    case 0xa01b22f9:
        result = new TL_recentMeUrlChat();
        break;
    case 0xbc0a57dc:
        result = new TL_recentMeUrlStickerSet();
        break;
    case 0x46e1d13d:
        result = new TL_recentMeUrlUnknown();
        break;
    case 0xeb49081d:
        result = new TL_recentMeUrlChatInvite();
        break;
    case 0x8dbc3336:
        result = new TL_recentMeUrlUser();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 12313
```
switch(constructor) {
    case 0xbb6ae88d:
        result = new TL_channelParticipantsContacts();
        break;
    case 0xb4608969:
        result = new TL_channelParticipantsAdmins();
        break;
    case 0xa3b54985:
        result = new TL_channelParticipantsKicked();
        break;
    case 0x656ac4b:
        result = new TL_channelParticipantsSearch();
        break;
    case 0xb0d1865b:
        result = new TL_channelParticipantsBots();
        break;
    case 0x1427a5e1:
        result = new TL_channelParticipantsBanned();
        break;
    case 0xde3f3c79:
        result = new TL_channelParticipantsRecent();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 12454
```
switch(constructor) {
    case 0x555555F5:
        result = new TL_messageActionLoginUnknownLocation();
        break;
    case 0x555555F7:
        result = new TL_messageEncryptedAction();
        break;
    case 0xfae69f56:
        result = new TL_messageActionCustomAction();
        break;
    case 0xa6638b9a:
        result = new TL_messageActionChatCreate();
        break;
    case 0x51bdb021:
        result = new TL_messageActionChatMigrateTo();
        break;
    case 0x7a0d7f42:
        result = new TL_messageActionGroupCall();
        break;
    case 0x4792929b:
        result = new TL_messageActionScreenshotTaken();
        break;
    case 0x9fbab604:
        result = new TL_messageActionHistoryClear();
        break;
    case 0x7fcb13a8:
        result = new TL_messageActionChatEditPhoto();
        break;
    case 0xb055eaee:
        result = new TL_messageActionChannelMigrateFrom();
        break;
    case 0x488a7337:
        result = new TL_messageActionChatAddUser();
        break;
    case 0xb2ae9b0c:
        result = new TL_messageActionChatDeleteUser();
        break;
    case 0x55555557:
        result = new TL_messageActionCreatedBroadcastList();
        break;
    case 0x55555550:
        result = new TL_messageActionUserJoined();
        break;
    case 0x55555551:
        result = new TL_messageActionUserUpdatedPhoto();
        break;
    case 0x5e3cfc4b:
        result = new TL_messageActionChatAddUser_old();
        break;
    case 0x55555552:
        result = new TL_messageActionTTLChange();
        break;
    case 0xd95c6154:
        result = new TL_messageActionSecureValuesSent();
        break;
    case 0xf89cf5e8:
        result = new TL_messageActionChatJoinedByLink();
        break;
    case 0xf3f25f76:
        result = new TL_messageActionContactSignUp();
        break;
    case 0x95d2ac92:
        result = new TL_messageActionChannelCreate();
        break;
    case 0x94bd38ed:
        result = new TL_messageActionPinMessage();
        break;
    case 0x95e3fbef:
        result = new TL_messageActionChatDeletePhoto();
        break;
    case 0x80e11a7f:
        result = new TL_messageActionPhoneCall();
        break;
    case 0xb5a1ce5a:
        result = new TL_messageActionChatEditTitle();
        break;
    case 0xabe9affe:
        result = new TL_messageActionBotAllowed();
        break;
    case 0x40699cd0:
        result = new TL_messageActionPaymentSent();
        break;
    case 0xb6aef7b0:
        result = new TL_messageActionEmpty();
        break;
    case 0x92a72876:
        result = new TL_messageActionGameScore();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13006
```
switch(constructor) {
    case 0xe1746d0a:
        result = new TL_inputReportReasonOther();
        break;
    case 0x9b89f93a:
        result = new TL_inputReportReasonCopyright();
        break;
    case 0x58dbcab8:
        result = new TL_inputReportReasonSpam();
        break;
    case 0x1e22c78d:
        result = new TL_inputReportReasonViolence();
        break;
    case 0xadf44ee3:
        result = new TL_inputReportReasonChildAbuse();
        break;
    case 0x2e59d922:
        result = new TL_inputReportReasonPornography();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13192
```
switch(constructor) {
    case 0x204d3878:
        result = new TL_decryptedMessage_layer17();
        break;
    case 0x73164160:
        result = new TL_decryptedMessageService();
        break;
    case 0xaa48327d:
        result = new TL_decryptedMessageService_layer8();
        break;
    case 0x1f814f1f:
        result = new TL_decryptedMessage_layer8();
        break;
    case 0x91cc4674:
        result = new TL_decryptedMessage();
        break;
    case 0x36b091de:
        result = new TL_decryptedMessage_layer45();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13509
```
switch(constructor) {
    case 0x1c199183:
        result = new TL_account_wallPapersNotModified();
        break;
    case 0x702b65a9:
        result = new TL_account_wallPapers();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13647
```
switch(constructor) {
    case 0xee9f4a4d:
        result = new TL_video_old3();
        break;
    case 0xf72887d3:
        result = new TL_video_layer45();
        break;
    case 0x55555553:
        result = new TL_videoEncrypted();
        break;
    case 0x5a04a49f:
        result = new TL_video_old();
        break;
    case 0x388fa391:
        result = new TL_video_old2();
        break;
    case 0xc10658a8:
        result = new TL_videoEmpty_layer45();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13874
```
switch(constructor) {
    case 0x3417d728:
        result = new TL_inputPaymentCredentials();
        break;
    case 0xca05d50e:
        result = new TL_inputPaymentCredentialsAndroidPay();
        break;
    case 0xc10eb2cf:
        result = new TL_inputPaymentCredentialsSaved();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 13980
```
switch(constructor) {
    case 0x637b7ed:
        result = new TL_topPeerCategoryCorrespondents();
        break;
    case 0xbd17a14a:
        result = new TL_topPeerCategoryGroups();
        break;
    case 0x148677e2:
        result = new TL_topPeerCategoryBotsInline();
        break;
    case 0x161d9628:
        result = new TL_topPeerCategoryChannels();
        break;
    case 0x1e76a78c:
        result = new TL_topPeerCategoryPhoneCalls();
        break;
    case 0xab661b5b:
        result = new TL_topPeerCategoryBotsPM();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 14248
```
switch(constructor) {
    case 0x72f0eaae:
        result = new TL_inputDocumentEmpty();
        break;
    case 0x1abfb575:
        result = new TL_inputDocument();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 14297
```
switch(constructor) {
    case 0xcbe31e26:
        result = new TL_secureValueTypeAddress();
        break;
    case 0x99e3806a:
        result = new TL_secureValueTypePassportRegistration();
        break;
    case 0xa0d0744b:
        result = new TL_secureValueTypeIdentityCard();
        break;
    case 0xfc36954e:
        result = new TL_secureValueTypeUtilityBill();
        break;
    case 0x89137c0d:
        result = new TL_secureValueTypeBankStatement();
        break;
    case 0x8e3ca7ee:
        result = new TL_secureValueTypeEmail();
        break;
    case 0x9d2a81e3:
        result = new TL_secureValueTypePersonalDetails();
        break;
    case 0xea02ec33:
        result = new TL_secureValueTypeTemporaryRegistration();
        break;
    case 0x3dac6a00:
        result = new TL_secureValueTypePassport();
        break;
    case 0x8b883488:
        result = new TL_secureValueTypeRentalAgreement();
        break;
    case 0x6e425c4:
        result = new TL_secureValueTypeDriverLicense();
        break;
    case 0xb320aadb:
        result = new TL_secureValueTypePhone();
        break;
    case 0x99a48f23:
        result = new TL_secureValueTypeInternalPassport();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 14518
```
switch(constructor) {
    case 0x9ba29cc1:
        result = new TL_document();
        break;
    case 0x59534e4c:
        result = new TL_document_layer92();
        break;
    case 0x87232bc7:
        result = new TL_document_layer82();
        break;
    case 0x55555556:
        result = new TL_documentEncrypted_old();
        break;
    case 0x9efc6326:
        result = new TL_document_old();
        break;
    case 0x36f8c871:
        result = new TL_documentEmpty();
        break;
    case 0x55555558:
        result = new TL_documentEncrypted();
        break;
    case 0xf9a39f4f:
        result = new TL_document_layer53();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 14906
```
switch(constructor) {
    case 0xd45ab096:
        result = new TL_passwordKdfAlgoUnknown();
        break;
    case 0x3a912d4a:
        result = new TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 14961
```
switch(constructor) {
    case 0xfeedd3ad:
        result = new TL_contactLinkNone();
        break;
    case 0xd502c2d0:
        result = new TL_contactLinkContact();
        break;
    case 0x268f3f59:
        result = new TL_contactLinkHasPhone();
        break;
    case 0x5f4f9247:
        result = new TL_contactLinkUnknown();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 15031
```
switch(constructor) {
    case 0x9a8ae1e1:
        result = new TL_pageBlockOrderedList();
        break;
    case 0xd9d71866:
        result = new TL_pageBlockVideo_layer82();
        break;
    case 0xf259a80b:
        result = new TL_pageBlockEmbedPost();
        break;
    case 0x467a0766:
        result = new TL_pageBlockParagraph();
        break;
    case 0x1e148390:
        result = new TL_pageBlockKicker();
        break;
    case 0x48870999:
        result = new TL_pageBlockFooter();
        break;
    case 0xbfd064ec:
        result = new TL_pageBlockHeader();
        break;
    case 0xc070d93e:
        result = new TL_pageBlockPreformatted();
        break;
    case 0x16115a96:
        result = new TL_pageBlockRelatedArticles();
        break;
    case 0xf12bb6e1:
        result = new TL_pageBlockSubheader();
        break;
    case 0x31f9590:
        result = new TL_pageBlockSlideshow();
        break;
    case 0xce0d37b0:
        result = new TL_pageBlockAnchor();
        break;
    case 0xa44f3ef6:
        result = new TL_pageBlockMap();
        break;
    case 0xdb20b188:
        result = new TL_pageBlockDivider();
        break;
    case 0x1759c560:
        result = new TL_pageBlockPhoto();
        break;
    case 0xe4e88011:
        result = new TL_pageBlockList();
        break;
    case 0x13567e8a:
        result = new TL_pageBlockUnsupported();
        break;
    case 0x65a0fa4d:
        result = new TL_pageBlockCollage();
        break;
    case 0x3d5b64f2:
        result = new TL_pageBlockAuthorDate_layer60();
        break;
    case 0x3a58c7f4:
        result = new TL_pageBlockList_layer82();
        break;
    case 0xa8718dc5:
        result = new TL_pageBlockEmbed();
        break;
    case 0x130c8963:
        result = new TL_pageBlockSlideshow_layer82();
        break;
    case 0x8ffa9a1f:
        result = new TL_pageBlockSubtitle();
        break;
    case 0x263d7c26:
        result = new TL_pageBlockBlockquote();
        break;
    case 0x76768bed:
        result = new TL_pageBlockDetails();
        break;
    case 0xef1751b5:
        result = new TL_pageBlockChannel();
        break;
    case 0x7c8fe7b6:
        result = new TL_pageBlockVideo();
        break;
    case 0xd935d8fb:
        result = new TL_pageBlockEmbed_layer60();
        break;
    case 0x4f4456d3:
        result = new TL_pageBlockPullquote();
        break;
    case 0x804361ea:
        result = new TL_pageBlockAudio();
        break;
    case 0xbf4dea82:
        result = new TL_pageBlockTable();
        break;
    case 0xe9c69982:
        result = new TL_pageBlockPhoto_layer82();
        break;
    case 0x70abc3fd:
        result = new TL_pageBlockTitle();
        break;
    case 0x292c7be9:
        result = new TL_pageBlockEmbedPost_layer82();
        break;
    case 0x8b31c4f:
        result = new TL_pageBlockCollage_layer82();
        break;
    case 0x31b81a7f:
        result = new TL_pageBlockAudio_layer82();
        break;
    case 0x39f23300:
        result = new TL_pageBlockCover();
        break;
    case 0xcde200d1:
        result = new TL_pageBlockEmbed_layer82();
        break;
    case 0xbaafe5e0:
        result = new TL_pageBlockAuthorDate();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 15936
```
switch(constructor) {
    case 0x90110467:
        result = new TL_inputPrivacyValueDisallowUsers();
        break;
    case 0xd66b66c9:
        result = new TL_inputPrivacyValueDisallowAll();
        break;
    case 0xba52007:
        result = new TL_inputPrivacyValueDisallowContacts();
        break;
    case 0x184b35ce:
        result = new TL_inputPrivacyValueAllowAll();
        break;
    case 0xd09e07b:
        result = new TL_inputPrivacyValueAllowContacts();
        break;
    case 0x131cc67f:
        result = new TL_inputPrivacyValueAllowUsers();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16165
```
switch(constructor) {
    case 0xf8ab7dfb:
        result = new TL_inputMediaContact();
        break;
    case 0x23ab23d2:
        result = new TL_inputMediaDocument();
        break;
    case 0xd33f43f3:
        result = new TL_inputMediaGame();
        break;
    case 0x4843b0fd:
        result = new TL_inputMediaGifExternal();
        break;
    case 0xf9c44144:
        result = new TL_inputMediaGeoPoint();
        break;
    case 0xfb52dc99:
        result = new TL_inputMediaDocumentExternal();
        break;
    case 0x9664f57f:
        result = new TL_inputMediaEmpty();
        break;
    case 0x6b3765b:
        result = new TL_inputMediaPoll();
        break;
    case 0x1e287d04:
        result = new TL_inputMediaUploadedPhoto();
        break;
    case 0xc13d1c11:
        result = new TL_inputMediaVenue();
        break;
    case 0xce4e82fd:
        result = new TL_inputMediaGeoLive();
        break;
    case 0x5b38c6c1:
        result = new TL_inputMediaUploadedDocument();
        break;
    case 0xe5bbfe1a:
        result = new TL_inputMediaPhotoExternal();
        break;
    case 0xb3ba0635:
        result = new TL_inputMediaPhoto();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16577
```
switch(constructor) {
    case 0x3407e51b:
        result = new TL_stickerSetMultiCovered();
        break;
    case 0x6410a5d2:
        result = new TL_stickerSetCovered();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16655
```
switch(constructor) {
    case 0x23734b06:
        result = new TL_encryptedMessageService();
        break;
    case 0xed18c118:
        result = new TL_encryptedMessage();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16722
```
switch(constructor) {
    case 0xffb62b95:
        result = new TL_inputStickerSetEmpty();
        break;
    case 0x9de7a269:
        result = new TL_inputStickerSetID();
        break;
    case 0x861cc8a0:
        result = new TL_inputStickerSetShortName();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16857
```
switch(constructor) {
    case 0x8c703f:
        result = new TL_userStatusOffline();
        break;
    case 0x7bf09fc:
        result = new TL_userStatusLastWeek();
        break;
    case 0x9d05049:
        result = new TL_userStatusEmpty();
        break;
    case 0x77ebc742:
        result = new TL_userStatusLastMonth();
        break;
    case 0xedb93949:
        result = new TL_userStatusOnline();
        break;
    case 0xe26f42f1:
        result = new TL_userStatusRecently();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 16986
```
switch(constructor) {
    case 0xe09e1fb8:
        result = new TL_help_proxyDataEmpty();
        break;
    case 0x2bf7ee23:
        result = new TL_help_proxyDataPromo();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 17225
```
switch(constructor) {
    case 0xaca1657b:
        result = new TL_updateMessagePoll();
        break;
    case 0x4c43da18:
        result = new TL_updateUserPinnedMessage();
        break;
    case 0xa20db0e5:
        result = new TL_updateDeleteMessages();
        break;
    case 0x571d2742:
        result = new TL_updateReadFeaturedStickers();
        break;
    case 0x1710f156:
        result = new TL_updateEncryptedChatTyping();
        break;
    case 0x62ba04d9:
        result = new TL_updateNewChannelMessage();
        break;
    case 0x2f2f21bf:
        result = new TL_updateReadHistoryOutbox();
        break;
    case 0x19d27f3c:
        result = new TL_updateDialogPinned();
        break;
    case 0x12b9417b:
        result = new TL_updateUserPhone();
        break;
    case 0x4e90bfd6:
        result = new TL_updateMessageID();
        break;
    case 0x57eaec8:
        result = new TL_updateGroupCallParticipant();
        break;
    case 0x25d6c9c7:
        result = new TL_updateReadChannelOutbox();
        break;
    case 0x43ae3dec:
        result = new TL_updateStickerSets();
        break;
    case 0x1f2b0afd:
        result = new TL_updateNewMessage();
        break;
    case 0x12bcbd9a:
        result = new TL_updateNewEncryptedMessage();
        break;
    case 0x1bfbd823:
        result = new TL_updateUserStatus();
        break;
    case 0x98a12b4b:
        result = new TL_updateChannelMessageViews();
        break;
    case 0xbec268ef:
        result = new TL_updateNotifySettings();
        break;
    case 0x6e5f8c22:
        result = new TL_updateChatParticipantDelete();
        break;
    case 0x22893b26:
        result = new TL_updateChatPinnedMessage();
        break;
    case 0xe40370a3:
        result = new TL_updateEditMessage();
        break;
    case 0x7f891213:
        result = new TL_updateWebPage();
        break;
    case 0xe511996d:
        result = new TL_updateFavedStickers();
        break;
    case 0xea4b0e5c:
        result = new TL_updateChatParticipantAdd();
        break;
    case 0x9a65ea1f:
        result = new TL_updateChatUserTyping();
        break;
    case 0xb4a2e88d:
        result = new TL_updateEncryption();
        break;
    case 0x85fe86ed:
        result = new TL_updateGroupCall();
        break;
    case 0xeb0467fb:
        result = new TL_updateChannelTooLong();
        break;
    case 0x5c486927:
        result = new TL_updateUserTyping();
        break;
    case 0xebe46819:
        result = new TL_updateServiceNotification();
        break;
    case 0x98592475:
        result = new TL_updateChannelPinnedMessage();
        break;
    case 0x56022f4d:
        result = new TL_updateLangPack();
        break;
    case 0xb6901959:
        result = new TL_updateChatParticipantAdmin();
        break;
    case 0x89893b45:
        result = new TL_updateChannelReadMessagesContents();
        break;
    case 0xee3b272a:
        result = new TL_updatePrivacy();
        break;
    case 0xa229dd06:
        result = new TL_updateConfig();
        break;
    case 0xee2bb969:
        result = new TL_updateDraftMessage();
        break;
    case 0xa7332b73:
        result = new TL_updateUserName();
        break;
    case 0x70db6837:
        result = new TL_updateChannelAvailableMessages();
        break;
    case 0xe16459c3:
        result = new TL_updateDialogUnreadMark();
        break;
    case 0xab0f6b1e:
        result = new TL_updatePhoneCall();
        break;
    case 0xea4cb65b:
        result = new TL_updatePinnedDialogs();
        break;
    case 0x9a422c20:
        result = new TL_updateRecentStickers();
        break;
    case 0x9961fd5c:
        result = new TL_updateReadHistoryInbox();
        break;
    case 0x9d2e67c5:
        result = new TL_updateContactLink();
        break;
    case 0x9375341e:
        result = new TL_updateSavedGifs();
        break;
    case 0x7084a7be:
        result = new TL_updateContactsReset();
        break;
    case 0xb6d45656:
        result = new TL_updateChannel();
        break;
    case 0x40771900:
        result = new TL_updateChannelWebPage();
        break;
    case 0xc37521c9:
        result = new TL_updateDeleteChannelMessages();
        break;
    case 0x95313b0c:
        result = new TL_updateUserPhoto();
        break;
    case 0x8e5e9873:
        result = new TL_updateDcOptions();
        break;
    case 0x1b3f4df7:
        result = new TL_updateEditChannelMessage();
        break;
    case 0x80ece81a:
        result = new TL_updateUserBlocked();
        break;
    case 0x688a30aa:
        result = new TL_updateNewStickerSet();
        break;
    case 0x46560264:
        result = new TL_updateLangPackTooLong();
        break;
    case 0x38fe25b7:
        result = new TL_updateEncryptedMessagesRead();
        break;
    case 0xbb2d201:
        result = new TL_updateStickerSetsOrder();
        break;
    case 0x4214f37f:
        result = new TL_updateReadChannelInbox();
        break;
    case 0x68c13933:
        result = new TL_updateReadMessagesContents();
        break;
    case 0x7761198:
        result = new TL_updateChatParticipants();
        break;
    case 0x54c01850:
        result = new TL_updateChatDefaultBannedRights();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 18779
```
switch(constructor) {
    case 0x5a17b5e5:
        result = new TL_inputEncryptedFile();
        break;
    case 0x2dc173c8:
        result = new TL_inputEncryptedFileBigUploaded();
        break;
    case 0x1837c364:
        result = new TL_inputEncryptedFileEmpty();
        break;
    case 0x64bd0306:
        result = new TL_inputEncryptedFileUploaded();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 18874
```
switch(constructor) {
    case 0xedfd405f:
        result = new TL_messages_allStickers();
        break;
    case 0xe86602c3:
        result = new TL_messages_allStickersNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 18951
```
switch(constructor) {
    case 0xa1733aec:
        result = new TL_decryptedMessageActionSetMessageTTL();
        break;
    case 0xf3048883:
        result = new TL_decryptedMessageActionNotifyLayer();
        break;
    case 0x65614304:
        result = new TL_decryptedMessageActionDeleteMessages();
        break;
    case 0xec2e0b9b:
        result = new TL_decryptedMessageActionCommitKey();
        break;
    case 0xdd05ec6b:
        result = new TL_decryptedMessageActionAbortKey();
        break;
    case 0x6719e45c:
        result = new TL_decryptedMessageActionFlushHistory();
        break;
    case 0xccb27641:
        result = new TL_decryptedMessageActionTyping();
        break;
    case 0x6fe1735b:
        result = new TL_decryptedMessageActionAcceptKey();
        break;
    case 0xc4f40be:
        result = new TL_decryptedMessageActionReadMessages();
        break;
    case 0x511110b0:
        result = new TL_decryptedMessageActionResend();
        break;
    case 0xf3c9611b:
        result = new TL_decryptedMessageActionRequestKey();
        break;
    case 0x8ac1f475:
        result = new TL_decryptedMessageActionScreenshotMessages();
        break;
    case 0xa82fdd63:
        result = new TL_decryptedMessageActionNoop();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 19233
```
switch(constructor) {
    case 0x9880f658:
        result = new TL_inputCheckPasswordEmpty();
        break;
    case 0xd27ff082:
        result = new TL_inputCheckPasswordSRP();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 19369
```
switch(constructor) {
    case 0x4f11bae1:
        result = new TL_userProfilePhotoEmpty();
        break;
    case 0xd559d8c8:
        result = new TL_userProfilePhoto();
        break;
    case 0x990d1493:
        result = new TL_userProfilePhoto_old();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 19441
```
switch(constructor) {
    case 0x76a6d327:
        result = new TL_messageEntityTextUrl();
        break;
    case 0x6cef8ac7:
        result = new TL_messageEntityBotCommand();
        break;
    case 0x64e475c2:
        result = new TL_messageEntityEmail();
        break;
    case 0x73924be0:
        result = new TL_messageEntityPre();
        break;
    case 0xbb92ba95:
        result = new TL_messageEntityUnknown();
        break;
    case 0x6ed02538:
        result = new TL_messageEntityUrl();
        break;
    case 0x826f8b60:
        result = new TL_messageEntityItalic();
        break;
    case 0xfa04579d:
        result = new TL_messageEntityMention();
        break;
    case 0x352dca58:
        result = new TL_messageEntityMentionName();
        break;
    case 0x208e68c9:
        result = new TL_inputMessageEntityMentionName();
        break;
    case 0x4c4e743f:
        result = new TL_messageEntityCashtag();
        break;
    case 0xbd610bc9:
        result = new TL_messageEntityBold();
        break;
    case 0x6f635b0d:
        result = new TL_messageEntityHashtag();
        break;
    case 0x28a20571:
        result = new TL_messageEntityCode();
        break;
    case 0x9b69e34b:
        result = new TL_messageEntityPhone();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 19760
```
switch(constructor) {
    case 0x22b56751:
        result = new TL_photo_old();
        break;
    case 0x9c477dd8:
        result = new TL_photo();
        break;
    case 0xc3838076:
        result = new TL_photo_old2();
        break;
    case 0xcded42fe:
        result = new TL_photo_layer55();
        break;
    case 0x9288dd29:
        result = new TL_photo_layer82();
        break;
    case 0x2331b22d:
        result = new TL_photoEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 20177
```
switch(constructor) {
    case 0xd54b65d:
        result = new TL_messages_foundStickerSetsNotModified();
        break;
    case 0x5108d648:
        result = new TL_messages_foundStickerSets();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 20580
```
switch(constructor) {
    case 0x70b772a8:
        result = new TL_contacts_topPeers();
        break;
    case 0xb52c939d:
        result = new TL_contacts_topPeersDisabled();
        break;
    case 0xde266ef5:
        result = new TL_contacts_topPeersNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 20766
```
switch(constructor) {
    case 0x64ff9fd5:
        result = new TL_messages_chats();
        break;
    case 0x9cd81144:
        result = new TL_messages_chatsSlice();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 20858
```
switch(constructor) {
    case 0xee8c1e86:
        result = new TL_inputChannelEmpty();
        break;
    case 0xafeb712e:
        result = new TL_inputChannel();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 21003
```
switch(constructor) {
    case 0xccd3563d:
        result = new TL_messages_botResults_layer71();
        break;
    case 0x947ca848:
        result = new TL_messages_botResults();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 21226
```
switch(constructor) {
    case 0x21ec5a5f:
        result = new TL_securePlainEmail();
        break;
    case 0x7d6099dd:
        result = new TL_securePlainPhone();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 21376
```
switch(constructor) {
    case 0x3e11affb:
        result = new TL_updates_channelDifferenceEmpty();
        break;
    case 0x2064674e:
        result = new TL_updates_channelDifference();
        break;
    case 0x6a9d7b35:
        result = new TL_updates_channelDifferenceTooLong();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 21633
```
switch(constructor) {
    case 0x94d42ee7:
        result = new TL_channelMessagesFilterEmpty();
        break;
    case 0xcd77d957:
        result = new TL_channelMessagesFilter();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 22086
```
switch(constructor) {
    case 0xf9c8bcc6:
        result = new TL_webDocumentNoProxy();
        break;
    case 0xc61acbd8:
        result = new TL_webDocument_layer81();
        break;
    case 0x1c570ed1:
        result = new TL_webDocument();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 22247
```
switch(constructor) {
    case 0x1c0facaf:
        result = new TL_channelParticipantBanned();
        break;
    case 0x222c1886:
        result = new TL_channelParticipantBanned_layer92();
        break;
    case 0xe3e2e1f9:
        result = new TL_channelParticipantCreator();
        break;
    case 0x15ebac1d:
        result = new TL_channelParticipant();
        break;
    case 0x8cc5e69a:
        result = new TL_channelParticipantKicked_layer67();
        break;
    case 0xa3289a6d:
        result = new TL_channelParticipantSelf();
        break;
    case 0x91057fef:
        result = new TL_channelParticipantModerator_layer67();
        break;
    case 0x98192d61:
        result = new TL_channelParticipantEditor_layer67();
        break;
    case 0xa82fa898:
        result = new TL_channelParticipantAdmin_layer92();
        break;
    case 0x5daa6e23:
        result = new TL_channelParticipantAdmin();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 22478
```
switch(constructor) {
    case 0x438865b:
        result = new TL_inputStickeredMediaDocument();
        break;
    case 0x4a992157:
        result = new TL_inputStickeredMediaPhoto();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 22533
```
switch(constructor) {
    case 0xf56ee2a8:
        result = new TL_channels_channelParticipants();
        break;
    case 0xf0173fe9:
        result = new TL_channels_channelParticipantsNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 22787
```
switch(constructor) {
    case 0xfc900c2b:
        result = new TL_chatParticipantsForbidden();
        break;
    case 0x3f460fed:
        result = new TL_chatParticipants();
        break;
    case 0x7841b415:
        result = new TL_chatParticipants_old();
        break;
    case 0xfd2bb8a:
        result = new TL_chatParticipantsForbidden_old();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 23007
```
switch(constructor) {
    case 0x57e0a9cb:
        result = new TL_decryptedMessageMediaAudio();
        break;
    case 0x35480a59:
        result = new TL_decryptedMessageMediaGeoPoint();
        break;
    case 0x588a0a97:
        result = new TL_decryptedMessageMediaContact();
        break;
    case 0x89f5c4a:
        result = new TL_decryptedMessageMediaEmpty();
        break;
    case 0x7afe8ae2:
        result = new TL_decryptedMessageMediaDocument();
        break;
    case 0xe50511d8:
        result = new TL_decryptedMessageMediaWebPage();
        break;
    case 0xf1fa8d78:
        result = new TL_decryptedMessageMediaPhoto();
        break;
    case 0x970c8c0e:
        result = new TL_decryptedMessageMediaVideo();
        break;
    case 0xb095434b:
        result = new TL_decryptedMessageMediaDocument_layer8();
        break;
    case 0x4cee6ef3:
        result = new TL_decryptedMessageMediaVideo_layer8();
        break;
    case 0x8a0df56f:
        result = new TL_decryptedMessageMediaVenue();
        break;
    case 0xfa95b0dd:
        result = new TL_decryptedMessageMediaExternalDocument();
        break;
    case 0x524a415d:
        result = new TL_decryptedMessageMediaVideo_layer17();
        break;
    case 0x6080758f:
        result = new TL_decryptedMessageMediaAudio_layer8();
        break;
    case 0x32798a8c:
        result = new TL_decryptedMessageMediaPhoto_layer8();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 23482
```
switch(constructor) {
    case 0xc8d7493e:
        result = new TL_chatParticipant();
        break;
    case 0xda13538a:
        result = new TL_chatParticipantCreator();
        break;
    case 0xe2d6e436:
        result = new TL_chatParticipantAdmin();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 23609
```
switch(constructor) {
    case 0x3334b0f0:
        result = new TL_inputSecureFileUploaded();
        break;
    case 0x5367e5be:
        result = new TL_inputSecureFile();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 23730
```
switch(constructor) {
    case 0x1b7907ae:
        result = new TL_channelAdminLogEventActionToggleInvites();
        break;
    case 0xe9e82c18:
        result = new TL_channelAdminLogEventActionUpdatePinned();
        break;
    case 0x26ae0971:
        result = new TL_channelAdminLogEventActionToggleSignatures();
        break;
    case 0x55188a2e:
        result = new TL_channelAdminLogEventActionChangeAbout();
        break;
    case 0x709b2405:
        result = new TL_channelAdminLogEventActionEditMessage();
        break;
    case 0xd5676710:
        result = new TL_channelAdminLogEventActionParticipantToggleAdmin();
        break;
    case 0xb1c3caa7:
        result = new TL_channelAdminLogEventActionChangeStickerSet();
        break;
    case 0xe6dfb825:
        result = new TL_channelAdminLogEventActionChangeTitle();
        break;
    case 0x2df5fc0a:
        result = new TL_channelAdminLogEventActionDefaultBannedRights();
        break;
    case 0x5f5c95f1:
        result = new TL_channelAdminLogEventActionTogglePreHistoryHidden();
        break;
    case 0x8f079643:
        result = new TL_channelAdminLogEventActionStopPoll();
        break;
    case 0x42e047bb:
        result = new TL_channelAdminLogEventActionDeleteMessage();
        break;
    case 0xe31c34d8:
        result = new TL_channelAdminLogEventActionParticipantInvite();
        break;
    case 0xf89777f2:
        result = new TL_channelAdminLogEventActionParticipantLeave();
        break;
    case 0x6a4afc38:
        result = new TL_channelAdminLogEventActionChangeUsername();
        break;
    case 0xb82f55c3:
        result = new TL_channelAdminLogEventActionChangePhoto();
        break;
    case 0xe6d83d7e:
        result = new TL_channelAdminLogEventActionParticipantToggleBan();
        break;
    case 0x183040d3:
        result = new TL_channelAdminLogEventActionParticipantJoin();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 24068
```
switch(constructor) {
    case 0x9f2221c9:
        result = new TL_inputWebFileGeoPointLocation();
        break;
    case 0xc239d686:
        result = new TL_inputWebFileLocation();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 24253
```
switch(constructor) {
    case 0xfb0ccc41:
        result = new TL_chatForbidden_old();
        break;
    case 0x7312bc48:
        result = new TL_chat_old2();
        break;
    case 0x3bda1bde:
        result = new TL_chat();
        break;
    case 0x289da732:
        result = new TL_channelForbidden();
        break;
    case 0x8537784f:
        result = new TL_channelForbidden_layer67();
        break;
    case 0x4b1b7506:
        result = new TL_channel_layer48();
        break;
    case 0x2d85832c:
        result = new TL_channelForbidden_layer52();
        break;
    case 0x7328bdb:
        result = new TL_chatForbidden();
        break;
    case 0xa14dca52:
        result = new TL_channel_layer67();
        break;
    case 0x678e9587:
        result = new TL_channel_old();
        break;
    case 0x6e9c9bc7:
        result = new TL_chat_old();
        break;
    case 0x9ba2d800:
        result = new TL_chatEmpty();
        break;
    case 0xcb44b1c:
        result = new TL_channel_layer72();
        break;
    case 0x450b7115:
        result = new TL_channel_layer77();
        break;
    case 0x4df30834:
        result = new TL_channel();
        break;
    case 0xc88974ac:
        result = new TL_channel_layer92();
        break;
    case 0xd91cdd54:
        result = new TL_chat_layer92();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25121
```
switch(constructor) {
    case 0xa7a43b17:
        result = new TL_stickerSet_old();
        break;
    case 0x5585a139:
        result = new TL_stickerSet();
        break;
    case 0xcd303b41:
        result = new TL_stickerSet_layer75();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25235
```
switch(constructor) {
    case 0xaa963b05:
        result = new TL_storage_fileUnknown();
        break;
    case 0xb3cea0e4:
        result = new TL_storage_fileMp4();
        break;
    case 0x1081464c:
        result = new TL_storage_fileWebp();
        break;
    case 0xa4f63c0:
        result = new TL_storage_filePng();
        break;
    case 0xcae1aadf:
        result = new TL_storage_fileGif();
        break;
    case 0xae1e508d:
        result = new TL_storage_filePdf();
        break;
    case 0x528a0677:
        result = new TL_storage_fileMp3();
        break;
    case 0x7efe0e:
        result = new TL_storage_fileJpeg();
        break;
    case 0x4b09ebbc:
        result = new TL_storage_fileMov();
        break;
    case 0x40bc6f52:
        result = new TL_storage_filePartial();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25371
```
switch(constructor) {
    case 0x72a3158c:
        result = new TL_auth_codeTypeSms();
        break;
    case 0x741cd3e3:
        result = new TL_auth_codeTypeCall();
        break;
    case 0x226ccefb:
        result = new TL_auth_codeTypeFlashCall();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25425
```
switch(constructor) {
    case 0xffc86587:
        result = new TL_inputMessagesFilterGif();
        break;
    case 0x3751b49e:
        result = new TL_inputMessagesFilterMusic();
        break;
    case 0x3a20ecb8:
        result = new TL_inputMessagesFilterChatPhotos();
        break;
    case 0x9609a51c:
        result = new TL_inputMessagesFilterPhotos();
        break;
    case 0x7ef0dd87:
        result = new TL_inputMessagesFilterUrl();
        break;
    case 0x9eddf188:
        result = new TL_inputMessagesFilterDocument();
        break;
    case 0x56e9f0e4:
        result = new TL_inputMessagesFilterPhotoVideo();
        break;
    case 0xd95e73bb:
        result = new TL_inputMessagesFilterPhotoVideoDocuments();
        break;
    case 0xe7026d0d:
        result = new TL_inputMessagesFilterGeo();
        break;
    case 0xc1f8e69a:
        result = new TL_inputMessagesFilterMyMentions();
        break;
    case 0x7a7c17a4:
        result = new TL_inputMessagesFilterRoundVoice();
        break;
    case 0xe062db83:
        result = new TL_inputMessagesFilterContacts();
        break;
    case 0x50f5c392:
        result = new TL_inputMessagesFilterVoice();
        break;
    case 0x9fc00e65:
        result = new TL_inputMessagesFilterVideo();
        break;
    case 0x80c99768:
        result = new TL_inputMessagesFilterPhoneCalls();
        break;
    case 0x57e2f66c:
        result = new TL_inputMessagesFilterEmpty();
        break;
    case 0xb549da53:
        result = new TL_inputMessagesFilterRoundVideo();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25652
```
switch(constructor) {
    case 0x5e068047:
        result = new TL_pageListOrderedItemText();
        break;
    case 0x98dd8936:
        result = new TL_pageListOrderedItemBlocks();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25793
```
switch(constructor) {
    case 0xfadff4ac:
        result = new TL_messageFwdHeader_layer72();
        break;
    case 0x559ebe6d:
        result = new TL_messageFwdHeader();
        break;
    case 0xc786ddcb:
        result = new TL_messageFwdHeader_layer68();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 25951
```
switch(constructor) {
    case 0x7c596b46:
        result = new TL_fileLocationUnavailable();
        break;
    case 0x91d11eb:
        result = new TL_fileLocation();
        break;
    case 0x53d69076:
        result = new TL_fileLocation_layer82();
        break;
    case 0x55555554:
        result = new TL_fileEncryptedLocation();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26065
```
switch(constructor) {
    case 0xe8025ca2:
        result = new TL_messages_savedGifsNotModified();
        break;
    case 0x2e0709a5:
        result = new TL_messages_savedGifs();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26137
```
switch(constructor) {
    case 0x77bfb61b:
        result = new TL_photoSize();
        break;
    case 0xe17e23c:
        result = new TL_photoSizeEmpty();
        break;
    case 0xe0b0bc2e:
        result = new TL_photoStrippedSize();
        break;
    case 0xe9a734fa:
        result = new TL_photoCachedSize();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26269
```
switch(constructor) {
    case 0xfc2e05bc:
        result = new TL_chatInviteExported();
        break;
    case 0x69df3769:
        result = new TL_chatInviteEmpty();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26318
```
switch(constructor) {
    case 0xfa4f0bb5:
        result = new TL_inputFileBig();
        break;
    case 0xf52ff27f:
        result = new TL_inputFile();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26591
```
switch(constructor) {
    case 0x74ae4240:
        result = new TL_updates();
        break;
    case 0x914fbf11:
        result = new TL_updateShortMessage();
        break;
    case 0x11f1331c:
        result = new TL_updateShortSentMessage();
        break;
    case 0x78d4dec1:
        result = new TL_updateShort();
        break;
    case 0x16812688:
        result = new TL_updateShortChatMessage();
        break;
    case 0x725b04c3:
        result = new TL_updatesCombined();
        break;
    case 0xe317af7e:
        result = new TL_updatesTooLong();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 26878
```
switch(constructor) {
    case 0xa437c3ed:
        result = new TL_wallPaper();
        break;
    case 0xf04f91ec:
        result = new TL_wallPaper_layer94();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27003
```
switch(constructor) {
    case 0x25e073fc:
        result = new TL_pageListItemBlocks();
        break;
    case 0xb92fb6cd:
        result = new TL_pageListItemText();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27153
```
switch(constructor) {
    case 0x8953ad37:
        result = new TL_inputChatPhoto();
        break;
    case 0x1ca48f57:
        result = new TL_inputChatPhotoEmpty();
        break;
    case 0x927c55b4:
        result = new TL_inputChatUploadedPhoto();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27290
```
switch(constructor) {
    case 0x1cd7bf0d:
        result = new TL_inputPhotoEmpty();
        break;
    case 0x3bb3b94a:
        result = new TL_inputPhoto();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27398
```
switch(constructor) {
    case 0x22f3afb3:
        result = new TL_messages_recentStickers();
        break;
    case 0xb17f890:
        result = new TL_messages_recentStickersNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27603
```
switch(constructor) {
    case 0xf1749a22:
        result = new TL_messages_stickersNotModified();
        break;
    case 0xe4599bbd:
        result = new TL_messages_stickers();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27675
```
switch(constructor) {
    case 0x7b8e7de6:
        result = new TL_inputPeerUser();
        break;
    case 0x179be863:
        result = new TL_inputPeerChat();
        break;
    case 0x7f3b18ea:
        result = new TL_inputPeerEmpty();
        break;
    case 0x7da07ec9:
        result = new TL_inputPeerSelf();
        break;
    case 0x20adaef8:
        result = new TL_inputPeerChannel();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 27770
```
switch(constructor) {
    case 0xbfb9f457:
        result = new TL_help_passportConfigNotModified();
        break;
    case 0xa098d6af:
        result = new TL_help_passportConfig();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 28036
```
switch(constructor) {
    case 0x419b0df2:
        result = new TL_groupCallParticipantLeft();
        break;
    case 0x4f0b39b8:
        result = new TL_groupCallParticipantAdmin();
        break;
    case 0x589db397:
        result = new TL_groupCallParticipant();
        break;
    case 0x377496f0:
        result = new TL_groupCallParticipantInvited();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 28333
```
switch(constructor) {
    case 0x15ba6c40:
        result = new TL_messages_dialogs();
        break;
    case 0x71e094f3:
        result = new TL_messages_dialogsSlice();
        break;
    case 0xf0e3e596:
        result = new TL_messages_dialogsNotModified();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 33758
```
switch(constructor) {
    case 0x1ccb966a:
        result = new TL_textPhone();
        break;
    case 0xc7fb5e01:
        result = new TL_textSuperscript();
        break;
    case 0x81ccf4f:
        result = new TL_textImage();
        break;
    case 0xc12622c4:
        result = new TL_textUnderline();
        break;
    case 0xed6a8504:
        result = new TL_textSubscript();
        break;
    case 0x3c2884c1:
        result = new TL_textUrl();
        break;
    case 0x35553762:
        result = new TL_textAnchor();
        break;
    case 0xdc3d824f:
        result = new TL_textEmpty();
        break;
    case 0xde5a0dd6:
        result = new TL_textEmail();
        break;
    case 0x744694e0:
        result = new TL_textPlain();
        break;
    case 0x6724abc4:
        result = new TL_textBold();
        break;
    case 0x9bf8bb95:
        result = new TL_textStrike();
        break;
    case 0x7e6260d7:
        result = new TL_textConcat();
        break;
    case 0xd912a59c:
        result = new TL_textItalic();
        break;
    case 0x34b8621:
        result = new TL_textMarked();
        break;
    case 0x6c3f19b9:
        result = new TL_textFixed();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 33891
```
switch(constructor) {
    case 0x29632a36:
        result = new TL_messageMediaUnsupported_old();
        break;
    case 0xc6b68300:
        result = new TL_messageMediaAudio_layer45();
        break;
    case 0xc8c45a2a:
        result = new TL_messageMediaPhoto_old();
        break;
    case 0x84551347:
        result = new TL_messageMediaInvoice();
        break;
    case 0x9f84f49e:
        result = new TL_messageMediaUnsupported();
        break;
    case 0x3ded6320:
        result = new TL_messageMediaEmpty();
        break;
    case 0x7912b71f:
        result = new TL_messageMediaVenue_layer71();
        break;
    case 0x7c3c2609:
        result = new TL_messageMediaGeoLive();
        break;
    case 0x2ec0533f:
        result = new TL_messageMediaVenue();
        break;
    case 0xa2d24290:
        result = new TL_messageMediaVideo_old();
        break;
    case 0x2fda2204:
        result = new TL_messageMediaDocument_old();
        break;
    case 0xf3e02ea8:
        result = new TL_messageMediaDocument_layer68();
        break;
    case 0xfdb19008:
        result = new TL_messageMediaGame();
        break;
    case 0x7c4414d3:
        result = new TL_messageMediaDocument_layer74();
        break;
    case 0x5e7d2f39:
        result = new TL_messageMediaContact_layer81();
        break;
    case 0x695150d7:
        result = new TL_messageMediaPhoto();
        break;
    case 0x4bd6e798:
        result = new TL_messageMediaPoll();
        break;
    case 0xb5223b0f:
        result = new TL_messageMediaPhoto_layer74();
        break;
    case 0x3d8ce53d:
        result = new TL_messageMediaPhoto_layer68();
        break;
    case 0x5bcf1675:
        result = new TL_messageMediaVideo_layer45();
        break;
    case 0x56e0d474:
        result = new TL_messageMediaGeo();
        break;
    case 0xa32dd600:
        result = new TL_messageMediaWebPage();
        break;
    case 0x9cb070d7:
        result = new TL_messageMediaDocument();
        break;
    case 0xcbf24940:
        result = new TL_messageMediaContact();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 34317
```
switch(constructor) {
    case 0xfda9a7b7:
        result = new TL_encryptedChatRequested_old();
        break;
    case 0xc878527e:
        result = new TL_encryptedChatRequested();
        break;
    case 0xfa56ce36:
        result = new TL_encryptedChat();
        break;
    case 0x6601d14f:
        result = new TL_encryptedChat_old();
        break;
    case 0xab7ec0a0:
        result = new TL_encryptedChatEmpty();
        break;
    case 0x3bf703dc:
        result = new TL_encryptedChatWaiting();
        break;
    case 0x13d6dd27:
        result = new TL_encryptedChatDiscarded();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 34396
```
switch(constructor) {
    case 0x1d86f70e:
        result = new TL_messageService_old2();
        break;
    case 0xa7ab1991:
        result = new TL_message_old3();
        break;
    case 0xc3060325:
        result = new TL_message_old4();
        break;
    case 0x555555fa:
        result = new TL_message_secret();
        break;
    case 0x555555f9:
        result = new TL_message_secret_layer72();
        break;
    case 0x90dddc11:
        result = new TL_message_layer72();
        break;
    case 0xc09be45f:
        result = new TL_message_layer68();
        break;
    case 0xc992e15c:
        result = new TL_message_layer47();
        break;
    case 0x5ba66c13:
        result = new TL_message_old7();
        break;
    case 0xc06b9607:
        result = new TL_messageService_layer48();
        break;
    case 0x83e5de54:
        result = new TL_messageEmpty();
        break;
    case 0x2bebfa86:
        result = new TL_message_old6();
        break;
    case 0x44f9b43d:
        result = new TL_message();
        break;
    case 0xa367e716:
        // custom
        result = new TL_messageForwarded_old2();
        break;
    case 0x5f46804:
        // custom
        result = new TL_messageForwarded_old();
        break;
    case 0x567699b3:
        // custom
        result = new TL_message_old2();
        break;
    case 0x9f8d60bb:
        // custom
        result = new TL_messageService_old();
        break;
    case 0x22eb6aba:
        // custom
        result = new TL_message_old();
        break;
    case 0x555555F8:
        // custom
        result = new TL_message_secret_old();
        break;
    case 0x9e19a1f6:
        result = new TL_messageService();
        break;
    case 0xf07814c8:
        // custom
        result = new TL_message_old5();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 36307
```
switch(constructor) {
    case 0x96a18d5:
        result = new TL_upload_file();
        break;
    case 0xf18cda44:
        result = new TL_upload_fileCdnRedirect();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\tgnet\TLRPC.java
### Line: 36331
```
switch(constructor) {
    case 0xa99fca4f:
        result = new TL_upload_cdnFile();
        break;
    case 0xeea8e46e:
        result = new TL_upload_cdnFileReuploadNeeded();
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\ChatRightsEditActivity.java
### Line: 377
```
switch(a) {
    case 0:
        text = LocaleController.getString("UserRestrictionsUntilForever", R.string.UserRestrictionsUntilForever);
        break;
    case 1:
        text = LocaleController.formatPluralString("Days", 1);
        break;
    case 2:
        text = LocaleController.formatPluralString("Weeks", 1);
        break;
    case 3:
        text = LocaleController.formatPluralString("Months", 1);
        break;
    case 4:
    default:
        text = LocaleController.getString("NotificationsCustom", R.string.NotificationsCustom);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\ChatAttachAlert.java
### Line: 1845
```
switch(exif) {
    case ExifInterface.ORIENTATION_ROTATE_90:
        orientation = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
        orientation = 180;
        break;
    case ExifInterface.ORIENTATION_ROTATE_270:
        orientation = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\ChatAttachAlert.java
### Line: 1146
```
switch(exif) {
    case ExifInterface.ORIENTATION_ROTATE_90:
        orientation = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
        orientation = 180;
        break;
    case ExifInterface.ORIENTATION_ROTATE_270:
        orientation = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\EmojiView.java
### Line: 314
```
switch(pickerView.getSelection()) {
    case 1:
        color = "\uD83C\uDFFB";
        break;
    case 2:
        color = "\uD83C\uDFFC";
        break;
    case 3:
        color = "\uD83C\uDFFD";
        break;
    case 4:
        color = "\uD83C\uDFFE";
        break;
    case 5:
        color = "\uD83C\uDFFF";
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\ImageUpdater.java
### Line: 339
```
switch(exif) {
    case ExifInterface.ORIENTATION_ROTATE_90:
        orientation = 90;
        break;
    case ExifInterface.ORIENTATION_ROTATE_180:
        orientation = 180;
        break;
    case ExifInterface.ORIENTATION_ROTATE_270:
        orientation = 270;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\PhotoFilterCurvesControl.java
### Line: 285
```
switch(a) {
    case 0:
        str = String.format(Locale.US, "%.2f", curvesValue.blacksLevel / 100.0f);
        break;
    case 1:
        str = String.format(Locale.US, "%.2f", curvesValue.shadowsLevel / 100.0f);
        break;
    case 2:
        str = String.format(Locale.US, "%.2f", curvesValue.midtonesLevel / 100.0f);
        break;
    case 3:
        str = String.format(Locale.US, "%.2f", curvesValue.highlightsLevel / 100.0f);
        break;
    case 4:
        str = String.format(Locale.US, "%.2f", curvesValue.whitesLevel / 100.0f);
        break;
    default:
        str = "";
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\PhotoFilterCurvesControl.java
### Line: 161
```
switch(this.curveValue.activeType) {
    case PhotoFilterView.CurvesToolValue.CurvesTypeLuminance:
        curveValue = this.curveValue.luminanceCurve;
        break;
    case PhotoFilterView.CurvesToolValue.CurvesTypeRed:
        curveValue = this.curveValue.redCurve;
        break;
    case PhotoFilterView.CurvesToolValue.CurvesTypeGreen:
        curveValue = this.curveValue.greenCurve;
        break;
    case PhotoFilterView.CurvesToolValue.CurvesTypeBlue:
        curveValue = this.curveValue.blueCurve;
        break;
    default:
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\StickerMasksView.java
### Line: 400
```
switch(viewType) {
    case 0:
        view = new StickerEmojiCell(context) {

            public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82), MeasureSpec.EXACTLY));
            }
        };
        break;
    case 1:
        view = new EmptyCell(context);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\StickersAlert.java
### Line: 829
```
switch(viewType) {
    case 0:
        view = new StickerEmojiCell(context) {

            public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(itemSize, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82), MeasureSpec.EXACTLY));
            }
        };
        break;
    case 1:
        view = new EmptyCell(context);
        break;
    case 2:
        view = new FeaturedStickerSetInfoCell(context, 8);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\VideoPlayer.java
### Line: 232
```
switch(type) {
    case "dash":
        mediaSource = new DashMediaSource(uri, mediaDataSourceFactory, new DefaultDashChunkSource.Factory(mediaDataSourceFactory), mainHandler, null);
        break;
    case "hls":
        mediaSource = new HlsMediaSource(uri, mediaDataSourceFactory, mainHandler, null);
        break;
    case "ss":
        mediaSource = new SsMediaSource(uri, mediaDataSourceFactory, new DefaultSsChunkSource.Factory(mediaDataSourceFactory), mainHandler, null);
        break;
    default:
        mediaSource = new ExtractorMediaSource(uri, mediaDataSourceFactory, new DefaultExtractorsFactory(), mainHandler, null);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\VideoPlayer.java
### Line: 200
```
switch(type) {
    case "dash":
        mediaSource = new DashMediaSource(uri, mediaDataSourceFactory, new DefaultDashChunkSource.Factory(mediaDataSourceFactory), mainHandler, null);
        break;
    case "hls":
        mediaSource = new HlsMediaSource(uri, mediaDataSourceFactory, mainHandler, null);
        break;
    case "ss":
        mediaSource = new SsMediaSource(uri, mediaDataSourceFactory, new DefaultSsChunkSource.Factory(mediaDataSourceFactory), mainHandler, null);
        break;
    default:
        mediaSource = new ExtractorMediaSource(uri, mediaDataSourceFactory, new DefaultExtractorsFactory(), mainHandler, null);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\Components\voip\VoIPHelper.java
### Line: 258
```
switch(i) {
    case 0:
        label = LocaleController.getString("RateCallEcho", R.string.RateCallEcho);
        break;
    case 1:
        label = LocaleController.getString("RateCallNoise", R.string.RateCallNoise);
        break;
    case 2:
        label = LocaleController.getString("RateCallInterruptions", R.string.RateCallInterruptions);
        break;
    case 3:
        label = LocaleController.getString("RateCallDistorted", R.string.RateCallDistorted);
        break;
    case 4:
        label = LocaleController.getString("RateCallSilentLocal", R.string.RateCallSilentLocal);
        break;
    case 5:
        label = LocaleController.getString("RateCallSilentRemote", R.string.RateCallSilentRemote);
        break;
    case 6:
        label = LocaleController.getString("RateCallDropped", R.string.RateCallDropped);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\DataSettingsActivity.java
### Line: 364
```
switch(preferences.getInt("VoipDataSaving", VoIPController.DATA_SAVING_NEVER)) {
    case VoIPController.DATA_SAVING_NEVER:
        value = LocaleController.getString("UseLessDataNever", R.string.UseLessDataNever);
        break;
    case VoIPController.DATA_SAVING_MOBILE:
        value = LocaleController.getString("UseLessDataOnMobile", R.string.UseLessDataOnMobile);
        break;
    case VoIPController.DATA_SAVING_ALWAYS:
        value = LocaleController.getString("UseLessDataAlways", R.string.UseLessDataAlways);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\DataSettingsActivity.java
### Line: 236
```
switch(which) {
    case 0:
        val = VoIPController.DATA_SAVING_NEVER;
        break;
    case 1:
        val = VoIPController.DATA_SAVING_MOBILE;
        break;
    case 2:
        val = VoIPController.DATA_SAVING_ALWAYS;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\GroupCreateActivity.java
### Line: 958
```
switch(viewType) {
    case 0:
        view = new GroupCreateSectionCell(context);
        break;
    default:
        view = new GroupCreateUserCell(context, true, 0);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\PassportActivity.java
### Line: 3780
```
switch(a) {
    case FIELD_STREET1:
        key = "street_line1";
        break;
    case FIELD_STREET2:
        key = "street_line2";
        break;
    case FIELD_CITY:
        key = "city";
        break;
    case FIELD_STATE:
        key = "state";
        break;
    case FIELD_COUNTRY:
        key = "country_code";
        break;
    case FIELD_POSTCODE:
        key = "post_code";
        break;
    default:
        key = null;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\PassportActivity.java
### Line: 3731
```
switch(a) {
    case FIELD_NAME:
        key = "first_name";
        break;
    case FIELD_MIDNAME:
        key = "middle_name";
        break;
    case FIELD_SURNAME:
        key = "last_name";
        break;
    case FIELD_BIRTHDAY:
        key = "birth_date";
        break;
    case FIELD_GENDER:
        key = "gender";
        break;
    case FIELD_CITIZENSHIP:
        key = "country_code";
        break;
    case FIELD_RESIDENCE:
        key = "residence_country_code";
        break;
    case FIELD_CARDNUMBER:
        key = "document_no";
        break;
    case FIELD_EXPIRE:
        key = "expiry_date";
        break;
    default:
        key = null;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\PassportActivity.java
### Line: 3764
```
switch(a) {
    case FIELD_NATIVE_NAME:
        key = "first_name_native";
        break;
    case FIELD_NATIVE_MIDNAME:
        key = "middle_name_native";
        break;
    case FIELD_NATIVE_SURNAME:
        key = "last_name_native";
        break;
    default:
        key = null;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\PrivacySettingsActivity.java
### Line: 655
```
switch(SharedConfig.mapPreviewType) {
    case 0:
        value = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
        break;
    case 1:
        value = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
        break;
    case 2:
    default:
        value = LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\SettingsActivity.java
### Line: 1293
```
switch(pInfo.versionCode % 10) {
    case 1:
    case 3:
        abi = "arm-v7a";
        break;
    case 2:
    case 4:
        abi = "x86";
        break;
    case 5:
    case 7:
        abi = "arm64-v8a";
        break;
    case 6:
    case 8:
        abi = "x86_64";
        break;
    case 0:
    case 9:
        abi = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\SettingsActivity.java
### Line: 383
```
switch(a) {
    case 0:
        text = LocaleController.getString("AskAQuestion", R.string.AskAQuestion);
        break;
    case 1:
        text = LocaleController.getString("TelegramFAQ", R.string.TelegramFAQ);
        break;
    case 2:
        text = LocaleController.getString("PrivacyPolicy", R.string.PrivacyPolicy);
        break;
    case 3:
        text = LocaleController.getString("DebugSendLogs", R.string.DebugSendLogs);
        break;
    case 4:
        text = LocaleController.getString("DebugClearLogs", R.string.DebugClearLogs);
        break;
    case 5:
    default:
        text = "Switch Backend";
        break;
}
```

## Telegram\TMessagesProj\src\main\java\org\telegram\ui\StickersActivity.java
### Line: 407
```
switch(SharedConfig.suggestStickers) {
    case 0:
        value = LocaleController.getString("SuggestStickersAll", R.string.SuggestStickersAll);
        break;
    case 1:
        value = LocaleController.getString("SuggestStickersInstalled", R.string.SuggestStickersInstalled);
        break;
    case 2:
    default:
        value = LocaleController.getString("SuggestStickersNone", R.string.SuggestStickersNone);
        break;
}
```

## tinker\third-party\aosp-dexutils\src\main\java\com\tencent\tinker\android\dx\util\Hex.java
### Line: 274
```
switch(addressLength) {
    case 2:
        astr = Hex.u1(outOffset);
        break;
    case 4:
        astr = Hex.u2(outOffset);
        break;
    case 6:
        astr = Hex.u3(outOffset);
        break;
    default:
        astr = Hex.u4(outOffset);
        break;
}
```

## tinker\tinker-android\tinker-android-lib\src\main\java\com\tencent\tinker\lib\tinker\TinkerLoadResult.java
### Line: 125
```
switch(loadCode) {
    case ShareConstants.ERROR_LOAD_PATCH_UNKNOWN_EXCEPTION:
        errorCode = ShareConstants.ERROR_LOAD_EXCEPTION_UNKNOWN;
        break;
    case ShareConstants.ERROR_LOAD_PATCH_VERSION_DEX_LOAD_EXCEPTION:
        errorCode = ShareConstants.ERROR_LOAD_EXCEPTION_DEX;
        break;
    case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_LOAD_EXCEPTION:
        errorCode = ShareConstants.ERROR_LOAD_EXCEPTION_RESOURCE;
        break;
    case ShareConstants.ERROR_LOAD_PATCH_UNCAUGHT_EXCEPTION:
        errorCode = ShareConstants.ERROR_LOAD_EXCEPTION_UNCAUGHT;
        break;
}
```

## tinker\tinker-build\tinker-patch-lib\src\main\java\com\tencent\tinker\build\aapt\AaptUtil.java
### Line: 225
```
switch(rType) {
    case STRING:
    case COLOR:
    case DIMEN:
    case DRAWABLE:
    case BOOL:
    case INTEGER:
        resourceValue = node.getTextContent().trim();
        break;
    // has sub item
    case ARRAY:
    // has sub item
    case PLURALS:
    // has sub item
    case STYLE:
    case // has sub item
    STYLEABLE:
        resourceValue = subNodeToString(node);
        break;
    case // no sub item
    FRACTION:
        resourceValue = nodeToString(node, true);
        break;
    case // no sub item
    ATTR:
        resourceValue = nodeToString(node, true);
        break;
}
```

## tinker\tinker-build\tinker-patch-lib\src\main\java\com\tencent\tinker\build\decoder\ResDiffDecoder.java
### Line: 492
```
switch(mode) {
    case TypedValue.ADD:
        title = TypedValue.ADD_TITLE + set.size();
        break;
    case TypedValue.MOD:
        title = TypedValue.MOD_TITLE + set.size();
        break;
    case TypedValue.LARGE_MOD:
        title = TypedValue.LARGE_MOD_TITLE + set.size();
        break;
    case TypedValue.DEL:
        title = TypedValue.DEL_TITLE + set.size();
        break;
    case TypedValue.STORED:
        title = TypedValue.STORE_TITLE + set.size();
        break;
}
```

## tutorials\core-java-lang-syntax\src\main\java\com\baeldung\switchstatement\SwitchStatement.java
### Line: 23
```
switch(animal) {
    case "DOG":
    case "CAT":
        result = "domestic animal";
        break;
    case "TIGER":
        result = "wild animal";
        break;
    default:
        result = "unknown animal";
        break;
}
```

## tutorials\patterns\design-patterns\src\main\java\com\baeldung\interpreter\Context.java
### Line: 92
```
switch(column) {
    case "*":
        colIndex = -1;
        break;
    case "name":
        colIndex = 0;
        break;
    case "surname":
        colIndex = 1;
        break;
}
```

## tutorials\performance-tests\src\main\java\com\baeldung\performancetests\model\destination\Order.java
### Line: 167
```
switch(status) {
    case CREATED:
        orderStatus = OrderStatus.CREATED;
        break;
    case FINISHED:
        orderStatus = OrderStatus.FINISHED;
        break;
    case CONFIRMED:
        orderStatus = OrderStatus.CONFIRMED;
        break;
    case COLLECTING:
        orderStatus = OrderStatus.COLLECTING;
        break;
    case IN_TRANSPORT:
        orderStatus = OrderStatus.IN_TRANSPORT;
        break;
}
```

## tutorials\performance-tests\src\main\java\com\baeldung\performancetests\model\destination\Order.java
### Line: 193
```
switch(type) {
    case CARD:
        paymentType = PaymentType.CARD;
        break;
    case CASH:
        paymentType = PaymentType.CASH;
        break;
    case TRANSFER:
        paymentType = PaymentType.TRANSFER;
        break;
}
```

## tutorials\performance-tests\src\main\java\com\baeldung\performancetests\model\destination\User.java
### Line: 73
```
switch(status) {
    case ACTIVE:
        accountStatus = AccountStatus.ACTIVE;
        break;
    case NOT_ACTIVE:
        accountStatus = AccountStatus.NOT_ACTIVE;
        break;
    case BANNED:
        accountStatus = AccountStatus.BANNED;
        break;
}
```

## tutorials\vavr\src\test\java\com\baeldung\vavr\VavrUnitTest.java
### Line: 313
```
switch(input) {
    case 0:
        output = "zero";
        break;
    case 1:
        output = "one";
        break;
    case 2:
        output = "two";
        break;
    case 3:
        output = "three";
        break;
    default:
        output = "unknown";
        break;
}
```

## uCrop\sample\src\main\java\com\yalantis\ucrop\sample\SampleActivity.java
### Line: 252
```
switch(mRadioGroupCompressionSettings.getCheckedRadioButtonId()) {
    case R.id.radio_png:
        destinationFileName += ".png";
        break;
    case R.id.radio_jpeg:
        destinationFileName += ".jpg";
        break;
}
```

## vert.x\src\main\java\io\vertx\core\http\impl\HttpClientImpl.java
### Line: 118
```
switch(options.getProtocolVersion()) {
    case HTTP_2:
        alpnVersions = Arrays.asList(HttpVersion.HTTP_2, HttpVersion.HTTP_1_1);
        break;
    default:
        alpnVersions = Collections.singletonList(options.getProtocolVersion());
        break;
}
```

## vert.x\src\main\java\io\vertx\core\net\impl\ChannelProvider.java
### Line: 178
```
switch(proxyType) {
    default:
    case HTTP:
        proxy = proxyUsername != null && proxyPassword != null ? new HttpProxyHandler(proxyAddr, proxyUsername, proxyPassword) : new HttpProxyHandler(proxyAddr);
        break;
    case SOCKS5:
        proxy = proxyUsername != null && proxyPassword != null ? new Socks5ProxyHandler(proxyAddr, proxyUsername, proxyPassword) : new Socks5ProxyHandler(proxyAddr);
        break;
    case SOCKS4:
        // SOCKS4 only supports a username and could authenticate the user via Ident
        proxy = proxyUsername != null ? new Socks4ProxyHandler(proxyAddr, proxyUsername) : new Socks4ProxyHandler(proxyAddr);
        break;
}
```

## zxing\core\src\main\java\com\google\zxing\oned\CodaBarWriter.java
### Line: 85
```
// The start/end chars are not in the CodaBarReader.ALPHABET.
switch(c) {
    case 'T':
        c = 'A';
        break;
    case 'N':
        c = 'B';
        break;
    case '*':
        c = 'C';
        break;
    case 'E':
        c = 'D';
        break;
}
```

## zxing\core\src\main\java\com\google\zxing\oned\Code128Writer.java
### Line: 158
```
// No, we don't have a code set
switch(newCodeSet) {
    case CODE_CODE_A:
        patternIndex = CODE_START_A;
        break;
    case CODE_CODE_B:
        patternIndex = CODE_START_B;
        break;
    default:
        patternIndex = CODE_START_C;
        break;
}
```

