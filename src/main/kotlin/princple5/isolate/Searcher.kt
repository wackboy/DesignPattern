package princple5.isolate

class Searcher(
    override val prettyGirl: PrettyGirl
) : AbstractSearcher() {

    override fun show() {
        prettyGirl.goodLooking()
        prettyGirl.niceFinger()
        prettyGirl.greatTemperament()
    }

}

abstract class AbstractSearcher {

    abstract val prettyGirl: PrettyGirl

    abstract fun show()

}